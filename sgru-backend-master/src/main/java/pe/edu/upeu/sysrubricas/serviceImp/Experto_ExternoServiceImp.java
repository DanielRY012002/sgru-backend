package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Experto_ExternoDao;
import pe.edu.upeu.sysrubricas.entity.Experto_Externo;
import pe.edu.upeu.sysrubricas.service.Experto_ExternoService;

@Service
public class Experto_ExternoServiceImp implements Experto_ExternoService{

	@Autowired
	public Experto_ExternoDao experto_externoDao;
	
	@Override
	public int update(Experto_Externo eex) {
		// TODO Auto-generated method stub
		return experto_externoDao.update(eex);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return experto_externoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return experto_externoDao.read(id);
	}

	@Override
	public Map<String, Object> readAll(int id) {
		// TODO Auto-generated method stub
		return experto_externoDao.readAll(id);
	}

}
