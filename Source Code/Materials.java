import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.month;
import java.time.temporal.ChronoUnit;
import java.ArrayList;


public class Materials {


	int id;
	String title;
	localDate dateCheckedOut;
	localDate dateDue;
	Patron checkedOutBy;
	boolean isOverdue;
	
	boolean isCheckedOut;
	Patron whoCheckedOut;

   
   //Constructor
	public Book (String argBookTitle, String argBookAuthor, int argBookId){
		title=argBookTitle;
		bookAuthor=argBookAuthor;
		id=argBookId;

	
	//ArrayList       Class    Name
	private ArrayList<Library> books = new ArrayList<Library>();
	
	//Variables
	private String bookTitle;
	private String bookAuthor;
	private int bookId;

	dateDue=dateCheckedOut.plusDays(28);
	System.out.println("Due Date: " + dateDue);
	
	
	}
	
	public Dvd (String argDvdTitle, String argDvdRating, int argDvdId){
		title=argDvdTitle;
		dvdRating=argDvdRating;
		id=argDvdId;

	
	//ArrayList       Class    Name
	private ArrayList<Library> dvds = new ArrayList<Library>();
	
	//Variables
	private String dvdTitle;
	private String dvdRating;
	private int dvdId;

	dateDue=dateCheckedOut.plusDays(7);
	System.out.println("Due Date: " + dateDue);
	
	}
	
	
	
	overdueDate(){
		if (dateDue.isBefore(currentDate)) {
		System.out.println("Overdue!");
	}
	}
	
	
}

	