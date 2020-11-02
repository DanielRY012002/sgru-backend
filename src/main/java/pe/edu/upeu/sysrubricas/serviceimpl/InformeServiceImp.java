package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.InformeDao;
import pe.edu.upeu.sysrubricas.entity.Informe;
import pe.edu.upeu.sysrubricas.service.InformeService;

@Service
public class InformeServiceImp implements InformeService {
	@Autowired
	private InformeDao informeDao;

	@Override
	public int create(Informe i) {
		// TODO Auto-generated method stub
		return informeDao.create(i);
	}

	@Override
	public int update(Informe i) {
		// TODO Auto-generated method stub
		return informeDao.update(i);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return informeDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return informeDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return informeDao.readAll();
	}

}
