package pojopayloads;

import io.restassured.RestAssured;

public class DummyAPIWithStudentPojoClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRollno(123);
		s.setName("shashi");
		s.setGender("male");
		s.setClassname("Tenth");
		
		RestAssured
			.given()
			.log().all()
			.body(s)
			.get();
	}
	
}
