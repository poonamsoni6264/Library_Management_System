package library_Management;

public class Book 
{
   String title;
   String author;
   int id;
//   boolean isBorrowed;
   
   public Book(String title, String author,int id)
   {
	   this.title=title;
	   this.author=author;
	   this.id=id;
	   
   }
   
   @Override
   public String toString()
   {
	  return "Book [title+ " + title + ", Author=" + author +  ", Id = " + id + "]";
	   
   }
   
   public void getAllBooks()
   {
	   
   }
   
}
   


























