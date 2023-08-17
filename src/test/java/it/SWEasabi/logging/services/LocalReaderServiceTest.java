package it.SWEasabi.logging.services;

import it.SWEasabi.logging.entities.Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LocalReaderServiceTest {

    private LocalReaderService readerService;

    @BeforeEach
    public void setUp() {
        readerService = new LocalReaderService();
    }

    @Test
    public void testGetLast50MeasurerLogs() {
        List<Log> logs = readerService.getLast50MeasurerLogs(0);
        assertEquals(50, logs.size());

        for (int i = 0; i < logs.size(); i++) {
            Log log = logs.get(i);
            assertEquals(0, log.getIdMisuratore());
            assertEquals(i*500, log.getIstanteModifica());
            assertEquals(1, log.getValore());
            assertEquals("lampione", log.getTipo());
        }
    }

    @Test
    public void testGetAllMeasurerLogs() {
        List<Log> logs = readerService.getAllMeasurerLogs(0);
        assertEquals(500, logs.size());

        for (int i = 0; i < logs.size(); i++) {
            Log log = logs.get(i);
            assertEquals(0, log.getIdMisuratore());
            assertEquals(i*500, log.getIstanteModifica());
            assertEquals(1, log.getValore());
            assertEquals("lampione", log.getTipo());
        }
    }

    @Test
    public void testGetLogsBetweenDates() {
        List<Log> logs = readerService.getLogsBetweenDates(0, 1);
        assertEquals(20, logs.size());

        for (int i = 0; i < logs.size(); i++) {
            Log log = logs.get(i);
            assertEquals(i, log.getIdMisuratore());
            assertEquals(i*500, log.getIstanteModifica());
            assertEquals(0, log.getValore());
            assertEquals("lampione", log.getTipo());
        }
    }
}