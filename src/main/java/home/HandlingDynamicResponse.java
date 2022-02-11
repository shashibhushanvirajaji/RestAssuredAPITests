package home;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicResponse {

	public static void main(String[] args) {
		
		
		Response response =				
				RestAssured.get("https://run.mocky.io/v3/ba9127ac-7976-4d53-a4c6-0265244b6b2a");
		
		Object responseObject = response.as(Object.class);
		if(responseObject instanceof List)
		{
			List responseAsList = (List)responseObject;
			System.out.println(responseAsList.size());
		}
		else
			if(responseObject instanceof Map)
			{
				Map responseAsMap = (Map)responseObject;
				System.out.println(responseAsMap.keySet());
			}
	}

}
