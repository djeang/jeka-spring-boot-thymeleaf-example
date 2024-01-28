package _dev.tests;

import app.Application;
import dev.jeka.core.tool.JkInjectClasspath;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@JkInjectClasspath("org.springframework.boot:spring-boot-starter-test")

@SpringBootTest(classes = Application.class)
class ApplicationTests {

	@Test
	void contextLoads() {
	}

}
