package home;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ITestContextTest_GetBookingDetails {

	@Test
	public void getBookingDetails(ITestContext iTestContext)
	{
		int id = (Integer) iTestContext.getAttribute("bookingid");
		RestAssured.given()		
		.log().all()
		.pathParam("bookingid",id)
		.baseUri("https://restful-booker.herokuapp.com/booking/")
		.basePath("{bookingid}")
		.when().get().then().assertThat().statusCode(200);
		
	}
}
