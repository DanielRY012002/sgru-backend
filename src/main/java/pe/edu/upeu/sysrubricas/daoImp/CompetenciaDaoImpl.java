//Creado por: Debora Alejandro

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

//import com.sun.xml.internal.ws.wsdl.writer.document.Types;

import oracle.jdbc.OracleTypes;
import pe.edu.upeu.sysrubricas.dao.CompetenciaDao;
import pe.edu.upeu.sysrubricas.entity.Competencia;

@Repository

public class CompetenciaDaoImpl implements CompetenciaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Competencia c) {
		// TODO Auto-generated method stub
		return 	 jdbcTemplate.update("call D_CRUD_COMPETENCIAS.SPP_create_COMPETENCIAS(?)", c.getDescripcion());
	}

	@Override
	public int update(Competencia c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_COMPETENCIAS.SPP_update_COMPETENCIAS(?,?)", c.getId_competencias(), c.getDescripcion());
	}
	@Override
	//este metodo permite eliminar una competencia
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call d_crud_competencias.spp_delete_competenicas(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
	//	System.out.println(id);
		//simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	    //.withCatalogName("d_crud_competencias") //nombre del paquete
		//.withFunctionName("f_listar") //nombre de la funcion
		//.declareParameters(new SqlOutParameter("cursor_competencias", OracleTypes.CURSOR, //esto solo para procedimientos
			//	new ColumnMapRowMapper()), new SqlParameter("id_competencia", Types.INTEGER)); //integer:tipo entero
		//SqlParameterSource in = new MapSqlParameterSource().addValue("id_competencia", id);
		
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("d_crud_competencias") //nombre del paquete
		.withFunctionName("fn_listar"); //nombre de la funcion
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);	
		return simpleJdbcCall.execute(in);	
	}
	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
//		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
//				.withCatalogName("d_crud_competencias") //nombre del paquete
//				.withFunctionName("f_listar") //nombre de la funcion
//				.declareParameters(new SqlOutParameter("cursor_COMPETENCIAS", OracleTypes.CURSOR, 
//						new ColumnMapRowMapper()));
//	return simpleJdbcCall.execute();
		
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
					.withCatalogName("d_crud_competencias") //nombre del paquete
					.withFunctionName("fn_listar_todo"); //nombre de la funcion
					return simpleJdbcCall.execute();
	}

}
