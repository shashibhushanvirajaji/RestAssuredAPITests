package jacksonusage;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojopayloads.EmpAddress;

public class ConvertJsonFiletoWithoutPojo_TypeReference {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objMapper = new ObjectMapper();
		
			Map<String,Object> objectMapper = objMapper.
				readValue(new File("C:\\Users\\svirajaj\\eclipse-workspace\\ApiTests\\src\\main\\resources\\payloads\\address.json")
						, new TypeReference<Map<String,Object>>() {
						});
		//System.out.println(objectMapper.get("houseno"));
		//System.out.println(objectMapper.get("state"));
		
		System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectMapper));
		
		objectMapper.put("state", "nagaland");
		objectMapper.put("colony", "teachers colony");
		objectMapper.remove("street");
		
		System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(objectMapper));
		
		
		
	}

}
