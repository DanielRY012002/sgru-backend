package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Cronograma;

public interface CronogramaDao {
	int create(Cronograma cg);
	int update(Cronograma cg);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();	
}



//Creado por: Saul Olivas