package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Carga_AcademicaDao;
import pe.edu.upeu.sysrubricas.entity.Carga_Academica;
import pe.edu.upeu.sysrubricas.service.Carga_AcademicaService;

@Service
public class Carga_AcademicaServiceImp implements Carga_AcademicaService{

	@Autowired
	public Carga_AcademicaDao carga_AcademicaDao;
	
	@Override
	public int create(Carga_Academica CA) {
		// TODO Auto-generated method stub
		return carga_AcademicaDao.create(CA);
	}

	@Override
	public int update(Carga_Academica CA) {
		// TODO Auto-generated method stub
		return carga_AcademicaDao.update(CA);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return carga_AcademicaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return carga_AcademicaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return carga_AcademicaDao.readAll();
	}

}
