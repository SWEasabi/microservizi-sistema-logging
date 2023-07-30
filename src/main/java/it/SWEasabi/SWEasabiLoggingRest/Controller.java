package it.SWEasabi.SWEasabiLoggingRest;

import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.CoreLoggingService;

@RestController
public class Controller
{
	@Autowired
	private CoreLoggingService core;
	
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@GetMapping("/log/last/{idMisuratore}")
	ResponseEntity<Object> GetLastLog(@PathVariable int idMisuratore)
	{
        Map<String,String> data =  core.getLastMeasurerLog(idMisuratore);
        return new ResponseEntity<>(data,HttpStatus.OK);
	}
    
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@GetMapping("/log/last50/{idMisuratore}")
    ResponseEntity<Object> GetLast50Logs(@PathVariable int idMisuratore)
	{
    	List<Map<String,String>> data = core.getLast50MeasurerLogs(idMisuratore);
    	return new ResponseEntity<>(data,HttpStatus.OK);
    	
	}
    
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
   	@GetMapping("/log/all/{idMisuratore}")
    ResponseEntity<Object> GetAllLogs(@PathVariable int idMisuratore)
   	{
    	List<Map<String,String>> data = core.getAllMeasurerLogs(idMisuratore);
    	return new ResponseEntity<>(data,HttpStatus.OK);
   	}
    
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
   	@GetMapping("/log/dates/{start}/{end}")
    ResponseEntity<Object> GetLogsBetweenDates(@PathVariable long start, @PathVariable long end)
   	{
    	List<Map<String,String>> data = core.getLogsBetweenDates(start, end);
    	return new ResponseEntity<>(data,HttpStatus.OK);
   	}
    
}
