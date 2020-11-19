//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysrubricas.entity.Rubricas;
import pe.edu.upeu.sysrubricas.service.RubricaService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/rubricas")

public class RubricaController {
	
	@Autowired	
	private RubricaService rubricaservice;
	
	@PostMapping("/add")
	public int create(@RequestBody Rubricas r) {
		return rubricaservice.create(r);
	}
	@PostMapping("/update/{id}")
	public int update(@RequestBody Rubricas r,@PathVariable int id) {
		r.setRubrica_id(id);
		return rubricaservice.update(r);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return rubricaservice.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
		return rubricaservice.read(id);
		}catch (Exception e){
			System.out.println("error");
			return null;
		}
	}
	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return rubricaservice.readAll();
	}
	
	
	
}
