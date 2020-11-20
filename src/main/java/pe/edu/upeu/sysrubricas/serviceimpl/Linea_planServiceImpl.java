package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Linea_planDao;
import pe.edu.upeu.sysrubricas.entity.Linea_plan;
import pe.edu.upeu.sysrubricas.service.Linea_planService;
@Service
public class Linea_planServiceImpl implements Linea_planService{
	@Autowired
	public Linea_planDao linea_plandao;
	@Override
	public int create(Linea_plan l) {
		// TODO Auto-generated method stub
		return linea_plandao.create(l);
	}

	@Override
	public int update(Linea_plan l) {
		// TODO Auto-generated method stub
		return linea_plandao.update(l);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return linea_plandao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return linea_plandao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return linea_plandao.readAll();
	}
	
}
