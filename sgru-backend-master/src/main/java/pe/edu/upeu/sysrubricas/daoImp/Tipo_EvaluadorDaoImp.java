package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.Tipo_EvaluadorDao;
import pe.edu.upeu.sysrubricas.entity.Tipo_Evaluador;

@Repository
public class Tipo_EvaluadorDaoImp implements Tipo_EvaluadorDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int create(Tipo_Evaluador te) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_TIPO_EVALUADOR.SPP_create_TIPO_EVALUADOR(?)", te.getNombre());
	}

	@Override
	public int update(Tipo_Evaluador te) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_TIPO_EVALUADOR.SPP_update_TIPO_EVALUADOR(?,?)", te.getId_Tipo_Evaluador(), te.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_TIPO_EVALUADOR.SPP_delete_TIPO_EVALUADOR(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_TIPO_EVALUADOR")
				.withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource();
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_TIPO_EVALUADOR")
				.withFunctionName("fn_listar_todo");
		return simplejdbcCall.execute();
	}

}
