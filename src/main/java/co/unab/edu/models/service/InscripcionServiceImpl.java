package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Inscripcion;
import co.unab.edu.repository.InscripcionRepository;

@Service
public class InscripcionServiceImpl implements InscripcionService {
	@Autowired
	private InscripcionRepository inscripcionRepository;
	
	@Override
	public List<Inscripcion> findAll() {
		return inscripcionRepository.findAll();
	}

	@Override
	public Optional<Inscripcion> findById(Integer id) {
		return inscripcionRepository.findById(id);
	}

	@Override
	public Inscripcion save(Inscripcion inscripcion) {
		return inscripcionRepository.save(inscripcion);
	}

	@Override
	public void deleteById(Integer id) {
		inscripcionRepository.deleteById(id);
	}
}