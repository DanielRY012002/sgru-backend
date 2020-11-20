package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Estado_civilDao;
import pe.edu.upeu.sysrubricas.entity.Estado_civil;
import pe.edu.upeu.sysrubricas.service.Estado_civilService;

@Service
public class Estado_civilServiceImpl implements Estado_civilService{
	@Autowired
	public Estado_civilDao estado_civildao;
	@Override
	public int create(Estado_civil e) {
		// TODO Auto-generated method stub
		return estado_civildao.create(e);
	}

	@Override
	public int update(Estado_civil e) {
		// TODO Auto-generated method stub
		return estado_civildao.update(e);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return estado_civildao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return estado_civildao.read(id);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return estado_civildao.readAll();
	}
	
}
