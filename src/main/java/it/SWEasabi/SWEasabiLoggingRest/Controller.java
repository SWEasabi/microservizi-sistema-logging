package it.SWEasabi.SWEasabiLoggingRest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class Controller
{
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	@PostMapping("/login")
	String EsempioListener(@RequestBody String json)
	{
		//JsonObject rq = new Gson().fromJson(json, JsonObject.class);
		//String username = rq.get("username").toString();
		//String password = rq.get("password").toString();
		
        /*
		LoginResult result = core.login(username, password);

		JsonObject response = new JsonObject();
		response.addProperty("status", result.getStatus());
		response.addProperty("access", result.getAccessJwt());
		response.addProperty("refresh", result.getRefreshJwt());

		return response.toString();
        */
        return "";
	}
}
