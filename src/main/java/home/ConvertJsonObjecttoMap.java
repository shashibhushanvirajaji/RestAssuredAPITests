package home;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonObjecttoMap {

	@SuppressWarnings("unchecked")
	@Test
	public void convertJsonObjectToMap() {

		Map objectToMap = RestAssured.get("https://run.mocky.io/v3/ba9127ac-7976-4d53-a4c6-0265244b6b2a").as(Map.class);

		System.out.println(objectToMap.get("name"));
		objectToMap.keySet().forEach(new Consumer() {
			public void accept(Object key) {
				System.out.println(key);
			}
		});
	}

	@Test
	public void convertNestedJsonObjectToMap() {

		Map objectToMap = RestAssured
							.get("https://run.mocky.io/v3/8d0832c6-9806-4814-8b66-bdf107cfdbab")
							.as(Map.class);
		Map<String,Object> address = (Map<String,Object>)objectToMap.get("Address");
		address.forEach(new BiConsumer<String, Object>() {
			public void accept(String k, Object v) {
				System.out.println(k+" "+v);
			}
		});
		
	}
	
	@Test
	public void convertNestedJsonObjectToMapwithGenerics()
	{
		Map<String,Object> jsontoMap = RestAssured
				.get("https://run.mocky.io/v3/8d0832c6-9806-4814-8b66-bdf107cfdbab")
				.as(new TypeRef<Map<String,Object>>(){});
		
		jsontoMap.forEach(new BiConsumer<String, Object>() {
			public void accept(String k, Object v) {
				System.out.println(k+" "+v);
			}
		});
	}
}
