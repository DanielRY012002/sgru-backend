package pe.edu.upeu.sysrubricas.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysrubricas.dao.Tipo_DocDao;
import pe.edu.upeu.sysrubricas.entity.Tipo_Doc;

@Repository
public class Tipo_DocDaoImp implements Tipo_DocDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Tipo_Doc t) {
		String sql="call D_CRUD_TIPO_DOC.SPP_INS2_TIPO_DOC(?)";
		return jdbcTemplate.update(sql,t.getNombre());
	}

	@Override
	public int update(Tipo_Doc t) {
		String sql="update tipo_doc set nombre=? where id_tipo_doc=?";
		return jdbcTemplate.update(sql,t.getNombre(),t.getId_tipo_doc());
	}

	@Override
	public int delete(int id) {
		String sql="delete from tipo_doc where id_tipo_doc=?";
		return jdbcTemplate.update(sql,id);
	}

	@Override
	public Tipo_Doc read(int id) {
		String sql="select * from tipo_doc where id_tipo_doc=? and estado=1";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Tipo_Doc>(Tipo_Doc.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String sql = "Select *From tipo_doc where estado=1";
		return jdbcTemplate.queryForList(sql);
	}

}
