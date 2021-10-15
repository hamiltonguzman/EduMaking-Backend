package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Pais;

public interface PaisService {
	public List<Pais>findAll();
	
	public Optional<Pais>findById(String id);
	
	public Pais save(Pais pais);
	
	public void deleteById(String id);
}
