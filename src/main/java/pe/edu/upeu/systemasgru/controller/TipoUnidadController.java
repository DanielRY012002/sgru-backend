package pe.edu.upeu.systemasgru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.javafx.collections.MappingChange.Map;

import pe.edu.upeu.systemasgru.service.TipoUnidadService;

@RestController
@RequestMapping("/tipo")
public class TipoUnidadController {

	@Autowired
	private TipoUnidadService tipoUnidadService;
	
	
	
	@GetMapping("/all")
	public Map<String, Object> readAll(){
		return (Map<String, Object>) tipoUnidadService.readAll();
	}
}
