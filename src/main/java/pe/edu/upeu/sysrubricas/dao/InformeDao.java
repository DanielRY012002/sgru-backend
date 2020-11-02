package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Informe;

public interface InformeDao {
	int create(Informe i);
	int update(Informe i);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object> readAll();	
}
