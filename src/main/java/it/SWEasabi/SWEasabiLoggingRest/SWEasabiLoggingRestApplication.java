package it.SWEasabi.SWEasabiLoggingRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("it.SWEasabi.logging.repositories")
@EntityScan("it.SWEasabi.logging.entities")
public class SWEasabiLoggingRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SWEasabiLoggingRestApplication.class, args);
	}

}