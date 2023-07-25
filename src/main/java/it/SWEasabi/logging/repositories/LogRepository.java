package it.SWEasabi.logging.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.SWEasabi.logging.entities.Log;

public interface LogRepository extends CrudRepository<Log,Long> {
	
	public List<Log> findFirst50ByIdMisuratore(long idMisuratore);
	public Log findById(long id);
	public List<Log> findByIdMisuratore(long idMisuratore);
	public List<Log> findByTipo(String tipo);
	public List<Log> findByTimestampGreaterThanAndTimestampLessThan(long min, long max);
}
