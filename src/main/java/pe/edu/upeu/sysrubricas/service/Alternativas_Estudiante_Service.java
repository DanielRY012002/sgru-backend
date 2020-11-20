package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Alternativas_Estudiante;

public interface Alternativas_Estudiante_Service {
	int create(Alternativas_Estudiante ae);
	int update(Alternativas_Estudiante ae);
	int delete(int id);
	Map<String,Object> read(int id);//un map es un arrai que trajaba con una llave(string) y un objeto
	Map<String,Object>readAll();
	String prueba(String texto);
}
