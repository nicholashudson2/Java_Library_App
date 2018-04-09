


public class Patron {

	private String name;
	private String email;
	private String residency;
	
		//Constructor
	public Patron(String name, String email, String residency) {
		this.name=name;
		this.email=email;
		this.residency=residency;
	}
		
		
		
//GET ~~~
	public  String getName (){
		return this.name;
	}
	
	public  String getEmail () {
		 return this.email;
	}
}