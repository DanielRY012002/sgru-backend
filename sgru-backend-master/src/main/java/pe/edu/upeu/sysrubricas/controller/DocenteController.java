package pe.edu.upeu.sysrubricas.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysrubricas.service.DocenteService;

@RestController
@RequestMapping("/Docente")
public class DocenteController {

	@Autowired
	private DocenteService docenteService;
	
	@GetMapping("/all")
	public Map<String, Object> lista(){
		return docenteService.readAll();
	}
}
