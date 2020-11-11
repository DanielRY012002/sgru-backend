package pe.edu.upeu.sysrubricas.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.sysrubricas.dao.DocenteDao;
import pe.edu.upeu.sysrubricas.entity.Docente;

@Component

public class DocenteDaoImp implements DocenteDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Docente d) {	
		// TODO Auto-generated method stub	

		return jdbcTemplate.update("CALL D_CRUD_COMPETENCIAS.SPP_create_DOCENTE(?, ?, ?)" , d.getId_persona() , d.getCodigo_docente() , d.getEstado());	

	}

	@Override 
	public int update(Docente d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL D_CRUD_COMPETENCIAS.SPP_create_DOCENTE(?, ?, ?)" , d.getId_persona() , d.getCodigo_docente() , d.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL D_CRUD_COMPETENCIAS.SPP_create_DOCENTE(?)" , id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub

		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_DOCENTE")
		.withProcedureName("SPP_LID_DOCENTE");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_DOCENTE")
		.withProcedureName("SPP_LIS_DOCENTE");
		return simpleJdbcCall.execute();
	}

}



//Creado por: Saul Olivas
