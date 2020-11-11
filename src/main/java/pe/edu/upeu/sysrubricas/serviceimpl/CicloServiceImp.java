package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.CicloDao;
import pe.edu.upeu.sysrubricas.entity.Ciclo;
import pe.edu.upeu.sysrubricas.service.CicloService;

@Service

public class CicloServiceImp implements CicloService{
	
	@Autowired
	public CicloDao ciclodao;
	public int create(Ciclo cl) {
		// TODO Auto-generated method stub
		return ciclodao.create(cl);
	}

	@Override
	public int update(Ciclo cl) {
		// TODO Auto-generated method stub
		return ciclodao.update(cl);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ciclodao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return ciclodao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return ciclodao.readAll();
	}

}


//Creado por: Saul Olivas
