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
import pe.edu.upeu.sysrubricas.entity.Cronograma;
import pe.edu.upeu.sysrubricas.dao.CronogramaDao;

@Component

public class CronogramaDaoImp implements CronogramaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Cronograma cg) {	
		// TODO Auto-generated method stub	

		return jdbcTemplate.update("CALL D_CRUD_CRONOGRAMA.SPP_INS_CRONOGRAMA(?, ?, ?)" ,  cg.getEvento(), cg.getFecha_ini() , cg.getFecha_fin());	

	}

	@Override 
	public int update(Cronograma cg) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL D_CRUD_CRONOGRAMA.SPP_UPD_CRONOGRAMA(?, ?, ?, ?, ?)" , cg.getId_cronograma(), cg.getEvento() , cg.getFecha_ini() , cg.getFecha_fin() , cg.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL D_CRUD_CRONOGRAMA.SPP_ins_CRONOGRAMA(?)" , id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub

		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_CRONOGRAMA")
		.withProcedureName("SPP_BUSCAR_CRONOGRAMA");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_CRONOGRAMA")
		.withProcedureName("SPP_LISTAR_CRONOGRAMA");
		return simpleJdbcCall.execute();
	}

}



//Creado por: Saul Olivas

