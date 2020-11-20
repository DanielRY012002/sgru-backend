package pe.edu.upeu.sysrubricas.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.sysrubricas.entity.Alternativas_Estudiante;
import pe.edu.upeu.sysrubricas.service.Alternativas_Estudiante_Service;
@Service
public class Alternativas_Estudiante_ServiceImpl implements Alternativas_Estudiante_Service{

	@Autowired
	public Alternativas_Estudiante_ServiceImpl alternativasestudianteserviceImpl;
	public int create(Alternativas_Estudiante ae) {
		// TODO Auto-generated method stub
		return alternativasestudianteserviceImpl.create(ae);
	}

	@Override
	public int update(Alternativas_Estudiante ae) {
		// TODO Auto-generated method stub
		return alternativasestudianteserviceImpl.update(ae);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return alternativasestudianteserviceImpl.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return alternativasestudianteserviceImpl.read(id);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		return alternativasestudianteserviceImpl.readAll();
	}

	@Override
	public String prueba(String texto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
