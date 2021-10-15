package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Curso;

public interface CursoService {
	public List<Curso>findAll();
	
	public Optional<Curso>findById(String id);
	
	public Curso save(Curso curso);
	
	public void deleteById(String id);
}
