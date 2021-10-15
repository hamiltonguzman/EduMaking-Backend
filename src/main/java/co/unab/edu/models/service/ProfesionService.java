package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Profesion;

public interface ProfesionService {
	public List<Profesion>findAll();
	
	public Optional<Profesion>findById(Integer id);
	
	public Profesion save(Profesion profesion);
	
	public void deleteById(Integer id);
}
