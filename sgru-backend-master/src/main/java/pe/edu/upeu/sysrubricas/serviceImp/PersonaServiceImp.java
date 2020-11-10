package pe.edu.upeu.sysrubricas.serviceImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.PersonaDao;
import pe.edu.upeu.sysrubricas.entity.Persona;
import pe.edu.upeu.sysrubricas.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService{

	@Autowired
	public PersonaDao personaDao;
	
	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.update(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

}
