package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Ciudad;

public interface CiudadService {
	public List<Ciudad>findAll();
	
	public Optional<Ciudad>findById(Integer id);
	
	public Ciudad save(Ciudad ciudad);
	
	public void deleteById(Integer id);
}
