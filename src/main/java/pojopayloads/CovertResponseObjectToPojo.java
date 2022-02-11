package pojopayloads;

import io.restassured.RestAssured;

public class CovertResponseObjectToPojo {

	public static void main(String[] args) {
	
		Employee2 employee = RestAssured.get("https://run.mocky.io/v3/a84103b9-8117-412d-9b97-f5d90b7b3364")
		.as(Employee2.class);
		
		System.out.println(employee.getFirstname());

	}

}
