package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Evaluador_ExternoDao;
import pe.edu.upeu.sysrubricas.entity.Evaluador_Externo;
import pe.edu.upeu.sysrubricas.service.Evaluador_ExternoService;

@Service
public class Evaluador_ExternoServiceImp implements Evaluador_ExternoService{

	@Autowired
	public Evaluador_ExternoDao evaluador_externoDao;
	
	@Override
	public int create(Evaluador_Externo ee) {
		// TODO Auto-generated method stub
		return evaluador_externoDao.create(ee);
	}

	@Override
	public int update(Evaluador_Externo ee) {
		// TODO Auto-generated method stub
		return evaluador_externoDao.update(ee);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return evaluador_externoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return evaluador_externoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return evaluador_externoDao.readAll();
	}

}
