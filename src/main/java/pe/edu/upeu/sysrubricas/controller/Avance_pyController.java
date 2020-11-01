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

import pe.edu.upeu.sysrubricas.entity.Avance_py;
import pe.edu.upeu.sysrubricas.service.Avance_pyService;

@RestController
@RequestMapping("/Avance_py")

public class Avance_pyController {
	
	@Autowired	
	private Avance_pyService avance_pyservice;
	
	@GetMapping("/lista")
	public Map<String, Object> lista() {
		return avance_pyservice.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return avance_pyservice.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return avance_pyservice.delete(id);
	}	
	@PostMapping("/create")
	public int create(@RequestBody Avance_py apy) {
		return avance_pyservice.create(apy);	
		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Avance_py apy,@PathVariable int id) {
		apy.setId_avance_py(id);
		
	return avance_pyservice.update(apy);
	}	
	
}
