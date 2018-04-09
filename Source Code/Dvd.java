public class Dvd
{
	String title;
	String dvdRating;
	int id;
	
	public Dvd (String title, String dvdRating, int id){
		this.title=title;
		this.dvdRating=dvdRating;
		this.id=id;
	}
	
	public String getTitle()
	{
		// Logic to obtain the title of a DVD:
		return this.title;
	}
}
