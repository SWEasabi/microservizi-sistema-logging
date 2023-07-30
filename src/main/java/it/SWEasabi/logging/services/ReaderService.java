package it.SWEasabi.logging.services;

import java.util.List;

import it.SWEasabi.logging.entities.Log;

public interface ReaderService
{
    // ritorna gli ultimi 50 log di un misuratore, ordinati per data
    public List<Log> getLast50MeasurerLogs(int idMisuratore);
    // ritorna tutti log di un misuratore, ordinati per data
    public List<Log> getAllMeasurerLogs(int idMisuratore);
    // ritorna i log di tutti i misuratori in un range di date
    public List<Log> getLogsBetweenDates(long start, long end);
}
