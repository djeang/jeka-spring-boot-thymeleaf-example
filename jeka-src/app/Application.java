package app;

import dev.jeka.core.tool.JkInjectClasspath;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@JkInjectClasspath("org.springframework.boot:spring-boot-dependencies::pom:3.2.2")

@JkInjectClasspath("org.springframework.boot:spring-boot-starter-web")
@JkInjectClasspath("org.springframework.boot:spring-boot-starter-thymeleaf")
@JkInjectClasspath("org.springframework.boot:spring-boot-starter-data-jpa")
@JkInjectClasspath("org.webjars:jquery:3.6.1")
@JkInjectClasspath("org.webjars:bootstrap:4.6.2")
@JkInjectClasspath("org.webjars:webjars-locator-core")

@JkInjectClasspath("com.h2database:h2:2.1.214")

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
