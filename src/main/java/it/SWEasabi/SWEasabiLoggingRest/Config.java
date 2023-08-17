package it.SWEasabi.SWEasabiLoggingRest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.SWEasabi.logging.services.DatabaseReaderService;
import it.SWEasabi.logging.services.JsonBuilderService;
import it.SWEasabi.logging.services.LocalJsonBuilderService;
import it.SWEasabi.logging.services.ReaderService;

@Configuration
public class Config {
	
	@Bean
	public JsonBuilderService getJsonBuilderService() {
		return new LocalJsonBuilderService();
	}
	
	@Bean
	public ReaderService getReaderService() {
		return new DatabaseReaderService();
	}
}
