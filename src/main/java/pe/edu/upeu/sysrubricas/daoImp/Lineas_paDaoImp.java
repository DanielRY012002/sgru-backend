package pe.edu.upeu.sysrubricas.daoImp;

import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.sysrubricas.entity.Ciclo;
import pe.edu.upeu.sysrubricas.entity.Lineas_pa;
import pe.edu.upeu.sysrubricas.dao.Lineas_paDao;

@Repository
public class Lineas_paDaoImp implements Lineas_paDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	@Override
	public int create(Lineas_pa lpa) {	
		// TODO Auto-generated method stub	

		return jdbcTemplate.update("CALL D_CRUD_LINEAS_PA.SPP_INS_LINEAS_PA(?)" ,  lpa.getNombre());	

	}

	@Override 
	public int update(Lineas_pa lpa) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL D_CRUD_LINEAS_PA.SPP_UPD_LINEAS_PA(?, ?)" , lpa.getIdlineas_pa(), lpa.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("CALL D_CRUD_LINEAS_PA.SPP_DELLOG_LINEAS_PA(?)" , id);
	}

	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_CICLO") //nombre del paquete
		.withProcedureName("SPP_BUSCAR_CICLO") //nombre del procedimiento
		.declareParameters(new SqlOutParameter("cursor_ciclos", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idlineas_pa", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("IDCICLO", id);
		return simpleJdbcCall.execute(in);
	}
	
	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withCatalogName("D_CRUD_CICLO") //nombre del paquete
			.withProcedureName("SPP_LISTAR_CICLO") //nombre del procedimiento
			.declareParameters(new SqlOutParameter("cursor_ciclos", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
			return simpleJdbcCall.execute();
	}

}



//Creado por: Saul Olivas



