package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.EvaluadorDao;
import pe.edu.upeu.sysrubricas.entity.Evaluador;

@Repository
public class EvaluadorDaoImp implements EvaluadorDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int create(Evaluador e) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EVALUADOR.SPP_create_EVALUADOR(?)", e.getEstado());
	}

	@Override
	public int update(Evaluador e) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EVALUADOR.SPP_update_EVALUADOR(?,?)", e.getId_Evaluador(), e.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_EVALUADOR.SPP_delete_EVALUADOR(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
	    simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
	    		.withCatalogName("D_CRUD_EVALUADOR")
	    		.withFunctionName("fn_listar");
	    SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_EVALUADOR")
				.withFunctionName("fn_listar_todo");
		return simplejdbcCall.execute();
	}

}
