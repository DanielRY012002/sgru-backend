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

import pe.edu.upeu.sysrubricas.entity.Nivel_Competencias;
import pe.edu.upeu.sysrubricas.service.Nivel_Competencias_Service;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/nivel_competencias")

public class Nivel_Competencias_Controller {
	@Autowired	
	private Nivel_Competencias_Service nivelcompetenciaservice;
	@PostMapping("/add")
	public int create(@RequestBody Nivel_Competencias nc) {
		return nivelcompetenciaservice.create(nc);
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Nivel_Competencias nc) {
		return nivelcompetenciaservice.update(nc);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return nivelcompetenciaservice.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
		return nivelcompetenciaservice.read(id);
		}catch (Exception e){
			// TODO: handle exception
						System.out.println("error");
						return null;
		}
	}
	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return nivelcompetenciaservice.readAll();
	}
	
	
}
