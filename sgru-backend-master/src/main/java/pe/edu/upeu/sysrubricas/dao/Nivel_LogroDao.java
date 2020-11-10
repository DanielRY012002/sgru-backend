package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Nivel_Logro;

public interface Nivel_LogroDao {

	int create(Nivel_Logro NL);
	int update(Nivel_Logro NL);
	int delete(int id);
	Map<String, Object> read(int id);
    Map<String, Object> readAll();
    void convertiMap(Map<String, Object>map); 
}
