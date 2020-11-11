package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Cronograma;

public interface CronogramaService {
	int create(Cronograma cg);
	int update(Cronograma cg);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
}

//Creado por: Saul Olivas
