package home;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class MockResponse {
	
	@Test
	public void mockResponse() {
		
		RestAssured
		.given().baseUri("https://run.mocky.io/v3/a2eb78d9-5ebb-45f2-a8a1-34a113b369a7")
		.when()
			.get()
		.then()
			.log().all()
			.assertThat().statusCode(200);
	}

}
