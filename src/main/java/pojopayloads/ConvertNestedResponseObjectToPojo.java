package pojopayloads;

import io.restassured.RestAssured;

public class ConvertNestedResponseObjectToPojo {

	public static void main(String[] args) {
		
		EmployeeWithAddress employee = RestAssured.get("https://run.mocky.io/v3/b89b3fac-c142-4cd6-b106-e23aab45efcd")
		.as(EmployeeWithAddress.class);
		
		System.out.println(employee.getAddress().getHouseno());
		
		// Fetching
		EmpAddress  empaddress = RestAssured.get("https://run.mocky.io/v3/b89b3fac-c142-4cd6-b106-e23aab45efcd")
		.jsonPath().getObject("address", EmpAddress.class);
		
		System.out.println(empaddress.getState()+" "+empaddress.getCity()); 
	}

}
