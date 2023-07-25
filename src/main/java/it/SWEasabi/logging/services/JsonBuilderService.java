package it.SWEasabi.logging.services;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.entities.Log;

public interface JsonBuilderService {
	public JsonObject getJsonFromLog(Log log);
}
