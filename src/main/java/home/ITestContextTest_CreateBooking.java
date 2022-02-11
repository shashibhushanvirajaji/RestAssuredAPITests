package home;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ITestContextTest_CreateBooking {

	
	@Test
	public void createBooking(ITestContext iTestContext)
	{
		int bookingID = RestAssured.given()
				.log().all()
		.baseUri("https://restful-booker.herokuapp.com/booking")
		.body("{\r\n" + 
				"    \"firstname\" : \"Jim\",\r\n" + 
				"    \"lastname\" : \"Brown\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : true,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}")
		.contentType(ContentType.JSON)
		.when()
		.post()
		.then().extract().jsonPath().getInt("bookingid");
		
		iTestContext.setAttribute("bookingid", bookingID);
		 
		
	}
	
	
}
