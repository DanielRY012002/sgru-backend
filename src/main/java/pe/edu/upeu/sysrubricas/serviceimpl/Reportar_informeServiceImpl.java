package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Reportar_informeDao;
import pe.edu.upeu.sysrubricas.entity.Reportar_informe;
import pe.edu.upeu.sysrubricas.service.Reportar_informeService;

@Service

public class Reportar_informeServiceImpl implements Reportar_informeService{
	
	@Autowired

	public Reportar_informeDao reportar_informedao;
	public int create(Reportar_informe r) {
		// TODO Auto-generated method stub
		return reportar_informedao.create(r);
	}

	@Override
	public int update(Reportar_informe r) {
		// TODO Auto-generated method stub
		return reportar_informedao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return reportar_informedao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return reportar_informedao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return reportar_informedao.readAll();
	}

}

