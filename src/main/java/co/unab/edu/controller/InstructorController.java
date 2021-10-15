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

import co.unab.edu.models.entity.Instructor;
import co.unab.edu.models.service.InstructorService;

@RestController
@RequestMapping("/api/instructores")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class InstructorController {
	@Autowired
	private InstructorService instructorService;
	
	@GetMapping("{id}")
	public Optional<Instructor> buscarPorId(@PathVariable Integer id) {
		return instructorService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Instructor> listar() {
		return instructorService.findAll();
	}
	
	@PostMapping
	public Instructor guardar(@RequestBody Instructor instructor) {
		return instructorService.save(instructor);
	}
	
	@PutMapping("/actualizar/{id}")
	public Instructor actualizar(@RequestBody Instructor instructor, @PathVariable Integer id) {
		Instructor InstrBD = instructorService.findById(id).get();
		InstrBD.setNombre(instructor.getNombre());
		InstrBD.setTelef(instructor.getTelef());
		InstrBD.setEmail(instructor.getEmail());
		InstrBD.setProfesion(instructor.getProfesion());
		InstrBD.setfInicioExp(instructor.getfInicioExp());
		InstrBD.setPais(instructor.getPais());
		InstrBD.setCiudad(instructor.getCiudad());
		InstrBD.setEstado(instructor.getEstado());
		
		instructorService.save(InstrBD);
		return instructor;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		instructorService.deleteById(id);
	}
}
