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

import pe.edu.upeu.sysrubricas.entity.Informe;
import pe.edu.upeu.sysrubricas.service.InformeService;

@RestController
@RequestMapping("/informe")

public class InformeController {
	@Autowired
	private InformeService informeService;

	@GetMapping("/all")
	public Map<String, Object> readAll() {
		return informeService.readAll();
	}

	@GetMapping("/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return informeService.read(id);
	}

	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return informeService.delete(id);
	}

	@PostMapping("/create")
	public int create(@RequestBody Informe i) {
		return informeService.create(i);

	}

	@PutMapping("/update/{id}")
	public int update(@RequestBody Informe i, @PathVariable int id) {
		i.setId_informe(id);
		return informeService.update(i);
	}

}
