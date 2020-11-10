package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.EvaluadorDao;
import pe.edu.upeu.sysrubricas.entity.Evaluador;
import pe.edu.upeu.sysrubricas.service.EvaluadorService;

@Service
public class EvaluadorServiceImp implements EvaluadorService{

	@Autowired
	public EvaluadorDao evaluadorDao;
	
	@Override
	public int create(Evaluador e) {
		// TODO Auto-generated method stub
		return evaluadorDao.create(e);
	}

	@Override
	public int update(Evaluador e) {
		// TODO Auto-generated method stub
		return evaluadorDao.update(e);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return evaluadorDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return evaluadorDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return evaluadorDao.readAll();
	}

}
