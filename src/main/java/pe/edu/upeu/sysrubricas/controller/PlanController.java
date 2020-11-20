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

import pe.edu.upeu.sysrubricas.entity.Curso;
import pe.edu.upeu.sysrubricas.entity.Plan;
import pe.edu.upeu.sysrubricas.service.CursoService;
import pe.edu.upeu.sysrubricas.service.PlanService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/planes")
public class PlanController {
	@Autowired	
	private PlanService planService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return planService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return planService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return planService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Plan p) {
		return planService.create(p);		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Plan p,@PathVariable int id) {
		p.setPlan_id(id);
		return planService.update(p);
	}
}
