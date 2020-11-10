package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Docente;

public interface DocenteDao {

	int create(Docente d);
	int update(Docente d);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}