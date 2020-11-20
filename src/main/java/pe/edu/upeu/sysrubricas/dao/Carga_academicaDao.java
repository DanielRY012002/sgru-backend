package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Carga_academica;

public interface Carga_academicaDao {
	int create(Carga_academica c);
	int update(Carga_academica c);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();
}
