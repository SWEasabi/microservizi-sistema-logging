package it.SWEasabi.logging.services;

import java.util.ArrayList;

import it.SWEasabi.logging.kernel.Log;

public interface ReaderService
{
    // ritorna gli ultimi 50 log di un misuratore, ordinati per data
    public ArrayList<Log> getLast50MeasurerLogs(int idMisuratore);
    // ritorna tutti log di un misuratore, ordinati per data
    public ArrayList<Log> getAllMeasurerLogs(int idMisuratore);
    // ritorna i log di tutti i misuratori in un range di date
    public ArrayList<Log> getLogsBetweenDates(long start, long end);
}
