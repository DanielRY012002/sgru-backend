package pe.edu.upeu.sysrubricas.daoImp;

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
import org.springframework.stereotype.Repository;

import com.sun.xml.internal.ws.wsdl.writer.document.Types;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.sysrubricas.dao.Avance_pyDao;
import pe.edu.upeu.sysrubricas.entity.Avance_py;

public class Avance_pyDaoImp implements Avance_pyDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Avance_py apy) {
		String sql = "insert into rol (id_cronograma, id_proyecto, estado) values (?, ?, ?)";
		// TODO Auto-generated method stub
		return jdbcTemplate.update(sql, apy.getId_cronograma(), apy.getId_proyecto(), apy.getEstado());
	}

	@Override
	public int update(Avance_py apy) {
		String sql = "update rol set id_cronograma = ?, id_proyecto = ?, estado = ?, where id_avance_py = ?";
		// TODO Auto-generated method stub
		return jdbcTemplate.update(sql, apy.getId_cronograma(), apy.getId_proyecto(), apy.getEstado(), apy.getId_avance_py());
	}

	@Override
	public int delete(int id) {
		String sql = "delete from persona where id_avance_py = ?";
		// TODO Auto-generated method stub
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Map<String,Object> read(int id) {
//		System.out.println(id);
			//simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		    //.withCatalogName("d_crud_avance_py") //nombre del paquete
			//.withFunctionName("f_listar") //nombre de la funcion
			//.declareParameters(new SqlOutParameter("cursor_competencias", OracleTypes.CURSOR, //esto solo para procedimientos
				//	new ColumnMapRowMapper()), new SqlParameter("id_competencia", Types.INTEGER)); //integer:tipo entero
			//SqlParameterSource in = new MapSqlParameterSource().addValue("id_competencia", id);
			
			 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withCatalogName("d_crud_avance_py") //nombre del paquete
			.withFunctionName("fn_listar"); //nombre de la funcion
			SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);	
			return simpleJdbcCall.execute(in);	
	}

	@Override
	public Map<String, Object> readAll() {
	// TODO Auto-generated method stub
//	simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//			.withCatalogName("d_crud_avance_py") //nombre del paquete
//			.withFunctionName("f_listar") //nombre de la funcion
//			.declareParameters(new SqlOutParameter("cursor_COMPETENCIAS", OracleTypes.CURSOR, 
//					new ColumnMapRowMapper()));
//return simpleJdbcCall.execute();
	
	 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("d_crud_avance_py") //nombre del paquete
				.withFunctionName("fn_listar_todo"); //nombre de la funcion
				return simpleJdbcCall.execute();
	}
}
