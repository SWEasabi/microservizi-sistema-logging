package it.SWEasabi.SWEasabiLoggingRest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.SWEasabi.logging.CoreLoggingService;
import it.SWEasabi.logging.services.LocalJsonBuilderService;
import it.SWEasabi.logging.services.LocalReaderService;

@Configuration
public class Config {
	@Bean
	public CoreLoggingService getCore() {
		return new CoreLoggingService(new LocalReaderService(), new LocalJsonBuilderService());
	}
}
