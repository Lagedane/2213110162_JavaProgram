
public class Movie {
	private String id;
	private String name;
	private Director director;
	
	public Movie (String id, String name, Director director){
		this.id       = id;
		this.name     = name;
		this.director = director;
	}
	public Movie() {
		this.id       = "";
		this.name     = "";
		this.director = null;
	}
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	
	//toString()
	public String toString() {
		return getId() + " " + getName() + " direct by " + director;
	}
}
