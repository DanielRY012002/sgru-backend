package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.EstudianteDao;
import pe.edu.upeu.sysrubricas.entity.Estudiante;
import pe.edu.upeu.sysrubricas.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService{
	@Autowired
	public EstudianteDao estudiantedao;
	@Override
	public int create(Estudiante e) {
		// TODO Auto-generated method stub
		return estudiantedao.create(e);
	}

	@Override
	public int update(Estudiante e) {
		// TODO Auto-generated method stub
		return estudiantedao.update(e);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return estudiantedao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return estudiantedao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return estudiantedao.readAll();
	}

}
