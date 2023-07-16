package it.SWEasabi.logging.services;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.kernel.Log;

public class LocalJsonBuilderService implements JsonBuilderService {

	@Override
	public JsonObject getJsonFromLog(Log log) {
		JsonObject json = new JsonObject();
		json.addProperty("idMisuratore", log.getIdMisuratore());
		json.addProperty("timestamp", log.getTimeStamp());
		json.addProperty("valore", log.getValore());
		return json;
	}

}
