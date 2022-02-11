package home;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.specification.RequestSpecification;

public class HeadersExample {

	@Test
	public void headers() {

		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("headers1", "value1");
		headers.put("headers1", "value2");

		RestAssured
			.given()
				.baseUri("http://localhost:3030")
				.basePath("/products")
				.headers(headers)
				.log().all()
			.when()
				.get()
			.then()
				.log().all();
	}

	@Test
	public void defaultBehavior() {

			RestAssured
				.given()
				.baseUri("http://localhost:3030")
				.basePath("/products")
				.header("header1", "value1","value1")
			//	.header("header1", "value1")
				.log().all()
				.when().get();
				
				
	}
	
	@Test
	public void overriderHeadersValue() {

			RestAssured
				.given()
					.config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig()
							.overwriteHeadersWithName("header1","header2")))
					.config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig()
							.mergeHeadersWithName("header1")))
					.baseUri("http://localhost:3030")
					.basePath("/products")
					.header("header1","value1")
					.header("header1","value2")
					.header("header2","v1")
					.header("header2","v2")
					.log().all()
				.when()
					.get();
				
				
				
				
	}
	
	@Test
	public void realTimeHeaderOverwrite()
	{
		RequestSpecification rs1 = RestAssured.given()
				.header("header1", "value1");
		
		RequestSpecification rs2 = RestAssured.given()
				.header("header1", "value1");
		
	}
}
