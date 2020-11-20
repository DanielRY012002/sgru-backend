package pe.edu.upeu.sysrubricas.controller;

import java.util.Map;
import java.util.Set;

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

import pe.edu.upeu.sysrubricas.entity.Nivel_Competencias_Curso;
import pe.edu.upeu.sysrubricas.service.Nivel_Competencias_Curso_Service;

@RestController
@CrossOrigin(origins = "http://localhost:4200")//// permite el acceso al angular
@RequestMapping("/nivel_competencias_curso")

public class Nivel_Competencias_Curso_Controller {
	@Autowired	
	private Nivel_Competencias_Curso_Service nivelcompetenciascursoservice;
	@PostMapping("/add")
	public int create(@RequestBody Nivel_Competencias_Curso ncc) {
		return nivelcompetenciascursoservice.create(ncc);
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody  Nivel_Competencias_Curso ncc,@PathVariable int id) {
		ncc.setNivel_competencias_curso_id(id);
		return nivelcompetenciascursoservice.update(ncc);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return nivelcompetenciascursoservice.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
		return nivelcompetenciascursoservice.read(id);
		}catch (Exception e){
			// TODO: handle exception
			System.out.println("error");
			return null;
			}
	}
	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return nivelcompetenciascursoservice.readAll();
	}
	
}
