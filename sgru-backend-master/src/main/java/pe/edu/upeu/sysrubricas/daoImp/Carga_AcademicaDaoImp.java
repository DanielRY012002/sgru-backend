package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.Carga_AcademicaDao;
import pe.edu.upeu.sysrubricas.entity.Carga_Academica;

@Repository
public class Carga_AcademicaDaoImp implements Carga_AcademicaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int create(Carga_Academica CA) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CARGA_ACADEMICA.SPP_create_CARGA_ACADEMICA(?)", CA.getCodigo_Docente());
	}

	@Override
	public int update(Carga_Academica CA) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CARGA_ACADEMICA.SPP_update_CARGA_ACADEMICA(?,?)", CA.getId_Programa_Academico(), CA.getCodigo_Docente());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CARGA_ACADEMICA.SPP_delete_CARGA_ACADEMICA(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
	    .withCatalogName("D_CRUD_CARGA_ACADEMICA")
	    .withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_CARGA_ACADEMICA")
		.withFunctionName("fn_listar_todo");
		return simplejdbcCall.execute();
	}

	
}
