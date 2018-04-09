


public class UnitTestLab7 {
	public static void main(String[] args) {


	//UnitTest 1
		Patron p = new Patron ("Patrick Hill", "p.hill10@lorainccc.edu");
		
	//Add Books
		Book b=new Book("Java Programming", "Bob Dill", 100);
		Book b1=new Book("Computers", "Thomas Jefferson", 101);
		Book b2=new Book("Microsoft for Dummies", "Chuck Uhler", 102);

		p.addBook(b);
		p.addBook(b1);		
	  //p.addBook(b2); - Book Available
		
	//Add DVDs
		Dvd d=new Dvd ("Rudy", "PG", 200);
		Dvd d2=new Dvd ("Goodfellas", "R", 201,);
		p.addDvd(d);
	  //p.addDvd(d2); - DVD Available

		
		
		System.out.println(...);
		
	}