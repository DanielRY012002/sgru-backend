package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Estado_civil;

public interface Estado_civilService {
	int create(Estado_civil p);
	int update(Estado_civil p);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();
}