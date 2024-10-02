package library_Management;

public class Book2 
{

	 String title;
	 String author;
	 boolean isBorrowed;
	
	  
	 public Book2(String title, String author)
	   {
		   this.title=title;
		   this.author=author;
		   this.isBorrowed=false;
	   }
	 
	 public void borrowBooks()
	   {
		  
		if(!isBorrowed)
		   {
			   isBorrowed = true;
			   System.out.println("You have borrowed : " + title);
		   }else
		   {
			   System.out.println("Sorry, the book is already borrowed : " + title);
		   }
	   }
	   
	   public void returnBook()
	   {
		   if(isBorrowed)
		   {
			   isBorrowed = false;
			   System.out.println("You have returned : "+ title);
		   }else
		   {
			   System.out.println("This book was not borrowed.");
		   }
	   }

	public boolean isBorrowed() {
		
		return false;
	}
	
	public Object getBooks() {

		return null;
	}
	
}


