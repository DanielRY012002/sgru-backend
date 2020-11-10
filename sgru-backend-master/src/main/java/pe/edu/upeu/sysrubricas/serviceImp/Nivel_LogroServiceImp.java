package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Nivel_LogroDao;
import pe.edu.upeu.sysrubricas.entity.Nivel_Logro;
import pe.edu.upeu.sysrubricas.service.Nivel_LogroService;

@Service
public class Nivel_LogroServiceImp implements Nivel_LogroService{

	@Autowired
	private Nivel_LogroDao nivel_LogroDao;
	
	@Override
	public int create(Nivel_Logro NL) {
		// TODO Auto-generated method stub
		return nivel_LogroDao.create(NL);
	}

	@Override
	public int update(Nivel_Logro NL) {
		// TODO Auto-generated method stub
		System.out.println("service: "+NL.getNombre());
		return nivel_LogroDao.update(NL);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return nivel_LogroDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return nivel_LogroDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return nivel_LogroDao.readAll();
	}

}
