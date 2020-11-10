package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Experto_Externo;

public interface Experto_ExternoService {

	int update(Experto_Externo eex);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll(int id);
}
