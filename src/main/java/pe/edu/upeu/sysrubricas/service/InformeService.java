package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Informe;

public interface InformeService {
	int create(Informe i);

	int update(Informe i);

	int delete(int id);

	Map<String, Object> read(int id);

	Map<String, Object> readAll();
}
