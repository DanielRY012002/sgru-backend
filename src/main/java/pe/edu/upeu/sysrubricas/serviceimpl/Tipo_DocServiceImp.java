package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Tipo_DocDao;
import pe.edu.upeu.sysrubricas.entity.Tipo_Doc;
import pe.edu.upeu.sysrubricas.service.Tipo_DocService;

@Service
public class Tipo_DocServiceImp implements Tipo_DocService {
	@Autowired
	private Tipo_DocDao tipo_DocDao;

	@Override
	public int create(Tipo_Doc t) {
		return tipo_DocDao.create(t);
	}

	@Override
	public int update(Tipo_Doc t) {
		return tipo_DocDao.update(t);
	}

	@Override
	public int delete(int id) {
		return tipo_DocDao.delete(id);
	}

	@Override
	public Tipo_Doc read(int id) {
		return tipo_DocDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		return tipo_DocDao.readAll();
	}

}
