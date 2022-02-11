package pojopayloads;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class StudentPojoClassToJsonArray {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRollno(123);
		s.setName("shashi");
		s.setGender("male");
		s.setClassname("Tenth");
		
		Student s1 = new Student();
		s1.setRollno(124);
		s1.setName("rajesh");
		s1.setGender("male");
		s1.setClassname("bca");
		
		List<Student> listStudents = new ArrayList<Student>();
		listStudents.add(s);
		listStudents.add(s1);
		
		RestAssured
			.given()
			.log().all()
			.body(listStudents)
			.get();
	}
	
}
