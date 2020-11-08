package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.CursoDao;
import pe.edu.upeu.sysrubricas.entity.Curso;
import pe.edu.upeu.sysrubricas.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	public CursoDao cursodao;
	public int create(Curso c) {
		// TODO Auto-generated method stub
		return cursodao.create(c);
	}
	@Override
	public int update(Curso c) {
		// TODO Auto-generated method stub
		System.out.println("service: "+c.getNombre());
		return cursodao.update(c);
	}
	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cursodao.delete(id);
	}
	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return cursodao.read(id);
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return cursodao.readAll();
	}
}
