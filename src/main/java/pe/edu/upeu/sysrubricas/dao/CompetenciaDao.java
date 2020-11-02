//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.dao;

import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Competencia;

public interface CompetenciaDao {
	int create(Competencia c);

	int update(Competencia c);

	int delete(int id);

	Map<String, Object> read(int id);// un map es un arrai que trajaba con una llave(string) y un objeto

	Map<String, Object> readAll();
}
