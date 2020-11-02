package pe.edu.upeu.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysrubricas.entity.Curso;
import pe.edu.upeu.sysrubricas.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	@Autowired	
	private CursoService cursoservice;
	@GetMapping("/lista")
	public Map<String, Object> lista() {
		return cursoservice.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return cursoservice.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return cursoservice.delete(id);
	}	
	@PostMapping("/create")
	public int create(@RequestBody Curso c) {
		return cursoservice.create(c);	
		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Curso c,@PathVariable int id) {
		c.setId_curso(id);
		return cursoservice.update(c);
	}	
}
