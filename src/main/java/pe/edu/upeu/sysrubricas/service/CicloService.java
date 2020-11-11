package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Ciclo;

public interface CicloService {
	int create(Ciclo cl);
	int update(Ciclo cl);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
}

//Creado por: Saul Olivas

