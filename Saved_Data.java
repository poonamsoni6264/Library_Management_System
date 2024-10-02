package library_Management;

import java.util.ArrayList;

public class Saved_Data 
{

	 ArrayList<Book> books = new ArrayList<>();
	 
	 public void save(Book book)
	 {
		 books.add(book);
	 }
	 
	 public void getAllBooks()
	    {
		  for(Book b : books)
 		  {
			 
	    	if(books.isEmpty())
	    	{
	    		System.out.println("No books available in the Library");
	    	}else
	    	{
	    		System.out.println(b);
	    	}
	    	
 		  }
	    	
	    
	    }
}
