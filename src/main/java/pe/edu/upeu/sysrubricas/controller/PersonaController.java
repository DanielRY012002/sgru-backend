package pe.edu.upeu.sysrubricas.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysrubricas.entity.Persona;
import pe.edu.upeu.sysrubricas.service.PersonaService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/persona")
public class PersonaController {
	@Autowired
	private PersonaService personaService;

	@PostMapping("/create")
	public int create(@RequestBody Persona p) {
		return personaService.create(p);

	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return personaService.delete(id);
	}

	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return personaService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return personaService.read(id);
	}

	@GetMapping("/test")
	public List<Map<String, Object>> list() {
		return personaService.list();
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Persona p, @PathVariable int id) {
		p.setId_persona(id);
		return personaService.update(p);
	}
}
