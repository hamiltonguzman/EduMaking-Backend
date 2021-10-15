package co.unab.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import co.unab.edu.models.entity.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	@Query(value = "select u.id_Usuario from usuarios u where u.pwd_usuario=?1 and u.email_usuario=?2", nativeQuery = true)
	public Integer ConsultarPorCredenciales(String ctr, String email);
}
