package pe.edu.upeu.systemasgru;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.upeu.sysrubricas.SystemaSgruApplication;
import pe.edu.upeu.sysrubricas.dao.CompetenciaDao;
import pe.edu.upeu.sysrubricas.entity.Competencias;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SystemaSgruApplication.class)
@SpringBootTest
class SystemaSgruApplicationTests {
@Autowired
CompetenciaDao dao;
	@Test
	void contextLoads() {
		Competencias c = new Competencias();
		
		c.setTipo_competencias_id(2);
		c.setNombre("cd-23");
		c.setDescripcion("wwwwwwwwwwwwwwwwww");
	
		
		System.out.println(dao.create(c));
		//System.out.println(dao.prueba("hola"));
	}
}
