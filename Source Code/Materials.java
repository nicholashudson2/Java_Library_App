import java.util.ArrayList;
import java.util.Date;


public class Materials {


	int id;
	String title;
	Date dateCheckedOut;
	Date dateDue;
	Patron checkedOutBy;
	boolean isOverdue;
	
	boolean isCheckedOut;
	Patron whoCheckedOut;

   
	/*
	 *  This is the wrong class for this constructor. 
	 *  You already have a constructor for Books in the Book class. 
	 */
//   //Constructor
//	public Book(String argBookTitle, String argBookAuthor, int argBookId){
//		title=argBookTitle;
//		bookAuthor=argBookAuthor;
//		id=argBookId;

	// Not quite sure what you're trying to accomplish here. 
	// You have a List<Book> in the Library class... What is this meant to contain?
	//ArrayList       Class    Name
	// private ArrayList<Library> books = new ArrayList<Library>();
	
	// These exist in the Book class...
	//Variables
//	private String bookTitle;
//	private String bookAuthor;
//	private int bookId;

	dateDue=dateCheckedOut.plusDays(28);
	System.out.println("Due Date: " + dateDue);
	
	
	//}
	
	// Again, this is defined in the Dvd class, no need for another constructor here.
//	public Dvd (String argDvdTitle, String argDvdRating, int argDvdId){
//		title=argDvdTitle;
//		dvdRating=argDvdRating;
//		id=argDvdId;

	// Also contained in the Library class...
	//ArrayList       Class    Name
//	private ArrayList<Library> dvds = new ArrayList<Library>();
	
	// These variables are contained in the Dvd class as well.
	//Variables
//	private String dvdTitle;
//	private String dvdRating;
//	private int dvdId;

	dateDue=dateCheckedOut.plusDays(7);
	System.out.println("Due Date: " + dateDue);
	
	}
	
	
	/*
	 *  If this is meant to be a method, you'll need to specify
	 *  it's accessibility (public, private, or protected), and
	 *  designate a return type. How do you know which object this applies to?
	 */
	overdueDate(){
		if (dateDue.isBefore(currentDate)) {
		System.out.println("Overdue!");
	}
	}
	
	
}

	