package co.unab.edu.security;

import java.security.Key;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
	@Value("${security.jwt.secret}")
	private String key;
	
	@Value("${security.jwt.issuer}")
	private String issuer;

	@Value("${security.jwt.ttlMillis}")
	private long ttlMillis;
	
	public String crearToken(String id, String email) {
		// seleccionar el algoritmo de generación del token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		// capturar momento de log
		long nowMillis = System.currentTimeMillis();
		Date now = new Date(nowMillis);

		// aplicar clave secreta
		byte[] apiKeySecretByte = DatatypeConverter.parseBase64Binary(key);

		// encriptar llave
		Key signingKey = new SecretKeySpec(apiKeySecretByte, signatureAlgorithm.getJcaName());

		// conformar el token con sus tres partes
		@SuppressWarnings("deprecation")
		JwtBuilder builder = Jwts.builder().setId(id)
							.setIssuedAt(now)
							.setSubject(email)
							.setIssuer(issuer)
							.signWith(signatureAlgorithm, signingKey);

		if (ttlMillis >= 0) {
			long expMillis = nowMillis + ttlMillis;
			Date exp = new Date(expMillis);
			builder.setExpiration(exp);
		}

		// construye jwt serializado Ya compacto - URL guardada como String
		return builder.compact();
	}
	
	// lee y valida el email del jwt
	public String getValue(String jwt) {
		// valida un jws firmado o si no genera una excepcion.
		//Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(key)).parseClaimsJws(jwt)
		//		.getBody();
		@SuppressWarnings("deprecation")
		Claims claims = (Claims) Jwts.parser().setSigningKey(key).parseClaimsJws(jwt);
				
		return claims.getSubject();
	}

	// validar el id del jwt
	public String getKey(String jwt) {
		//Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(key)).parseClaimsJws(jwt)
			//	.getBody();
		
		@SuppressWarnings("deprecation")
		Claims claims = (Claims) Jwts.parser().setSigningKey(key).parseClaimsJws(jwt);
		
		return claims.getId();
	}
}
