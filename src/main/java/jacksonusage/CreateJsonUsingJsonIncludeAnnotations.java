package jacksonusage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJsonUsingJsonIncludeAnnotations {

	public static void main(String[] args) throws JsonProcessingException {
		
		Empl ea = new Empl();
		ea.setAge(20);
		ea.setCompany("CG");
		ea.setMarried(true);
		ea.setName("shashi");
		
		ObjectMapper om = new ObjectMapper();
		String str = om.writerWithDefaultPrettyPrinter().writeValueAsString(ea);
		
		System.out.println(str);
		
		/*
		 {
        	"name" : "shashi",
		    "age" : 0,
		    "married" : false,
		    "company" : null
		 }

		 */
		

	}

}
