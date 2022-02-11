package home;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonReponseToList {

	public static void main(String[] args) {
		
		List<Map<String,Object>> lisst = RestAssured.get("https://run.mocky.io/v3/8a879ca7-6d9a-44ca-9265-7e68b8f54864")
				//.as(List.class);
				.as(new TypeRef<List<Map<String,Object>>>() {
				});
				
		System.out.println(lisst.size());
		
		Map<String,Object> obj1 = lisst.get(0);
		System.out.println(obj1.get("holder"));
	}
}
