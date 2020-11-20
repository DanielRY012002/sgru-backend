package pe.edu.upeu.sysrubricas.controller;

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

import pe.edu.upeu.sysrubricas.entity.Carga_academica;
import pe.edu.upeu.sysrubricas.service.Carga_academicaService;
@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/cargasacademicas")
public class Carga_academicaController {
	@Autowired	
	private Carga_academicaService carga_academicaService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return carga_academicaService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return carga_academicaService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return carga_academicaService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Carga_academica c) {
		return carga_academicaService.create(c);		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Carga_academica c,@PathVariable int id) {
		c.setCarga_academica_id(id);
		return carga_academicaService.update(c);
	}
}
