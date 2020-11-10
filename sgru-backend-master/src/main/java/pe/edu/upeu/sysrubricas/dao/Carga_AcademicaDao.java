package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Carga_Academica;

public interface Carga_AcademicaDao {

	int create(Carga_Academica CA);
	int update(Carga_Academica CA);
	int delete(int id);
	Map<String, Object> read(int id);
	Map<String, Object> readAll();
}
