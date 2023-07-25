package it.SWEasabi.logging.services;

import java.util.ArrayList;
import java.util.List;

import it.SWEasabi.logging.entities.Log;

public class LocalReaderService implements ReaderService
{
    public List<Log> getLast50MeasurerLogs(int idMisuratore)
    {
        List<Log> logs = new ArrayList<Log>();
        for(int i = 0; i < 50; i++)
        {
            logs.add(new Log(idMisuratore, i*500, 1, "lampione"));
        }
        return logs;
    }
    public List<Log> getAllMeasurerLogs(int idMisuratore)
    {
        List<Log> logs = new ArrayList<Log>();
        for(int i = 0; i < 500; i++)
        {
            logs.add(new Log(idMisuratore,i*500, 1, "lampione"));
        }
        return logs;
    }
    public List<Log> getLogsBetweenDates(long start, long end)
    {
        List<Log> logs = new ArrayList<Log>();
        for(int i = 0; i < 20; i++)
        {
            logs.add(new Log(i, i*500, 0, "lampione"));
        }
        return logs;
    }
}
