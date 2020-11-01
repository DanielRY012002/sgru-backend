//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.controller;

import java.util.List;
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

import pe.edu.upeu.sysrubricas.entity.Competencia;
import pe.edu.upeu.sysrubricas.service.CompetenciaService;

@RestController
@RequestMapping("/competencia")

public class CompetenciaController {
	@Autowired	
	private CompetenciaService competenciaservice;
	@GetMapping("/lista")
	public Map<String, Object> lista() {
		return competenciaservice.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return competenciaservice.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return competenciaservice.delete(id);
	}	
	@PostMapping("/create")
	public int create(@RequestBody Competencia c) {
		return competenciaservice.create(c);	
		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Competencia c,@PathVariable int id) {
		c.setId_competencias(id);
		
	return competenciaservice.update(c);
	}	
	
}