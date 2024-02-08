
public class Magazine extends Publication{
	String publisher;
	
	public Magazine (String Publisher, String title, String genre) {
		super (title , genre);
		this.publisher = Publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override 
	public String getInfo() {
		return(getTitle() + ", " + getGenre() + ", " + "Published by " + getPublisher()); 
	}
}
