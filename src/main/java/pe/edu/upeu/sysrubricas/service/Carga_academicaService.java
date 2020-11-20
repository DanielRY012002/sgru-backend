package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Carga_academica;

public interface Carga_academicaService {
	int create(Carga_academica c);
	int update(Carga_academica c);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();
}
