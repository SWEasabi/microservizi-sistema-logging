package it.SWEasabi.logging.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {

    private Log log;

    @BeforeEach
    public void setUp() {
        log = new Log();
    }

    @Test
    public void testConstructor() {
        Log log = new Log(5, 10000000, 10, "sensore");
        assertEquals(5, log.getIdMisuratore());
        assertEquals(10000000, log.getIstanteModifica());
        assertEquals(10, log.getValore());
        assertEquals("sensore", log.getTipo());
    }

    @Test
    public void testSettersAndGetters() {
        log.setId(5);
        assertEquals(5, log.getId());

        log.setIdMisuratore(10);
        assertEquals(10, log.getIdMisuratore());

        log.setIstanteModifica(1000000);
        assertEquals(1000000, log.getIstanteModifica());

        log.setValore(15);
        assertEquals(15, log.getValore());

        log.setTipo("sensore");
        assertEquals("sensore", log.getTipo());
    }
}