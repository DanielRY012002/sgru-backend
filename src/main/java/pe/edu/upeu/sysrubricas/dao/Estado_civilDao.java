package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Estado_civil;

public interface Estado_civilDao {
	int create(Estado_civil e);
	int update(Estado_civil e);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();
}
