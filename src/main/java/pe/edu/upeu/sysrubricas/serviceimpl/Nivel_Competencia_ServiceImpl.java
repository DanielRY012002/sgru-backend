package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.Nivel_Competencias_Dao;
import pe.edu.upeu.sysrubricas.entity.Nivel_Competencias;
import pe.edu.upeu.sysrubricas.service.Nivel_Competencias_Service;

@Service
public class Nivel_Competencia_ServiceImpl implements Nivel_Competencias_Service{
	@Autowired
	private Nivel_Competencias_Dao nivelcompetenciadao;

	@Override
	public int create(Nivel_Competencias nc) {
		// TODO Auto-generated method stub
		return nivelcompetenciadao.create(nc);
	}

	@Override
	public int update(Nivel_Competencias nc) {
		// TODO Auto-generated method stub
		return nivelcompetenciadao.update(nc);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return nivelcompetenciadao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return nivelcompetenciadao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return nivelcompetenciadao.readAll();
	}

	@Override
	public String prueba(String texto) {
		// TODO Auto-generated method stub
		return null;
	}
}
