package pe.edu.upeu.sysrubricas.daoImp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.InformeDao;
import pe.edu.upeu.sysrubricas.entity.Informe;

@Repository
public class InformeDaoImp implements InformeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public int create(Informe i) {
		// TODO Auto-generated method stub
		String sql = "call D_CRUD_INFORME.SPP_INS_INFORME(?,?)";
		return jdbcTemplate.update(sql, i.getId_resultados(), i.getEstado());
	}

	@Override
	public int update(Informe i) {
		// TODO Auto-generated method stub
		String sql = "call D_CRUD_INFORME.SPP_UPD_INFORME(?,?,?)";
		return jdbcTemplate.update(sql, i.getId_informe(), i.getId_resultados(), i.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "call D_CRUD_INFORME.SPP_DEL_INFORME(?)";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("D_CRUD_INFORME")
				.withFunctionName("SPF_READOPC_INFORME");
		SqlParameterSource in = new MapSqlParameterSource().addValue("id", id);
		return simpleJdbcCall.execute(in);
	}

	@Override
	public Map<String, Object> readAll() {
		// TODO Auto-generated method stub
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withCatalogName("D_CRUD_INFORME")
				.withFunctionName("SPF_READALL_INFORME");
		return simpleJdbcCall.execute();
	}

}
