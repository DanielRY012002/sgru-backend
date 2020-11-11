package pe.edu.upeu.sysrubricas.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysrubricas.entity.Ciclo;

public interface CicloDao {
	int create(Ciclo cl);
    int update(Ciclo cl);
    int delete(int id);
    Map<String,Object> read(int id);
    Map<String,Object> readAll();
}
