package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.PersonaDao;
import pe.edu.upeu.sysrubricas.entity.Persona;
import pe.edu.upeu.sysrubricas.service.PersonaService;

@Service
public class PersonaServiceImp implements PersonaService {
	@Autowired
	private PersonaDao personaDao;

	@Override
	public int create(Persona p) {
		return personaDao.create(p);
	}

	@Override
	public int update(Persona p) {
		return personaDao.update(p);
	}

	@Override
	public int delete(int id) {
		return personaDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		return personaDao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		return personaDao.readAll();
	}

	@Override
	public List<Map<String, Object>> list() {
		return personaDao.list();
	}

}
