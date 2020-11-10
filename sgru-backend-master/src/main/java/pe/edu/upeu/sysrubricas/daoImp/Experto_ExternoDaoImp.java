package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.Experto_ExternoDao;
import pe.edu.upeu.sysrubricas.entity.Experto_Externo;

@Repository
public class Experto_ExternoDaoImp implements Experto_ExternoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int update(Experto_Externo eex) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EXPERTO_EXTERNO.SPP_update_EXPERTO_EXTERNO(?,?)", eex.getId_Experto_Externo(), eex.getId_Persona());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EXPERTO_EXTERNO.SPP_delete_EXPERTO_EXTERNO(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simplejdbcCall =  new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_EXPERTO_EXTERNO")
				.withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource();
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll(int id) {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_EXPERTO_EXTERNO")
				.withFunctionName("fn_listar_todo");
		return simplejdbcCall.execute();
	}

}
