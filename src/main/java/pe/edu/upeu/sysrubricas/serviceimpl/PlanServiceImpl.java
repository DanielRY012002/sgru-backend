package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.PlanDao;
import pe.edu.upeu.sysrubricas.entity.Plan;
import pe.edu.upeu.sysrubricas.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService{
	@Autowired
	public PlanDao plandao;
	@Override
	public int create(Plan p) {
		// TODO Auto-generated method stub
		return plandao.create(p);
	}

	@Override
	public int update(Plan p) {
		// TODO Auto-generated method stub
		return plandao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return plandao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return plandao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return plandao.readAll();
	}

}
