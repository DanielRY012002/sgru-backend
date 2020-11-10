package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Evaluador_Externo;

public interface Evaluador_ExternoService {

	int create(Evaluador_Externo ee);
	int update(Evaluador_Externo ee);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
