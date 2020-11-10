package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Evaluador_Externo;

public interface Evaluador_ExternoDao {

	int create(Evaluador_Externo ee);
	int update(Evaluador_Externo ee);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
