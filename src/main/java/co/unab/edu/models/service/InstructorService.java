package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import co.unab.edu.models.entity.Instructor;

public interface InstructorService {
	public List<Instructor>findAll();
	
	public Optional<Instructor>findById(Integer id);
	
	public Instructor save(Instructor instructor);
	
	public void deleteById(Integer id);
}
