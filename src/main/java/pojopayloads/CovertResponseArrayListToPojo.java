package pojopayloads;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class CovertResponseArrayListToPojo {

	public static void main(String[] args) {
	
		// Fetch the json objects as an Array
		/*
		Employee3[] emp = RestAssured.get("https://run.mocky.io/v3/5a570b6c-2bda-40da-9403-6047aecbaafb")
		.as(Employee3[].class);

		System.out.println("no of json objects "+ emp.length);
		System.out.println(emp[0].getFirst_name());
		System.out.println(emp[1].getFirst_name());
		*/
		
		
		// Fetch the json object as a List
		
		List<Employee3> listEmp= RestAssured.get("https://run.mocky.io/v3/5a570b6c-2bda-40da-9403-6047aecbaafb")
		.as(new TypeRef<List<Employee3>>() {});
		
		System.out.println("no of json objects "+ listEmp.size());
		System.out.println(listEmp.get(0).getFirst_name());
		System.out.println(listEmp.get(1).getFirst_name());
	}

}
