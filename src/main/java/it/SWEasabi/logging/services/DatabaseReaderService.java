package it.SWEasabi.logging.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.SWEasabi.logging.entities.Log;
import it.SWEasabi.logging.repositories.LogRepository;

public class DatabaseReaderService implements ReaderService {

	@Autowired
	private LogRepository logRepository;
	
	public List<Log> getLast50MeasurerLogs(int idMisuratore) {
		return logRepository.findFirst50ByIdMisuratore(idMisuratore);
	}

	
	public List<Log> getAllMeasurerLogs(int idMisuratore) {
		return logRepository.findByIdMisuratore(idMisuratore);
	}

	
	public List<Log> getLogsBetweenDates(long start, long end) {
		return logRepository.findByIstanteModificaGreaterThanAndIstanteModificaLessThan(start, end);
	}
	
}
