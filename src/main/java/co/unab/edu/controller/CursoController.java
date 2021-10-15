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
import co.unab.edu.models.entity.Curso;
import co.unab.edu.models.service.CursoService;

@RestController
@RequestMapping("/api/cursos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class CursoController {
	@Autowired
	private CursoService cursoService;
	
	@GetMapping("{id}")
	public Optional<Curso> buscarPorId(@PathVariable String id) {
		return cursoService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Curso> listar() {
		return  cursoService.findAll();
	}
	
	@PostMapping
	public Curso guardar(@RequestBody Curso curso) {
		return cursoService.save(curso);
	}
	
	@PutMapping("/actualizar/{id}")
	public Curso actualizar(@RequestBody Curso curso, @PathVariable String id) {
		Curso CursoBD = cursoService.findById(id).get();
		
		CursoBD.setInstructor(curso.getInstructor());
		CursoBD.setNombre(curso.getNombre());
		CursoBD.setContenido(curso.getContenido());
		CursoBD.setDuracion(curso.getDuracion());
		
		cursoService.save(CursoBD);
		return curso;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable String id) {
		cursoService.deleteById(id);
	}
}
