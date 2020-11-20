package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.dao.AlternativasDao;
import pe.edu.upeu.sysrubricas.entity.Alternativas;
import pe.edu.upeu.sysrubricas.service.AlternativaService;

@Service

public class AlterntivaServiceImpl implements AlternativaService{

	@Autowired
	
	public AlternativasDao alternativadao;
	
	public int create(Alternativas a) {
		// TODO Auto-generated method stub
		return alternativadao.create(a);
	}

	@Override
	public int update(Alternativas a) {
		// TODO Auto-generated method stub
		return alternativadao.update(a);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return alternativadao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return alternativadao.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return alternativadao.readAll();
	}

	@Override
	public String prueba(String texto) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
