package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Carga_academicaDao;
import pe.edu.upeu.sysrubricas.entity.Carga_academica;
import pe.edu.upeu.sysrubricas.service.Carga_academicaService;
@Service
public class Carga_academicaServiceImpl implements Carga_academicaService{
	@Autowired
	public Carga_academicaDao carga_academicadao;
	@Override
	public int create(Carga_academica c) {
		// TODO Auto-generated method stub
		return carga_academicadao.create(c);
	}

	@Override
	public int update(Carga_academica c) {
		// TODO Auto-generated method stub
		return carga_academicadao.update(c);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return carga_academicadao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return carga_academicadao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return carga_academicadao.readAll();
	}

}
