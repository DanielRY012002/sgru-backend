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

import pe.edu.upeu.sysrubricas.entity.Carga_Academica;
import pe.edu.upeu.sysrubricas.service.Carga_AcademicaService;

@RestController
@RequestMapping("/Carga_Academica")
public class Carga_AcademicaController {

	@Autowired
	private Carga_AcademicaService carga_AcademicaService;
	
	@GetMapping("/all")
	public Map<String, Object> lista(){
		return carga_AcademicaService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id){
		return carga_AcademicaService.read(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return carga_AcademicaService.delete(id);
	}
	
	@PostMapping("/create")
	public int create(@RequestBody Carga_Academica CA) {
		return carga_AcademicaService.create(CA);
	}
	
	@PutMapping("/update/{id}")
	public int update(@RequestBody Carga_Academica CA, @PathVariable int id) {
		CA.setId_Programa_Academico(id);
		return carga_AcademicaService.update(CA);
	}
}
