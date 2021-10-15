package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Profesion;
import co.unab.edu.repository.ProfesionRepository;

@Service
public class ProfesionServiceImpl implements ProfesionService {
	@Autowired
	private ProfesionRepository profesionRepository;
	
	@Override
	public List<Profesion> findAll() {
		return profesionRepository.findAll();
	}

	@Override
	public Optional<Profesion> findById(Integer id) {
		return profesionRepository.findById(id);
	}

	@Override
	public Profesion save(Profesion profesion) {
		return profesionRepository.save(profesion);
	}

	@Override
	public void deleteById(Integer id) {
		profesionRepository.deleteById(id);
	}

}
