package pe.edu.upeu.sysrubricas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Docente;

public interface DocenteService {
	int create(Docente d);
	int update(Docente d);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
}

//Creado por: Saul Olivas
