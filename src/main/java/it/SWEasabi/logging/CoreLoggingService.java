package it.SWEasabi.logging;

import java.util.ArrayList;

import it.SWEasabi.logging.kernel.Log;
import it.SWEasabi.logging.services.ReaderService;

public class CoreLoggingService
{
    private ReaderService readerService;

    public CoreLoggingService(ReaderService _readerService)
    {
        readerService = _readerService;
    }
    public Log getLastMeasurerLog(int idMisuratore)
    {
        ArrayList<Log> logs = readerService.getLast50MeasurerLogs(idMisuratore);
        if(logs.size() == 0)
        {
            return null;
        }
        return logs.get(0);
    }
    public ArrayList<Log> getLast50MeasurerLogs(int idMisuratore)
    {
        return readerService.getLast50MeasurerLogs(idMisuratore);
    }
    public ArrayList<Log> getAllMeasurerLogs(int idMisuratore)
    {
        return readerService.getAllMeasurerLogs(idMisuratore);
    }
    public ArrayList<Log> getLogsBetweenDates(long start, long end)
    {
        return readerService.getLogsBetweenDates(start, end);
    }
}
