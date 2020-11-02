package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.CursoDao;
import pe.edu.upeu.sysrubricas.entity.Curso;

@Repository
public class CursoDaoImpl implements CursoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Curso c) {
		// TODO Auto-generated method stub
		return 	 jdbcTemplate.update("call D_CRUD_CURSO.SPP_INS_CURSO(?,?,?,?,?)", c.getNombre(), c.getCr(), c.getHt(), c.getHp(), c.getEstado());
	}

	@Override
	public int update(Curso c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CURSO.SPP_UPD_CURSO(?,?,?,?,?,?)", c.getId_curso(), c.getNombre(), c.getCr(), c.getHt(), c.getHp(), c.getEstado());
	}
	@Override
	//este metodo permite eliminar una competencia
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CURSO.SPP_DEL_CURSO(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		//System.out.println(id);
		//simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
	    //.withCatalogName("d_crud_competencias") //nombre del paquete
		//.withFunctionName("f_listar") //nombre de la funcion
		//.declareParameters(new SqlOutParameter("cursor_competencias", OracleTypes.CURSOR, //esto solo para procedimientos
			//	new ColumnMapRowMapper()), new SqlParameter("id_competencia", Types.INTEGER)); //integer:tipo entero
		//SqlParameterSource in = new MapSqlParameterSource().addValue("id_competencia", id);
		
		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_CURSO") //nombre del paquete
		.withFunctionName("SPF_BUSCAR_CURSO"); //nombre de la funcion
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
					.withCatalogName("D_CRUD_CURSO") //nombre del paquete
					.withFunctionName("SPF_LISTAR_CURSO"); //nombre de la funcion
					return simpleJdbcCall.execute();
	}
}
