package pe.edu.upeu.systemasgru;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import pe.edu.upeu.sysrubricas.SystemaSgruApplication;
import pe.edu.upeu.sysrubricas.dao.CompetenciaDao;
import pe.edu.upeu.sysrubricas.entity.Competencia;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SystemaSgruApplication.class)
@SpringBootTest
class SystemaSgruApplicationTests {
@Autowired
CompetenciaDao dao;
	@Test
	void contextLoads() {
		Competencia c = new Competencia();
		c.setId_competencias(50);
		c.setNombre("cd-91");
		c.setId_tipo_instrumento(1);
		c.setId_linea_pa(21);
		c.setEstado("1");
		c.setDescripcion("wwwwwwwwwwwwwwwwww");
		
		System.out.println(dao.update(c));
		//System.out.println(dao.prueba("hola"));
	}
}
