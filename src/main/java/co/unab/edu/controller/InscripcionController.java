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
import co.unab.edu.models.entity.Inscripcion;
import co.unab.edu.models.service.InscripcionService;

@RestController
@RequestMapping("/api/inscripciones")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class InscripcionController {
	@Autowired
	private InscripcionService inscripcionService;
	
	@GetMapping("{id}")
	public Optional<Inscripcion> buscarPorId(@PathVariable Integer id) {
		return inscripcionService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Inscripcion> listar() {
		return  inscripcionService.findAll();
	}
	
	@PostMapping
	public Inscripcion guardar(@RequestBody Inscripcion inscripcion) {
		return inscripcionService.save(inscripcion);
	}
	
	@PutMapping("/actualizar/{id}")
	public Inscripcion actualizar(@RequestBody Inscripcion inscripcion, @PathVariable Integer id) {
		Inscripcion InscrBD = inscripcionService.findById(id).get();
		
		InscrBD.setCurso(inscripcion.getCurso());
		InscrBD.setPersona(inscripcion.getPersona());
		InscrBD.setFechaIni(inscripcion.getFechaIni());
		InscrBD.setFechaFin(inscripcion.getFechaFin());
		InscrBD.setCertificado(inscripcion.getCertificado());
		
		inscripcionService.save(InscrBD);
		return inscripcion;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		inscripcionService.deleteById(id);
	}
}