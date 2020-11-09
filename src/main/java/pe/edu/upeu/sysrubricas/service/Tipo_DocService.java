package pe.edu.upeu.sysrubricas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Tipo_Doc;

public interface Tipo_DocService {
	int create(Tipo_Doc t);

	int update(Tipo_Doc t);

	int delete(int id);

	Tipo_Doc read(int id);

	List<Map<String, Object>> readAll();
}
