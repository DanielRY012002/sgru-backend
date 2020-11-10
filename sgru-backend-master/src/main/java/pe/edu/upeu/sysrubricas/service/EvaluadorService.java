package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Evaluador;

public interface EvaluadorService {

	int create(Evaluador e);
	int update(Evaluador e);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
