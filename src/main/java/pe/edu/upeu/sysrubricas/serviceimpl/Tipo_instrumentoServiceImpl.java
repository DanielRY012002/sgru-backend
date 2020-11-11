package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import pe.edu.upeu.sysrubricas.dao.Tipo_instrumentoDao;

import pe.edu.upeu.sysrubricas.entity.Tipo_instrumento;
import pe.edu.upeu.sysrubricas.service.Tipo_instrumentoService;

@Service
public class Tipo_instrumentoServiceImpl implements Tipo_instrumentoService{
	
	@Autowired

	public Tipo_instrumentoDao tipo_instrumentodao;
	public int create(Tipo_instrumento t) {
		// TODO Auto-generated method stub
		return tipo_instrumentodao.create(t);
	}


	@Override
	public int update(Tipo_instrumento t) {
		// TODO Auto-generated method stub
		//System.out.println("service: "+t.getNombre());
		return tipo_instrumentodao.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipo_instrumentodao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return tipo_instrumentodao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return tipo_instrumentodao.readAll();
	}
	@Override
	public List<Map<String, Object>> list() {
		// TODO Auto-generated method stub
		return tipo_instrumentodao.list();
	}

	
}
