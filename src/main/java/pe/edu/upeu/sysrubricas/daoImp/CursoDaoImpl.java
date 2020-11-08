package pe.edu.upeu.sysrubricas.daoImp;
import java.sql.Types;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;
import oracle.jdbc.internal.OracleTypes;
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
		return 	 jdbcTemplate.update("call D_CRUD_CURSO.SPP_INS_CURSO(?,?,?,?)", c.getNombre(), c.getCr(), c.getHt(), c.getHp());
	}

	@Override
	public int update(Curso c) {
		System.out.println(c.getNombre());
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CURSO.SPP_UPD_CURSO(?,?,?,?,?)", c.getId_curso(), c.getNombre(), c.getCr(), c.getHt(), c.getHp());
	}
	@Override
	//este metodo permite eliminar una competencia
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_CURSO.SPP_DELLOG_CURSO(?)", id);
	}
	@Override
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_CURSO") //nombre del paquete
		.withProcedureName("SPP_BUSCAR_CURSO") //nombre del procedimiento
		.declareParameters(new SqlOutParameter("cursor_cursos", OracleTypes.CURSOR, new ColumnMapRowMapper()), new SqlParameter("idcurso", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("idcurso", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
			.withCatalogName("D_CRUD_CURSO") //nombre del paquete
			.withProcedureName("SPP_LISTAR_CURSO") //nombre del procedimiento
			.declareParameters(new SqlOutParameter("cursor_cursos", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
			return simpleJdbcCall.execute();
	}


	
	
}
