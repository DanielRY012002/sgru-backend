package pe.edu.upeu.systemasgru.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.systemasgru.entity.TipoUnidad;

public interface TipoUnidadService {
	int create(TipoUnidad t);
	int update(TipoUnidad t);
	int delete(int id);
	TipoUnidad read(int id);
	List<Map<String,Object>>readAll();
}
