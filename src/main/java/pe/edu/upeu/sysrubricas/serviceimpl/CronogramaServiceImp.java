package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.CronogramaDao;
import pe.edu.upeu.sysrubricas.entity.Cronograma;
import pe.edu.upeu.sysrubricas.service.CronogramaService;

@Service

public class CronogramaServiceImp implements CronogramaService {
	
	@Autowired

	public CronogramaDao cronogramadao;
	public int create(Cronograma cg) {
		// TODO Auto-generated method stub
		return cronogramadao.create(cg);
	}

	@Override
	public int update(Cronograma cg) {
		// TODO Auto-generated method stub
		return cronogramadao.update(cg);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cronogramadao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cronogramadao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cronogramadao.readAll();
	}

}


//Creado por: Saul Olivas