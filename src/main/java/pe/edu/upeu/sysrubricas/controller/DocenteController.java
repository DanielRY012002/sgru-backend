package pe.edu.upeu.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysrubricas.entity.Docente;
import pe.edu.upeu.sysrubricas.service.DocenteService;

@RestController
@CrossOrigin(origins="", allowedHeaders="")
@RequestMapping("/docente")

public class DocenteController {
	
	@Autowired	
	private DocenteService docenteService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return docenteService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return docenteService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}

	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return docenteService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Docente d) {
		return docenteService.create(d);	
		
	}
	//@PutMapping("/update/{id}")
    //public int update(@RequestBody Docente d,@PathVariable int id) {
		//c.setId_curso(id);
		//return docenteService.update(d);
	//}
	public String edit(@RequestBody Docente d, @PathVariable int id) {
		//Map<String, Object> map = rolService.read(id);
		//System.out.println(map);
		Docente rol = new Docente();
		rol.setId_persona(id);
		rol.setCodigo_docente(d.getCodigo_docente());
		rol.setEstado(d.getEstado());
		docenteService.update(d);
		return "hola";
	}

}



//Creado por: Saul Olivas