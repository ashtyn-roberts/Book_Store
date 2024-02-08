
public class Book extends Publication{
	private String author;
	
	public Book (String Author, String title, String genre) {
		super(title, genre);
		this.author = Author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override 
	public String getInfo() {
		return (getTitle() + ", " + getGenre() + ", " + getAuthor()); 
	}
	
}
