package it.SWEasabi.logging.services;

import java.util.Map;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.entities.Log;

public interface JsonBuilderService {
	public JsonObject getJsonFromLog(Log log);
	public Map<String,String> getMapFromLog(Log log);
}
