package jacksonusage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializeDeSerialzeJsonProperty {

	public static void main(String[] args) throws JsonProcessingException {

		Book book = new Book();
		book.setAuthorname("shashibhushan");
		book.setBookname("ABA booo");
		book.setPublisher("Some hyderabadi");
		
		ObjectMapper objMapper = new ObjectMapper();
		String strMap = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(book); // serialize()
		
		System.out.println(strMap);
		
		Book book1 = objMapper.readValue(strMap, Book.class);
		System.out.println(book1.getAuthorname());   // deserialize() 
	}

}
