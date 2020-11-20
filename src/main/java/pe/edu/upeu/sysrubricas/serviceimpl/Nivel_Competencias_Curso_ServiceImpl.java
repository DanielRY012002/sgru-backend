package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Nivel_Competencias_Curso_Dao;
import pe.edu.upeu.sysrubricas.entity.Nivel_Competencias_Curso;
import pe.edu.upeu.sysrubricas.service.Nivel_Competencias_Curso_Service;
@Service
public class Nivel_Competencias_Curso_ServiceImpl implements Nivel_Competencias_Curso_Service{

	@Autowired
	public Nivel_Competencias_Curso_Dao nivelompetenciascursodao;
	public int create(Nivel_Competencias_Curso ncc) {
		// TODO Auto-generated method stub
		return nivelompetenciascursodao.create(ncc);
	}

	@Override
	public int update(Nivel_Competencias_Curso ncc) {
		// TODO Auto-generated method stub
		return nivelompetenciascursodao.update(ncc);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return nivelompetenciascursodao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return nivelompetenciascursodao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return nivelompetenciascursodao.readAll();
	}

	@Override
	public String prueba(String texto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
