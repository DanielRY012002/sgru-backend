package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.Reportar_informeDao;
import pe.edu.upeu.sysrubricas.entity.Reportar_informe;


@Repository
public class Reportar_informeDaoImpl implements Reportar_informeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Reportar_informe r) {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.update("call D_CRUD_INFORME.SPP_create_reportar_informe(?)");
	}

	@Override
	public int update(Reportar_informe r) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call D_CRUD_INFORME.SPP_update_INFORME(?,?)", r.getId_informe());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call d_crud_informe.spp_delete_informe(?)", id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("d_crud_informe") //nombre del paquete
				.withFunctionName("fn_listar"); //nombre de la funcion
				SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);	
				return simpleJdbcCall.execute(in);	
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub

		 simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
					.withCatalogName("d_crud_informe") //nombre del paquete
					.withFunctionName("fn_listar_todo"); //nombre de la funcion
					return simpleJdbcCall.execute();
	}

	
}
