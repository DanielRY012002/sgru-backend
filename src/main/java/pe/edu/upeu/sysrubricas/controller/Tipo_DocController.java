package pe.edu.upeu.sysrubricas.controller;

import java.util.List;
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

import pe.edu.upeu.sysrubricas.entity.Tipo_Doc;
import pe.edu.upeu.sysrubricas.service.Tipo_DocService;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
@RequestMapping("/tipodoc")
public class Tipo_DocController {
	@Autowired
	private Tipo_DocService tipo_DocService;

	@GetMapping("/all")
	private List<Map<String, Object>> list() {
		return tipo_DocService.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody Tipo_Doc t) {
		return tipo_DocService.create(t);

	}
	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id ) {
		return tipo_DocService.delete(id);
	}
}
