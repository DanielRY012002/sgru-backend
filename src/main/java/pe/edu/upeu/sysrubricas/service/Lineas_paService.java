package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Lineas_pa;

public interface Lineas_paService {
	int create(Lineas_pa lpa);
	int update(Lineas_pa lpa);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
}

//Creado por: Saul Olivas
