package co.unab.edu.models.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.unab.edu.models.entity.Ciudad;
import co.unab.edu.repository.CiudadRepository;

@Service
public class CiudadServiceImpl implements CiudadService  {
	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Override
	public List<Ciudad> findAll() {
		return ciudadRepository.findAll();
	}

	@Override
	public Optional<Ciudad> findById(Integer id) {
		return ciudadRepository.findById(id);
	}

	@Override
	public Ciudad save(Ciudad ciudad) {
		return ciudadRepository.save(ciudad);
	}

	@Override
	public void deleteById(Integer id) {
		ciudadRepository.deleteById(id);
	}
}
