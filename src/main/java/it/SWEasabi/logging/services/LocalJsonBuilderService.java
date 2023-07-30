package it.SWEasabi.logging.services;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonObject;

import it.SWEasabi.logging.entities.Log;

public class LocalJsonBuilderService implements JsonBuilderService {

	@Override
	public JsonObject getJsonFromLog(Log log) {
		JsonObject json = new JsonObject();
		json.addProperty("id", log.getId());
		json.addProperty("idMisuratore", log.getIdMisuratore());
		json.addProperty("istanteModifica", log.getIstanteModifica());
		json.addProperty("valore", log.getValore());
		json.addProperty("tipo", log.getTipo());
		return json;
	}
	
	@Override
	public Map<String,String> getMapFromLog(Log log) {
		Map<String,String> data = new HashMap<String,String>();
		data.put("id", Long.toString(log.getId()));
		data.put("idMisuratore", Long.toString(log.getIdMisuratore()));
		data.put("istanteModifica", Long.toString(log.getIstanteModifica()));
		data.put("valore", Integer.toString(log.getValore()));
		data.put("tipo", log.getTipo());
		return data;
	}

}
