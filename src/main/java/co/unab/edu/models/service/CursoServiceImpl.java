package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Curso;
import co.unab.edu.repository.CursoRepository;


@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	@Override
	public Optional<Curso> findById(String id) {
		return cursoRepository.findById(id);
	}

	@Override
	public Curso save(Curso curso) {
		return cursoRepository.save(curso);
	}

	@Override
	public void deleteById(String id) {
		cursoRepository.deleteById(id);
	}	
}
