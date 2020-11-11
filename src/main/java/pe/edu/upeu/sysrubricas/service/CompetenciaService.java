	//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Competencia;

public interface CompetenciaService {
	int create(Competencia c);
	int update(Competencia c);
	int delete(int id);
	Map<String,Object> read(int id);
	Map<String,Object>readAll();	
}
