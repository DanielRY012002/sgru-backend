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

import pe.edu.upeu.sysrubricas.entity.Nivel_Logro;
import pe.edu.upeu.sysrubricas.service.Nivel_LogroService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/Nivel_Logro")
public class Nivel_LogroController {

	@Autowired
	private Nivel_LogroService nivel_logroService;
	
	@GetMapping("/all")
	public Map<String, Object> lista(){
		return nivel_logroService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id){
		try {
			 return nivel_logroService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return nivel_logroService.delete(id);
	}
	
	@PostMapping("/add")
	public int create(@RequestBody Nivel_Logro NL) {
		return nivel_logroService.create(NL);
	}
	
	@PutMapping("/update/{id}")
	public String edit(@RequestBody Nivel_Logro NL, @PathVariable int id) {
	    
		Nivel_Logro nivel_Logro = new Nivel_Logro();
		nivel_Logro.setId_Nivel_Logro(id);
		nivel_Logro.setNombre(NL.getNombre());
		nivel_logroService.update(NL);
		return "hola";
	}
}

