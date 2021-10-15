package co.unab.edu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.unab.edu.security.JWTUtil;
import co.unab.edu.models.entity.Usuario;
import co.unab.edu.models.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired 
	private JWTUtil jwtUtil;
	
	@GetMapping("{id}")
	public Optional<Usuario> buscarPorId(@PathVariable Integer id) {
		return usuarioService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Usuario> listar() {
		return  usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PutMapping("/actualizar/{id}")
	public Usuario actualizar(@RequestBody Usuario usuario, @PathVariable Integer id) {
		Usuario UsuarioBD = usuarioService.findById(id).get();
		
		UsuarioBD.setNombre(usuario.getNombre());
		UsuarioBD.setEstado(usuario.getEstado());
		UsuarioBD.setPassword(usuario.getPassword());
		UsuarioBD.setEmail(usuario.getEmail());
		
		usuarioService.save(UsuarioBD);
		return usuario;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		usuarioService.deleteById(id);
	}
	
	@GetMapping("/validar")
	public String validar(@RequestBody Usuario usuario) {
		
		String email= usuario.getEmail();
		String ctr= usuario.getPassword();
	
		Usuario user= usuarioService.findById(usuarioService.ConsultarPorCredenciales(ctr, email)).get();
		
		if(user != null) {
			//crear jwt
			String token =jwtUtil.crearToken(String.valueOf(user.getId()), user.getEmail());
				return token;
		}else {
			return"incorrecto";
			
		}
	
	}
}
