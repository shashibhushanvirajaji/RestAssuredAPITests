package jacksonusage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
	
	@JsonProperty("book name")
	private String bookname;
	@JsonProperty("author name")
	private String authorname;
	@JsonProperty("publisher")
	private String publisher;
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
}
