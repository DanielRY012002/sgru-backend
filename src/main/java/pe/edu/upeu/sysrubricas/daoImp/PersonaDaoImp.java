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

import oracle.jdbc.internal.OracleTypes;
import pe.edu.upeu.sysrubricas.dao.PersonaDao;
import pe.edu.upeu.sysrubricas.entity.Persona;

@Repository
public class PersonaDaoImp implements PersonaDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Persona p) {
		String sql = "declare v_per persona%rowtype; begin v_per.nombres:=?; v_per.apellidos:=?; v_per.sexo:=?; v_per.n_doc:=?; v_per.id_tipo_doc:=?; D_CRUD_PERSONA.SPP_INS_PERSONA(v_per); end;";
		return jdbcTemplate.update(sql, p.getNombres(), p.getApellidos(), p.getSexo(), p.getN_doc(),p.getId_tipo_doc());
	}

	@Override
	public int update(Persona p) {
		String sql = "declare v_per persona%rowtype; begin v_per.id_persona:=?; v_per.nombres:=?; v_per.apellidos:=?; v_per.sexo:=?; v_per.n_doc:=?; v_per.id_tipo_doc:=?; v_per.estado:=1; D_CRUD_PERSONA.SPP_UDP_PERSONA(v_per); end;";
		return jdbcTemplate.update(sql, p.getId_persona(), p.getNombres(), p.getApellidos(), p.getSexo(), p.getN_doc(),p.getId_tipo_doc());
	}

	@Override
	public int delete(int id) {
		String sql="declare v_id persona.id_persona%type; begin v_id:=?; D_CRUD_PERSONA.SPP_ELI_PERSONA(v_id); end;";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Map<String, Object> read(int id) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("D_CRUD_PERSONA")
				.withProcedureName("SPP_READOPC_PERSONA").declareParameters(new SqlOutParameter("CURSOR_PERSONA", OracleTypes.CURSOR, new ColumnMapRowMapper()),
						new SqlParameter("id_inf", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_PER", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("D_CRUD_PERSONA")
				.withProcedureName("SPP_READALL_PERSONA").declareParameters(new SqlOutParameter("CURSOR_PERSONAS", OracleTypes.CURSOR, new ColumnMapRowMapper()));
		return simpleJdbcCall.execute();
	}

	@Override
	public List<Map<String, Object>> list() {
		String sql = "select * from persona";
		return jdbcTemplate.queryForList(sql);
	}

}
