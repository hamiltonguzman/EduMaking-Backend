package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Usuario;
import co.unab.edu.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void deleteById(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	@Override
	public Integer ConsultarPorCredenciales(String contraseña, String email) {
		
		return usuarioRepository.ConsultarPorCredenciales(contraseña, email);
	}

}
