package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Experto_Externo;

public interface Experto_ExternoDao {

	int update(Experto_Externo eex);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll(int id);
}
