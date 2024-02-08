
public class Publication implements Comparable<Publication>{
	private String title;
	private String genre;
	
	public Publication (String Title, String Genre) {
		this.title = Title;
		this.genre = Genre;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int compareTo(Publication other ) {
		if (genre.compareTo(other.genre) != 0) {
			return (genre.compareTo(other.genre));
		}
		else {
			return (title.compareTo(other.title));
		}
	}
	
	public String getInfo() {
		return(getTitle() + ", " + getGenre()); 
	}
}
