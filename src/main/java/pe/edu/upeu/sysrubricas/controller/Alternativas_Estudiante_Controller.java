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

import pe.edu.upeu.sysrubricas.entity.Alternativas_Estudiante;
import pe.edu.upeu.sysrubricas.service.AlternativaService;
import pe.edu.upeu.sysrubricas.service.Alternativas_Estudiante_Service;
import pe.edu.upeu.sysrubricas.serviceimpl.Alternativas_Estudiante_ServiceImpl;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/alternativas_estudiante")

public class Alternativas_Estudiante_Controller {
	
	@Autowired	
	private Alternativas_Estudiante_Service alternativasestudianteservice;
	@PostMapping("/add")
	public int create(@RequestBody Alternativas_Estudiante ae) {
		return alternativasestudianteservice.create(ae);
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Alternativas_Estudiante ae,@PathVariable int id) {
		return alternativasestudianteservice.update(ae);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return alternativasestudianteservice.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
		return alternativasestudianteservice.read(id);
		}catch (Exception e){
			// TODO: handle exception
						System.out.println("error");
						return null;
		}
	}
	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return alternativasestudianteservice.readAll();
	}
	
}
