package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Instructor;
import co.unab.edu.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService {
	@Autowired
	private InstructorRepository instructorRepository;
	
	@Override
	public List<Instructor> findAll() {
		return instructorRepository.findAll();
	}

	@Override
	public Optional<Instructor> findById(Integer id) {
		return instructorRepository.findById(id);
	}

	@Override
	public Instructor save(Instructor instructor) {
		return instructorRepository.save(instructor);
	}

	@Override
	public void deleteById(Integer id) {
		instructorRepository.deleteById(id);
	}
}
