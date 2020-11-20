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

import pe.edu.upeu.sysrubricas.entity.Alternativas;
import pe.edu.upeu.sysrubricas.service.AlternativaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")//// permite el acceso al angular
@RequestMapping("/alternativas")

public class AlternativasController {
	@Autowired	
	private AlternativaService alternativaservice;
	@PostMapping("/add")
	public int create(@RequestBody Alternativas a) {
		return alternativaservice.create(a);
	}
	@PutMapping("/update/{id}")
	public int update(@RequestBody Alternativas a,@PathVariable int id) {
		return alternativaservice.update(a);
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return alternativaservice.delete(id);
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		try {
		return alternativaservice.read(id);
		}catch (Exception e){
			// TODO: handle exception
			System.out.println("error");
			return null;

		}
	}
	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return alternativaservice.readAll();
	}
	
}
