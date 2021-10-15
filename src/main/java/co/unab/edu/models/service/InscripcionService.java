package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Inscripcion;

public interface InscripcionService {
	public List<Inscripcion>findAll();
	
	public Optional<Inscripcion>findById(Integer id);
	
	public Inscripcion save(Inscripcion inscripcion);
	
	public void deleteById(Integer id);
}