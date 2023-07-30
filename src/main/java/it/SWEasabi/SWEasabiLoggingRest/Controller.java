package it.SWEasabi.SWEasabiLoggingRest;

import org.springframework.beans.factory.annotation.Autowired;
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
	String GetLastLog(@PathVariable int idMisuratore)
	{
        return core.getLastMeasurerLog(idMisuratore).toString();
	}
    
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@GetMapping("/log/last50/{idMisuratore}")
	String GetLast50Logs(@PathVariable int idMisuratore)
	{
    	String res = "";
    	for(JsonObject o : core.getLast50MeasurerLogs(idMisuratore))
    	{
    		res += o.toString();
    	}
    	return res;
	}
    
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
   	@GetMapping("/log/all/{idMisuratore}")
   	String GetAllLogs(@PathVariable int idMisuratore)
   	{
       	String res = "";
       	for(JsonObject o : core.getAllMeasurerLogs(idMisuratore))
       	{
       		res += o.toString();
       	}
       	return res;
   	}
    
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
   	@GetMapping("/log/dates/{start}/{end}")
   	String GetLogsBetweenDates(@PathVariable long start, @PathVariable long end)
   	{
       	String res = "";
       	for(JsonObject o : core.getLogsBetweenDates(start, end))
       	{
       		res += o.toString();
       	}
       	return res;
   	}
    
}
