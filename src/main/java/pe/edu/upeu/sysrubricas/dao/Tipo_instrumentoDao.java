package pe.edu.upeu.sysrubricas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Tipo_instrumento;


public interface Tipo_instrumentoDao {
	int create(Tipo_instrumento t);
	int update(Tipo_instrumento t);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();	
	List<Map<String, Object>> list();

}
