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
import co.unab.edu.models.entity.Persona;
import co.unab.edu.models.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PersonaController {
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("{id}")
	public Optional<Persona> buscarPorId(@PathVariable Integer id) {
		return personaService.findById(id);
	}
	
	@GetMapping("/listar")
	public List<Persona> listar() {
		return  personaService.findAll();
	}
	
	@PostMapping
	public Persona guardar(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	
	@PutMapping("/actualizar/{id}")
	public Persona actualizar(@RequestBody Persona persona, @PathVariable Integer id) {
		Persona PersBD = personaService.findById(id).get();
		
		PersBD.setTipoDoc(persona.getTipoDoc());
		PersBD.setNombreEmpresa(persona.getNombreEmpresa());
		PersBD.setTelEmpresa(persona.getTelEmpresa());
		PersBD.setEmailEmpresa(persona.getEmailEmpresa());
		PersBD.setNombrePersona(persona.getNombrePersona());
		PersBD.setTelPersona(persona.getTelPersona());
		PersBD.setEmailPersona(persona.getEmailPersona());
		PersBD.setCargoPersona(persona.getCargoPersona());
		PersBD.setProfesion(persona.getProfesion());
		PersBD.setClasif(persona.getClasif());
		PersBD.setPais(persona.getPais());
		PersBD.setCiudad(persona.getCiudad());
		PersBD.setRutPersona(persona.getRutPersona());
		PersBD.setInteres(persona.getInteres());
		PersBD.setEstado(persona.getEstado());
		
		personaService.save(PersBD);
		return persona;
	}
	
	@DeleteMapping("{id}")
	public void eliminar(@PathVariable Integer id) {
		personaService.deleteById(id);
	}
}
