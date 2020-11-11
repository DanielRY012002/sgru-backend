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

import pe.edu.upeu.sysrubricas.entity.Cronograma;
import pe.edu.upeu.sysrubricas.service.CronogramaService;

@RestController
@CrossOrigin(origins="", allowedHeaders="")
@RequestMapping("/cronograma")

public class CronogramaController {

	@Autowired	
	private CronogramaService cronogramaService;
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return cronogramaService.readAll();
	}
	
	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id ) {
		try {
			 return cronogramaService.read(id);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
			return null;
		}

	}
	
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return cronogramaService.delete(id);
	}	
	@PostMapping("/add")
	public int create(@RequestBody Cronograma cg) {
		return cronogramaService.create(cg);	
		
	}
	
	@PutMapping("/update/{id}")
    public int update(@RequestBody Cronograma cg,@PathVariable int id) {
		cg.setId_cronograma(id);
		return cronogramaService.update(cg);
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
