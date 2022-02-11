package home;
import java.util.List;

import io.restassured.RestAssured;

public class JsonArrayNestedJsonArray {

	public static void main(String[] args) {
	
	 List<String> names =RestAssured
		.given()
			.pathParam("parameter", "services")
			.baseUri("http://localhost:3030/")
			.basePath("{parameter}")
		.when()
			.get()
			.jsonPath().getList("data.name");
			
	 System.out.println(names);
//		.then()
//		 .assertThat().statusCode(200);
		
		
//		JsonPath json = new JsonPath(jsonarray);
//		//System.out.println("Array items " + json.getList("data.$").size());
//		System.out.println("Array items " + json.getString("data[2].name"));

	}

}
