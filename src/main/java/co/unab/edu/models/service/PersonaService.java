package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Persona;

public interface PersonaService {
	public List<Persona>findAll();
	
	public Optional<Persona>findById(Integer id);
	
	public Persona save(Persona persona);
	
	public void deleteById(Integer id);
}
