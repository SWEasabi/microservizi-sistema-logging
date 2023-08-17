package it.SWEasabi.SWEasabiLoggingRest.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import it.SWEasabi.logging.entities.Log;
import it.SWEasabi.logging.services.JsonBuilderService;
import it.SWEasabi.logging.services.ReaderService;

@Component
public class CoreLoggingService
{
    private ReaderService readerService;
    private JsonBuilderService jsonBuilderService;

    public CoreLoggingService(ReaderService _readerService, JsonBuilderService _jsonBuilderService)
    {
        readerService = _readerService;
        jsonBuilderService = _jsonBuilderService;
    }
    public Map<String,String> getLastMeasurerLog(int idMisuratore)
    {
        List<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        if(logs.size() == 0)
        {
            return null;
        }
        return jsonBuilderService.getMapFromLog(logs.get(0));
    }
    public List<Map<String,String>> getLast50MeasurerLogs(int idMisuratore)
    {
    	List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        List<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getMapFromLog(log));
        }
        return list;
    }
    public List<Map<String,String>> getAllMeasurerLogs(int idMisuratore)
    {
    	List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        List<Log> logs = readerService.getAllMeasurerLogs(idMisuratore);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getMapFromLog(log));
        }
        return list;
    }
    public List<Map<String,String>> getLogsBetweenDates(long start, long end)
    {
    	List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        List<Log> logs = readerService.getLogsBetweenDates(start, end);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getMapFromLog(log));
        }
        return list;
    }
}
