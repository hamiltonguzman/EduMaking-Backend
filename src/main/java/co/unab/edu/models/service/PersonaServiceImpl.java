package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Persona;
import co.unab.edu.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public Optional<Persona> findById(Integer id) {
		return personaRepository.findById(id);
	}

	@Override
	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public void deleteById(Integer id) {
		personaRepository.deleteById(id);
	}
}
