package co.unab.edu.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.unab.edu.models.entity.Ciudad;
import co.unab.edu.models.service.CiudadService;

@RestController
@RequestMapping("/api/ciudades")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CiudadController {
	@Autowired
	private CiudadService ciudadService;
	
	@GetMapping("{id}")
	public Optional<Ciudad> buscarPorId(@PathVariable Integer id) {
		return ciudadService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Ciudad> listar() {
		return ciudadService.findAll();
	}
	
	@PostMapping
	public Ciudad guardar(@RequestBody Ciudad ciudad) {
		return ciudadService.save(ciudad);
	}
	
	@PutMapping("/actualizar/{id}")
	public Ciudad actualizar(@RequestBody Ciudad ciudad, @PathVariable Integer id) {
		Ciudad CiudadBD = ciudadService.findById(id).get();
		
		CiudadBD.setNombre(ciudad.getNombre());
		CiudadBD.setPais(ciudad.getPais());
		CiudadBD.setEstado(ciudad.getEstado());
		
		ciudadService.save(CiudadBD);
		return ciudad;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		ciudadService.deleteById(id);
	}

}
