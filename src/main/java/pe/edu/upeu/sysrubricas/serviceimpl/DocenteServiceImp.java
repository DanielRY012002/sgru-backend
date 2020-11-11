package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.DocenteDao;
import pe.edu.upeu.sysrubricas.entity.Docente;
import pe.edu.upeu.sysrubricas.service.DocenteService;

@Service

public class DocenteServiceImp implements DocenteService{
	
	@Autowired

	public DocenteDao docentedao;
	public int create(Docente d) {
		// TODO Auto-generated method stub
		return docentedao.create(d);
	}

	@Override
	public int update(Docente d) {
		// TODO Auto-generated method stub
		return docentedao.update(d);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return docentedao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return docentedao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return docentedao.readAll();
	}

}


//Creado por: Saul Olivas