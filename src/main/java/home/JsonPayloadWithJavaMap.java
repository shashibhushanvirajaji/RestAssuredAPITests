package home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class JsonPayloadWithJavaMap {

	@Test
	public void createjsonPayloadWithJavaMap() {
		
		Map<String,Object> payloadObject = new LinkedHashMap<String, Object>();
		payloadObject.put("id", 1);
		payloadObject.put("name", "shashibhushan");
		payloadObject.put("salar", 125.34);
		payloadObject.put("designation", "tester");
		
		RestAssured
		.given()
		.body(payloadObject)
		.log().all()
		.when()
		.get();
	}
	
	@Test
	public void createNestedJsonPayloadWithJavaMap()
	{
		

		Map<String,Object> addressMap = new LinkedHashMap<String, Object>();
		addressMap.put("Street", 345);
		addressMap.put("City", "Hyderabad");
		addressMap.put("State", "telangana");
		addressMap.put("PinCode", 500079);
		
		Map<String,Object> payloadObject = new LinkedHashMap<String, Object>();
		payloadObject.put("id", 1);
		payloadObject.put("name", "shashibhushan");
		payloadObject.put("salar", 125.34);
		payloadObject.put("designation", "tester");
		payloadObject.put("Address", addressMap);
		
		 RestAssured
		.given()
		.body(payloadObject)
		.log()
		.all()
		.when().get();
		
				
	}
	
	
	@Test
	public void createjsonArrayswithListNMap() {
		
		Map<String,Object> payloadObject = new LinkedHashMap<String, Object>();
		payloadObject.put("id", 1);
		payloadObject.put("name", "shashibhushan");
		payloadObject.put("salar", 125.34);
		payloadObject.put("designation", "tester");
		
		Map<String,Object> payloadObject2 = new LinkedHashMap<String, Object>();
		payloadObject2.put("id", 2);
		payloadObject2.put("name", "shashibhusha2n");
		payloadObject2.put("salar", 12435.34);
		payloadObject2.put("designation", "te3ster");
		
		List<Map<String, Object>> payloads = new ArrayList<Map<String, Object>>();
		payloads.add(payloadObject);
		payloads.add(payloadObject2);
		
		RestAssured
		.given().body(payloads)
		.log().all()
		.when()
		.get();
		
	}
	
	@Test
	public void createComplexPayloadUsingListandMap() {
		
		List<Map<String, Object>> finalPayload = new ArrayList<Map<String,Object>>();
		
		
		//List<String> skills = Arrays.asList("Selenium","UFT");
		
		Map<String,Object> firstObject = new LinkedHashMap<String, Object>();
		firstObject.put("skills", Arrays.asList("Selenium","UFT"));
		firstObject.put("fistname","shashi");
		firstObject.put("lastname","virajaji");
		Map<String, String> address = new HashMap<String, String>();
		address.put("Street", "123");
		address.put("H.NO", "123213");
		
		firstObject.put("address", address);
		
		finalPayload.add(firstObject);
		
		RestAssured.given()
		.log().all()
		.body(finalPayload).get();
		
		
	}
}
