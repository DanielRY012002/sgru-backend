package pe.edu.upeu.sysrubricas.service;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Reportar_informe;

public interface Reportar_informeService {
	int create(Reportar_informe r);
	int update(Reportar_informe c);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
}
