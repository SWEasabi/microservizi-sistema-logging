package it.SWEasabi.logging.services;

import com.google.gson.JsonObject;
import it.SWEasabi.logging.entities.Log;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LocalJsonBuilderServiceTest {

    LocalJsonBuilderService jsonBuilderService;

    @BeforeEach
    void setUp() {
        jsonBuilderService = new LocalJsonBuilderService();
    }

    @Test
    void testGetJsonFromLog() {
        Log log = new Log(5, 10000000, 10, "sensore");
        log.setId(0);

        JsonObject json = jsonBuilderService.getJsonFromLog(log);

        assertEquals(0, json.get("id").getAsLong());
        assertEquals(5, json.get("idMisuratore").getAsLong());
        assertEquals(10000000, json.get("istanteModifica").getAsLong());
        assertEquals(10, json.get("valore").getAsInt());
        assertEquals("sensore", json.get("tipo").getAsString());
    }

    @Test
    void testGetMapFromLog() {
        Log log = new Log(5, 10000000, 10, "sensore");
        log.setId(0);

        Map<String, String> map = jsonBuilderService.getMapFromLog(log);

        assertEquals("0", map.get("id"));
        assertEquals("5", map.get("idMisuratore"));
        assertEquals("10000000", map.get("istanteModifica"));
        assertEquals("10", map.get("valore"));
        assertEquals("sensore", map.get("tipo"));
    }
}