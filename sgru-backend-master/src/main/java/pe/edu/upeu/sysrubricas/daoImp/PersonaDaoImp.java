package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.PersonaDao;
import pe.edu.upeu.sysrubricas.entity.Persona;

@Repository
public class PersonaDaoImp implements PersonaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int update(Persona p) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_PERSONA.SPP_update_PERSONA(?,?)", p.getId_Persona(), 
				                                                                  p.getNombres());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_PERSONA.SPP_delete_PERSONA(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simplejdbcCall =  new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_PERSONA")
				.withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource();
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_PERSONA")
				.withFunctionName("fn_listar_todo");
		return simplejdbcCall.execute();
	}

}
