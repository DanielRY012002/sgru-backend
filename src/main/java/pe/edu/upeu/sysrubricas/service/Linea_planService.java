package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Linea_plan;

public interface Linea_planService {
	int create(Linea_plan l);
	int update(Linea_plan l);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();
}
