//Creado por: Debora Alejandro

package pe.edu.upeu.sysrubricas.daoImp;

import java.sql.Types;
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
import pe.edu.upeu.sysrubricas.dao.CompetenciaDao;
import pe.edu.upeu.sysrubricas.entity.Competencias;

@Repository

public class CompetenciaDaoImpl implements CompetenciaDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Competencias c) {
		// TODO Auto-generated method stub
		System.out.println(c.getNombre());
		return jdbcTemplate.update("declare P_ST_TABLA COMPETENCIAS%ROWTYPE; begin  P_ST_TABLA.TIPO_COMPETENCIAS_ID:=?; P_ST_TABLA.NOMBRE:=?; P_ST_TABLA.DESCRIPCION:=?; D_CRUD_COMPETENCIAS.SPP_INS_COMPETENCIAS(P_ST_TABLA); end;",
				c.getTipo_competencias_id(),
				c.getNombre(),
				c.getDescripcion());
	}
	@Override
	public int update(Competencias c) {
		System.out.println(c.getCompetencias_id());		
		System.out.println(c.getTipo_competencias_id());
		System.out.println(c.getNombre());
		System.out.println(c.getDescripcion());
		// TODO Auto-generated method stub
		return jdbcTemplate.update("declare P_ST_TABLA COMPETENCIAS%ROWTYPE; begin P_ST_TABLA.COMPETENCIAS_ID:=?; P_ST_TABLA.TIPO_COMPETENCIAS_ID:=?; P_ST_TABLA.NOMBRE:=?; P_ST_TABLA.DESCRIPCION:=?; P_ST_TABLA.ESTADO:=1; D_CRUD_COMPETENCIAS.SPP_UPD_COMPETENCIAS(P_ST_TABLA); end;",
							c.getCompetencias_id(),
							c.getTipo_competencias_id(), 
							c.getNombre(),							
							c.getDescripcion()
							);		
	}
	@Override
	//este metodo permite eliminar una competencia
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_COMPETENCIAS.SPP_DEL_COMPETENCIAS(?)", id);
	}
	@Override
	////metodo que permite buscar por id
	public Map<String, Object> read(int id) {
		System.out.println(id);
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
		.withCatalogName("D_CRUD_COMPETENCIAS") //nombre del paquete
		.withProcedureName("SPP_BUSCAR_COMPETENCIAS") //nombre del procedimiento
		.declareParameters(new SqlOutParameter("CURSOR_COMPETENCIAS", OracleTypes.CURSOR, 
				new ColumnMapRowMapper()), new SqlParameter("ID_COMP", Types.INTEGER));
		SqlParameterSource in = new MapSqlParameterSource().addValue("ID_COMP", id);
		return simpleJdbcCall.execute(in);
	}
	@Override
	//metodo que permite listar los datos de competencias
	public Map<String, Object> readAll() {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("D_CRUD_COMPETENCIAS") //nombre del paquete
				.withProcedureName("SPP_LISTAR_COMPETENCIAS") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_COMPETENCIAS", OracleTypes.CURSOR, 
						new ColumnMapRowMapper()));
				return simpleJdbcCall.execute();
					
	}
	@Override
	public String prueba(String texto) {
		// TODO Auto-generated method stub
		return texto;
	}
}