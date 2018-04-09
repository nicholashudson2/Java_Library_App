public class Book
{
	// Declaring variables...
	String title;
	String bookAuthor;
	int id;
	
	//Constructor
	public Book (String title, String bookAuthor, int id){
		/*
		 *  I prefer to use the "this" keyword, as I can use the same name for
		 *  both my field declarations and argument names, like this: 
		 */
		this.title=title;
		this.bookAuthor=bookAuthor;
		this.id=id;
	}
	
	public String getTitle()
	{
		// Logic to obtain the title of a book:
		return this.title;
	}
}