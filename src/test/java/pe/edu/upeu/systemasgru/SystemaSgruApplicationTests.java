package pe.edu.upeu.systemasgru;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.upeu.sysrubricas.dao.PersonaDao;

@SpringBootTest
class SystemaSgruApplicationTests {
	@Autowired
	private PersonaDao personaDao;

	@Test
	void contextLoads() {
		System.out.println(personaDao.read(1));
	}

}
