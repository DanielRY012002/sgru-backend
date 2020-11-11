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

import org.springframework.stereotype.Repository;

import oracle.jdbc.OracleTypes;

import pe.edu.upeu.sysrubricas.dao.Tipo_instrumentoDao;
import pe.edu.upeu.sysrubricas.entity.Tipo_instrumento;


@Repository
public class Tipo_instrumentoDaoImpl implements Tipo_instrumentoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Tipo_instrumento t) {
		// TODO Auto-generated method stub
		String sql = "declare v_tip tipo_instrumento%rowtype; begin v_tip.nombre:=?; D_CRUD_TIPO_INSTRUMENTO.SPP_INS_TIPO_INSTRUMENTO(v_tip); end;";
		return jdbcTemplate.update(sql, t.getNombre());
	}

	@Override
	public int update(Tipo_instrumento t) {
		// TODO Auto-generated method stub
		String sql = "declare v_tip tipo_instrumento%rowtype; begin v_tip.id_tipo_instrumento:=?; v_tip.nombre:=?; v_tip.estado:=1; D_CRUD_TIPO_INSTRUMENTO.SPP_UPD_TIPO_INSTRUMENTO(v_tip); end;";
		return jdbcTemplate.update(sql, t.getId_tipo_instrumento(), t.getNombre());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql="declare v_id tipo_instrumento.id_tipo_instrumento%type; begin v_id:=?; D_CRUD_TIPO_INSTRUMENTO.SPP_DEL_TIPO_INSTRUMENTO(v_id); end;";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("D_CRUD_TIPO_INSTRUMENTO") // nombre del paquete
				.withProcedureName("SPP_READOPC_TIPO_INSTRUMENTO") // nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_TIPO_INSTRUMENTO", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("id_inf", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_TIP", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("D_CRUD_TIPO_INSTRUMENTO") // nombre del paquete
				.withProcedureName("SPP_READALL_TIPO_INSTRUMENTO") // nombre del procedimiento
				.declareParameters(
						new SqlOutParameter("CURSOR_TIPO_INSTRUMENTO", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public List<Map<String, Object>> list() {
		// TODO Auto-generated method stub
		String sql = "select * from tipo_instrumento";
		return jdbcTemplate.queryForList(sql);
	}

}
