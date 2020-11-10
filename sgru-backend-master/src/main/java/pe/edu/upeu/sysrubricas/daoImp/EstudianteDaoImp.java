package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.EstudianteDao;
import pe.edu.upeu.sysrubricas.entity.Estudiante;

@Repository
public class EstudianteDaoImp implements EstudianteDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Estudiante e) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_ESTUDIANTE.SPP_create_ESTUDIANTE(?)", e.getCodigo_Estudiante());
	}

	@Override
	public int update(Estudiante e) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_ESTUDIANTE.SPP_update_ESTUDIANTE(?,?)", e.getId_Persona(), e.getCodigo_Estudiante());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_ESTUDIANTE.SPP.delete_ESTUDIANTE(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall =  new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_ESTUDIANTE")
		.withFunctionName("fn_listar");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall =  new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_ESTUDIANTE")
				.withFunctionName("fn_listar_todo");
		return simpleJdbcCall.execute();
	}

}
