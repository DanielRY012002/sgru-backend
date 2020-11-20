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

import pe.edu.upeu.sysrubricas.entity.Linea_plan;
import pe.edu.upeu.sysrubricas.service.Linea_planService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/lineasplanes")
public class Linea_planController {
	@Autowired	
	private Linea_planService  linea_planService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return linea_planService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return linea_planService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return linea_planService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Linea_plan l) {
		return linea_planService.create(l);		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Linea_plan l,@PathVariable int id) {
		l.setLinea_plan_id(id);
		return linea_planService.update(l);
	}
}
