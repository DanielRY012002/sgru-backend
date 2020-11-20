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

import pe.edu.upeu.sysrubricas.entity.Lineas_pa;
import pe.edu.upeu.sysrubricas.service.Lineas_paService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/lineas_pa")
public class Lineas_paController {
	
	@Autowired	
	private Lineas_paService lineas_paService;
	@GetMapping("/all")
	@CrossOrigin(origins="http://localhost:4200")
	public Map<String, Object> readAll(){
		return lineas_paService.readAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return lineas_paService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}
	}
	
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public int delete(@PathVariable int id) {
		return lineas_paService.delete(id);
	}	
	
	@PostMapping("/add")
	@CrossOrigin(origins="http://localhost:4200")
	public int create(@RequestBody Lineas_pa lpa) {
		return lineas_paService.create(lpa);	
	}
	
	@PutMapping("/update/{id}")
	@CrossOrigin(origins="http://localhost:4200")
    public int update(@RequestBody Lineas_pa lpa,@PathVariable int id) {
		lpa.setIdlineas_pa(id);
		return lineas_paService.update(lpa);
	}
	
	//public String edit(@RequestBody Cronograma cg, @PathVariable int id) {
		//Map<String, Object> map = rolService.read(id);
		//System.out.println(map);
		//Cronograma rol = new Cronograma();
		//rol.setId_cronograma(id);
		//rol.setEvento(cg.getEvento());
		//rol.setFecha_ini(cg.getFecha_ini());
		//rol.setFecha_fin(cg.getFecha_fin());
		//rol.setEstado(cg.getEstado());
		//cronogramaService.update(cg);
		//return "hola";
	//}

}



//Creado por: Saul Olivas


