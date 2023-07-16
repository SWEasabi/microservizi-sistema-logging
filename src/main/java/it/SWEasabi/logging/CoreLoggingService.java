package it.SWEasabi.logging;

import java.util.ArrayList;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.kernel.Log;
import it.SWEasabi.logging.services.JsonBuilderService;
import it.SWEasabi.logging.services.ReaderService;

public class CoreLoggingService
{
    private ReaderService readerService;
    private JsonBuilderService jsonBuilderService;;

    public CoreLoggingService(ReaderService _readerService, JsonBuilderService _jsonBuilderService)
    {
        readerService = _readerService;
        jsonBuilderService = _jsonBuilderService;
    }
    public JsonObject getLastMeasurerLog(int idMisuratore)
    {
        ArrayList<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        if(logs.size() == 0)
        {
            return null;
        }
        return jsonBuilderService.getJsonFromLog(logs.get(0));
    }
    public ArrayList<JsonObject> getLast50MeasurerLogs(int idMisuratore)
    {
    	ArrayList<JsonObject> list = new ArrayList<JsonObject>();
        ArrayList<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getJsonFromLog(log));
        }
        return list;
    }
    public ArrayList<JsonObject> getAllMeasurerLogs(int idMisuratore)
    {
    	ArrayList<JsonObject> list = new ArrayList<JsonObject>();
        ArrayList<Log> logs = readerService.getAllMeasurerLogs(idMisuratore);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getJsonFromLog(log));
        }
        return list;
    }
    public ArrayList<JsonObject> getLogsBetweenDates(long start, long end)
    {
    	ArrayList<JsonObject> list = new ArrayList<JsonObject>();
        ArrayList<Log> logs = readerService.getLogsBetweenDates(start, end);
        for (Log log : logs)
        {
        	list.add(jsonBuilderService.getJsonFromLog(log));
        }
        return list;
    }
}
