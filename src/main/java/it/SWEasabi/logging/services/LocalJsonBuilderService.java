package it.SWEasabi.logging.services;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.entities.Log;

public class LocalJsonBuilderService implements JsonBuilderService {

	@Override
	public JsonObject getJsonFromLog(Log log) {
		JsonObject json = new JsonObject();
		json.addProperty("id", log.getId());
		json.addProperty("idMisuratore", log.getIdMisuratore());
		json.addProperty("timestamp", log.getTimeStamp());
		json.addProperty("valore", log.getValore());
		json.addProperty("tipo", log.getTipo());
		return json;
	}

}
