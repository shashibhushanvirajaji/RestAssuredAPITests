package home;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestModule1 {

	@Test(priority = 1)
	public void createBooking() {
		
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
		
		
		DataStoreThreadLocal.setValue(DataConstants.BOOKING_ID, bookingID);
	}
	
	@Test(priority = 2)
	public void retrieveBooking()
	{
		int id =  (Integer) DataStoreThreadLocal.getValue(DataConstants.BOOKING_ID);
		RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com/booking/"+id)
		.when().get()
		.then()
		.log().all();
		
	}
}
