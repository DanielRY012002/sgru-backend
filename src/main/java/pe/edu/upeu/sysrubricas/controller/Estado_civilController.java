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

import pe.edu.upeu.sysrubricas.entity.Estado_civil;
import pe.edu.upeu.sysrubricas.service.Estado_civilService;
@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/estadosciviles")
public class Estado_civilController {
	@Autowired	
	private Estado_civilService estado_civilService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return estado_civilService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return estado_civilService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return estado_civilService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Estado_civil e) {
		return estado_civilService.create(e);		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Estado_civil e,@PathVariable int id) {
		e.setEstado_civil_id(id);
		return estado_civilService.update(e);
	}
}
