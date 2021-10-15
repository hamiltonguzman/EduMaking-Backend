package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Pais;
import co.unab.edu.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService {
	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public List<Pais> findAll() {
		return paisRepository.findAll();
	}

	@Override
	public Optional<Pais> findById(String id) {
		return paisRepository.findById(id);
	}

	@Override
	public Pais save(Pais pais) {
		return paisRepository.save(pais);
	}

	@Override
	public void deleteById(String id) {
		paisRepository.deleteById(id);
	}	
}
