package library_Management;
import java.util.ArrayList;
import java.util.Scanner;

public class Library 
{
	Scanner input=new  Scanner(System.in);
	Saved_Data repo=new Saved_Data();
	
    
    public void addBook()
    {
    	System.out.println("enter the Book Name :");
		String b1=input.nextLine();
    	
		System.out.println("enter the Author Name :");
		String b2=input.nextLine();
		
		System.out.println("enter the id  :");
		int b3=input.nextInt();
		input.nextLine();
		
		Book b = new Book(b1,b2,b3);
		
		repo.save(b);
		
		
    	System.out.println("Book added in the Library");
    	
    	
    }
    
    public void BookList()
    {
    	repo.getAllBooks();
    	System.out.println(); 
    	System.out.println();
    	System.out.println();
    }

//	public Object getBooks() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//    
    
}
