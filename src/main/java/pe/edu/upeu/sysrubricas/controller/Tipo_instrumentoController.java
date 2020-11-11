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

import pe.edu.upeu.sysrubricas.entity.Tipo_instrumento;
import pe.edu.upeu.sysrubricas.service.Tipo_instrumentoService;



@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/tipoinstrumento")

public class Tipo_instrumentoController {
	@Autowired	
	private Tipo_instrumentoService tipo_instrumentoservice;
	
	@GetMapping("/all")

	public Map<String, Object> read() {
		
			return tipo_instrumentoservice.readAll();
		}

	
	@GetMapping("/{id}")

	public Map<String, Object> read(@PathVariable int id) {
		return tipo_instrumentoservice.read(id);
		
		}
	
	@DeleteMapping("/delete/{id}")

	public int delete(@PathVariable int id) {
		return tipo_instrumentoservice.delete(id);
	}	
	@PostMapping("/add")

	public int create(@RequestBody Tipo_instrumento t) {
		return tipo_instrumentoservice.create(t);	
		
	}
	@PutMapping("/update/{id}")

	public int update(@RequestBody Tipo_instrumento t, @PathVariable int id) {
		t.setId_tipo_instrumento(id);
		return tipo_instrumentoservice.update(t);
	
	
	}	
	
}
