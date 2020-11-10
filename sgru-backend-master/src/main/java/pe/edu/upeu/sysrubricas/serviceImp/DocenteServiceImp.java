package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.DocenteDao;
import pe.edu.upeu.sysrubricas.entity.Docente;
import pe.edu.upeu.sysrubricas.service.DocenteService;

@Service
public class DocenteServiceImp implements DocenteService{

	@Autowired
	public DocenteDao docenteDao;
	
	@Override
	public int create(Docente d) {
		// TODO Auto-generated method stub
		return docenteDao.create(d);
	}

	@Override
	public int update(Docente d) {
		// TODO Auto-generated method stub
		return docenteDao.update(d);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return docenteDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return docenteDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return docenteDao.readAll();
	}

}
