package jacksonusage;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojopayloads.EmpAddress;

public class ConvertJsonFiletoPojo {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper objMapper = new ObjectMapper();
		EmpAddress address = objMapper.readValue(new File("C:\\Users\\svirajaj\\eclipse-workspace\\ApiTests\\src\\main\\resources\\payloads\\address.json"), EmpAddress.class);
		System.out.println(address.getCity());
		
		System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address));
		address.setCity("banglaore");	
		System.out.println(objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(address));
	}

}
