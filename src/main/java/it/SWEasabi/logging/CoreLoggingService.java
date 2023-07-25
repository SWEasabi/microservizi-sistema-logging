package it.SWEasabi.logging;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.entities.Log;
import it.SWEasabi.logging.services.JsonBuilderService;
import it.SWEasabi.logging.services.ReaderService;

public class CoreLoggingService
{
	@Autowired
    private ReaderService readerService;
	@Autowired
    private JsonBuilderService jsonBuilderService;;

    /*public CoreLoggingService(ReaderService _readerService, JsonBuilderService _jsonBuilderService)
    {
        readerService = _readerService;
        jsonBuilderService = _jsonBuilderService;
    }*/
    public JsonObject getLastMeasurerLog(int idMisuratore)
    {
        List<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        if(logs.size() == 0)
        {
            return null;
        }
        return jsonBuilderService.getJsonFromLog(logs.get(0));
    }
    public List<JsonObject> getLast50MeasurerLogs(int idMisuratore)
    {
    	List<JsonObject> list = new ArrayList<JsonObject>();
        List<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getJsonFromLog(log));
        }
        return list;
    }
    public List<JsonObject> getAllMeasurerLogs(int idMisuratore)
    {
    	List<JsonObject> list = new ArrayList<JsonObject>();
        List<Log> logs = readerService.getAllMeasurerLogs(idMisuratore);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getJsonFromLog(log));
        }
        return list;
    }
    public List<JsonObject> getLogsBetweenDates(long start, long end)
    {
    	List<JsonObject> list = new ArrayList<JsonObject>();
        List<Log> logs = readerService.getLogsBetweenDates(start, end);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getJsonFromLog(log));
        }
        return list;
    }
}
