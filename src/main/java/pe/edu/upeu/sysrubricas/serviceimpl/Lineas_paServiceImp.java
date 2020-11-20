package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Lineas_paDao;
import pe.edu.upeu.sysrubricas.entity.Lineas_pa;
import pe.edu.upeu.sysrubricas.service.Lineas_paService;

@Service
public class Lineas_paServiceImp implements Lineas_paService{
	
	@Autowired
	public Lineas_paDao lineas_padao;
	public int create(Lineas_pa lpa) {
		// TODO Auto-generated method stub
		return lineas_padao.create(lpa);
	}

	@Override
	public int update(Lineas_pa lpa) {
		// TODO Auto-generated method stub
		return lineas_padao.update(lpa);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return lineas_padao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return lineas_padao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return lineas_padao.readAll();
	}

}


//Creado por: Saul Olivas



