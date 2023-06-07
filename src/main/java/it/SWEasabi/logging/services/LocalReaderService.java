package it.SWEasabi.logging.services;

import java.util.ArrayList;

import it.SWEasabi.logging.kernel.Log;

public class LocalReaderService implements ReaderService
{
    public ArrayList<Log> getLast50MeasurerLogs(int idMisuratore)
    {
        ArrayList<Log> logs = new ArrayList<Log>();
        for(int i = 0; i < 50; i++)
        {
            logs.add(new Log(idMisuratore, i*500, 1));
        }
        return logs;
    }
    public ArrayList<Log> getAllMeasurerLogs(int idMisuratore)
    {
        ArrayList<Log> logs = new ArrayList<Log>();
        for(int i = 0; i < 500; i++)
        {
            logs.add(new Log(idMisuratore, i*500, 1));
        }
        return logs;
    }
    public ArrayList<Log> getLogsBetweenDates(long start, long end)
    {
        ArrayList<Log> logs = new ArrayList<Log>();
        for(int i = 0; i < 20; i++)
        {
            logs.add(new Log(i, start, 0));
        }
        return logs;
    }
}
