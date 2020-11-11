package pe.edu.upeu.sysrubricas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Tipo_instrumento;


public interface Tipo_instrumentoService {
	int create(Tipo_instrumento t);
	int update(Tipo_instrumento t);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
	List<Map<String, Object>> list();

}
