//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.RubricasDao;
import pe.edu.upeu.sysrubricas.entity.Rubricas;
import pe.edu.upeu.sysrubricas.service.RubricaService;

@Service
public class RubricaServiceImpl implements RubricaService {
	@Autowired
	
	public RubricasDao rubricasdao;
	
	public int create(Rubricas r) {
		// TODO Auto-generated method stub
		return rubricasdao.create(r);
	}

	@Override
	public int update(Rubricas r) {
		// TODO Auto-generated method stub
		return rubricasdao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return rubricasdao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return rubricasdao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return rubricasdao.readAll();
	}

}
