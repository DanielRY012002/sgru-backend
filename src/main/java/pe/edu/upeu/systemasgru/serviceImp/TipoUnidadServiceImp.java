package pe.edu.upeu.systemasgru.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.systemasgru.dao.TipoUnidadDao;
import pe.edu.upeu.systemasgru.entity.TipoUnidad;
import pe.edu.upeu.systemasgru.service.TipoUnidadService;

@Service
public class TipoUnidadServiceImp implements TipoUnidadService{
	@Autowired
	private TipoUnidadDao 	tipoUnidadDao;
	
	@Override
	public int create(TipoUnidad t) {
		// TODO Auto-generated method stub
		return tipoUnidadDao.create(t);
	}

	@Override
	public int update(TipoUnidad t) {
		// TODO Auto-generated method stub
		return tipoUnidadDao.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return tipoUnidadDao.delete(id);
	}

	@Override
	public TipoUnidad read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
