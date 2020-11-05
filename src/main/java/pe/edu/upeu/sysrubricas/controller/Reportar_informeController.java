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

import pe.edu.upeu.sysrubricas.entity.Reportar_informe;
import pe.edu.upeu.sysrubricas.service.Reportar_informeService;



@RestController
@RequestMapping("/reportar") 

public class Reportar_informeController {
	@Autowired	
	private Reportar_informeService reportar_informeservice;
	@GetMapping("/lista")
	public Map<String, Object> lista() {
		return reportar_informeservice.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return reportar_informeservice.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return reportar_informeservice.delete(id);
	}	
	@PostMapping("/create")
	public int create(@RequestBody Reportar_informe r) {
		return reportar_informeservice.create(r);	
		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Reportar_informe r,@PathVariable int id) {
		r.setId_informe(id);
		
	return reportar_informeservice.update(r);
	}	
	

}
