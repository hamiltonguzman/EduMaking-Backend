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
import co.unab.edu.models.entity.Pais;
import co.unab.edu.models.service.PaisService;

@RestController
@RequestMapping("/api/paises")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PaisController {
	@Autowired
	private PaisService paisService;
	
	@GetMapping("{id}")
	public Optional<Pais> buscarPorId(@PathVariable String id) {
		return paisService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Pais> listar() {
		return  paisService.findAll();
	}
	
	@PostMapping
	public Pais guardar(@RequestBody Pais pais) {
		return paisService.save(pais);
	}
	
	@PutMapping("/actualizar/{id}")
	public Pais actualizar(@RequestBody Pais pais, @PathVariable String id) {
		Pais PaisBD = paisService.findById(id).get();
		
		PaisBD.setNombre(pais.getNombre());
		PaisBD.setContinente(pais.getContinente());
		PaisBD.setCodigo(pais.getCodigo());
		
		paisService.save(PaisBD);
		return pais;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable String id) {
		paisService.deleteById(id);
	}
}
