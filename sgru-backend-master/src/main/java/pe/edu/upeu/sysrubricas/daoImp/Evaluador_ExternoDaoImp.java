package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.Evaluador_ExternoDao;
import pe.edu.upeu.sysrubricas.entity.Evaluador_Externo;

@Repository
public class Evaluador_ExternoDaoImp implements Evaluador_ExternoDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int create(Evaluador_Externo ee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EVALUADOR_EXTERNO.SPP_create_EVALUADOR_EXTERNO(?)", ee.getEspecialidad());
	}

	@Override
	public int update(Evaluador_Externo ee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EVALUADOR_EXTERNO.SPP_update_EVALUADOR_EXTERNO(?,?)", ee.getId_Evaluador_Externo(), ee.getEspecialidad());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EVALUADOR_EXTERNO.SPP_delete_EVALUADOR_EXTERNO(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
			  .withCatalogName("D_CRUD_EVALUADOR_EXTERNO")
			  .withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_EVALUADOR_EXTERNO")
				.withFunctionName("fn_listar_todo");
		return simplejdbcCall.execute();
	}

}
