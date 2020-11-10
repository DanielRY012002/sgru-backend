package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.DocenteDao;
import pe.edu.upeu.sysrubricas.entity.Docente;

@Repository
public class DocenteDaoImp implements DocenteDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpllejdbcCall;
	
	@Override
	public int create(Docente d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_DOCENTE.SPP_create_DOCENTE(?)", d.getEstado());
	}

	@Override
	public int update(Docente d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_DOCENTE.SPP_update_Docente(?,?)", d.getId_Persona(), d.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_DOCENTE.SPP_delete_Docente(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpllejdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_DOCENTE")
		.withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simpllejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpllejdbcCall = new SimpleJdbcCall(jdbcTemplate)
	    .withCatalogName("D_CRUD_DOCENTE")
	    .withFunctionName("fn_listar_todo");
		return simpllejdbcCall.execute();
	}

}
