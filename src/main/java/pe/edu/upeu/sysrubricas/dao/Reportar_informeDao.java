package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Reportar_informe;


public interface Reportar_informeDao {
	int create(Reportar_informe r);
	int update(Reportar_informe r);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();
}
