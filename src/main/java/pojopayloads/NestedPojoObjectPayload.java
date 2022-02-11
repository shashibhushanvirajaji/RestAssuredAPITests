package pojopayloads;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class NestedPojoObjectPayload {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setEmpno(123);
		employee.setFirstname("shashibhushan");
		employee.setLastname("v");
		employee.setDesignation("sr con");
		
		EmpAddress address = new EmpAddress();
		address.setCity("hyderabad");
		address.setCountry("IN");
		address.setHouseno("343");
		address.setState("Telangana");
		address.setStreet("what street");
		address.setZip("345435");
		
		EmpAddress address2 = new EmpAddress();
		address2.setCity("hyderabad");
		address2.setCountry("IN");
		address2.setHouseno("343");
		address2.setState("Telangana");
		address2.setStreet("what street");
		address2.setZip("345435");
		
		List<EmpAddress> allAddresses = new ArrayList<EmpAddress>();
		allAddresses.add(address);
		allAddresses.add(address2);
		employee.setAddress(allAddresses);
		
		RestAssured.given().log().all()
		.body(employee).post();
	}
}
