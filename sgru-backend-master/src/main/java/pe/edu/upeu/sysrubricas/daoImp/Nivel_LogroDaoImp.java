package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;
import java.util.Map.Entry;

import oracle.jdbc.internal.OracleTypes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;


import pe.edu.upeu.sysrubricas.dao.Nivel_LogroDao;
import pe.edu.upeu.sysrubricas.entity.Nivel_Logro;

@Repository
public class Nivel_LogroDaoImp implements Nivel_LogroDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simplejdbcCall;
	
	@Override
	public int create(Nivel_Logro NL) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_NIVEL_LOGRO.SPP_create_NIVEL_LOGRO(?)", NL.getNombre());
	}

	@Override
	public int update(Nivel_Logro NL) {
		System.out.println(NL.getNombre());
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_NIVEL_LOGRO-SPP_update_NIVEL_LOGRO(?,?)", NL.getId_Nivel_Logro(), NL.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_NIVEL_LOGRO.SPP_delete_NIVEL_LOGRO(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		// TODO Auto-generated method stub
		simplejdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_NIVEL_LOGRO") // nombre del paquete
				.withFunctionName("fn_listar") // nombre de la funcion
				.declareParameters(new SqlOutParameter("t_NIVEL_LOGRO", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()), new SqlOutParameter("id_NIVEL_LOGRO", OracleTypes.NUMBER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("id_NIVEL_LOGRO", id);
		return simplejdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simplejdbcCall =  new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_NIVEL_LOGRO") // nombre del paquete
				.withFunctionName("fn_listar_todo") // nombre de la funcion
		        .declareParameters(new SqlOutParameter("cursor_Nivel_Logro", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));
		return simplejdbcCall.execute();
	}

	@Override
	public void convertiMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		Nivel_Logro nivel_Logro =  new Nivel_Logro();
		for(Entry<String, Object> entry : map.entrySet()) {
			System.out.println("entry key: "+entry.getKey());
			System.out.println("Object value: "+entry.getValue());
		}
		
	}

}
