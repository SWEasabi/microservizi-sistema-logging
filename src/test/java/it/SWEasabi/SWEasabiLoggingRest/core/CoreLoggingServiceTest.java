package it.SWEasabi.SWEasabiLoggingRest.core;

import it.SWEasabi.logging.entities.Log;
import it.SWEasabi.logging.services.JsonBuilderService;
import it.SWEasabi.logging.services.LocalJsonBuilderService;
import it.SWEasabi.logging.services.LocalReaderService;
import it.SWEasabi.logging.services.ReaderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CoreLoggingServiceTest {

    ReaderService readerService;
    JsonBuilderService jsonBuilderService;
    CoreLoggingService core;

    @BeforeEach
    void setUp() {
        readerService = new LocalReaderService();
        jsonBuilderService = new LocalJsonBuilderService();

        core = new CoreLoggingService(readerService, jsonBuilderService);
    }

    @Test
    public void testGetLastMeasurerLog() {
        assertEquals(core.getLastMeasurerLog(5), jsonBuilderService.getMapFromLog(readerService.getLast50MeasurerLogs(5).get(0)));
    }

    @Test
    public void testGetLast50MeasurerLogs() {
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();

        List<Log> logs = readerService.getLast50MeasurerLogs(5);
        for (Log log : logs)
        {
            list.add(jsonBuilderService.getMapFromLog(log));
        }

        assertEquals(core.getLast50MeasurerLogs(5), list);
    }

    @Test
    public void testGetAllMeasurerLogs() {
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();

        List<Log> logs = readerService.getAllMeasurerLogs(5);
        for (Log log : logs)
        {
            list.add(jsonBuilderService.getMapFromLog(log));
        }

        assertEquals(core.getAllMeasurerLogs(5), list);
    }

    @Test
    public void testGetLogsBetweenDates() {
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();

        List<Log> logs = readerService.getLogsBetweenDates(0, 100);
        for (Log log : logs)
        {
            list.add(jsonBuilderService.getMapFromLog(log));
        }

        assertEquals(core.getLogsBetweenDates(0, 100), list);
    }

}