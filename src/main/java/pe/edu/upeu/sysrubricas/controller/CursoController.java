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
import pe.edu.upeu.sysrubricas.service.CursoService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
@RequestMapping("/cursos")
public class CursoController {
	@Autowired	
	private CursoService cursoService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return cursoService.readAll();
	}
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return cursoService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return cursoService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Curso c) {
		return cursoService.create(c);		
	}
	@PutMapping("/update/{id}")
    public int update(@RequestBody Curso c,@PathVariable int id) {
		c.setId_curso(id);
		return cursoService.update(c);
	}
	//@PutMapping("/update/{id}")
		//public String edit(@RequestBody Curso r, @PathVariable int id) {
			//**Map<String, Object> map = rolService.read(id);
			//**System.out.println(map);
			//Curso curso = new Curso();
			//curso.setNombre(r.getNombre());
			//curso.setCr(r.getCr());
			//curso.setHt(r.getHt());
			//curso.setHp(r.getHp());
			//cursoService.update(r);
			//return "hola";
		//}
}
