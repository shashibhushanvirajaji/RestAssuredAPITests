package home;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class ReadingJson {

	
	@Test
	public void readJson() {
		
		String json = "{\r\n" + 
				"      \"id\": 1,\r\n" + 
				"      \"name\": \"Geek Squad Services\",\r\n" + 
				"      \"createdAt\": \"2016-11-17T17:56:35.881Z\",\r\n" + 
				"      \"updatedAt\": \"2016-11-17T17:56:35.881Z\"\r\n" + 
				"    }";
		
		JsonPath jsob = new JsonPath(json);
		System.out.println(jsob.get("name"));
		System.out.println(jsob.getInt("name"));
	}
}
