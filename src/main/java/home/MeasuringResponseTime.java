package home;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class MeasuringResponseTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.given()
		.baseUri("http://localhost:3030/")
		.basePath("products")
		.when()
		.get()
		.then()
		.time(Matchers.lessThan(2050L));
		
//		 System.out.println(response.getTimeIn(TimeUnit.MICROSECONDS));		 
//		 long time = response.getTime();		 
//		 
//		 response.
		
		
//		.log()
//		.all()
//		.statusCode(200)
//		.extract()
//		.path("data[0].id");
//		
//	System.out.println(id);
			
	}
}
