package pe.edu.upeu.sysrubricas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Lineas_pa;

public interface Lineas_paDao {
	int create(Lineas_pa lpa);
    int update(Lineas_pa lpa);
    int delete(int id);
    Map<String,Object> read(int id);
    Map<String,Object> readAll();

}
