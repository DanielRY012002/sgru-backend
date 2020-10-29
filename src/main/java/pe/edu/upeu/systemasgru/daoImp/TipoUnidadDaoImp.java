package pe.edu.upeu.systemasgru.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.systemasgru.dao.TipoUnidadDao;
import pe.edu.upeu.systemasgru.entity.TipoUnidad;


@Repository
public class TipoUnidadDaoImp implements TipoUnidadDao{
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(TipoUnidad t) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call pk_tipoUnidad.sp_create_tipoUnidad(?)", t.getNombre());
	}

	@Override
	public int update(TipoUnidad t) {
		// TODO Auto-generated method stub
		return  jdbcTemplate.update("call pk_tipoUnidad.sp_update_tipoUnidad(?,?)", t.getId_tipo_unidad(),t.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_tipoUnidad.sp_delete_tipoUnidad(?)", id);
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
