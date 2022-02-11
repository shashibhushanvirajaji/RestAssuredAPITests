package home;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class FiltersOnJsonResponse {

	@Test
	public void applyingFiltersOnResponseJson() {
		
			 List<String> names = RestAssured
				.given()
					//.pathParam("parameter", "products")
					.baseUri("http://localhost:3030/")
					.basePath("products")
				.when()
					.get()
					.jsonPath().getList("data.findAll{it.manufacturer == 'Duracell'}.name");
					
					
				
			//JsonPath jsonPath = new JsonPath
					//.jsonPath().getList("data[0].categories.name");
		
		System.out.println(names);
	//	System.out.println(names.size());
		
		
	}
}
