package files;

import io.restassured.path.json.JsonPath;

public class reUsableMethods {

	public static JsonPath rawToJson(String resp){
		
		JsonPath js = new JsonPath(resp);
		return js;
	}
	
}
