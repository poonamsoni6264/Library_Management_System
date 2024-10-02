package library_Management;

import java.util.Scanner;

public class LibraryManagementSystem 
{

	public static void main(String[] args) 
	{
		Library li = new Library();
		Borrow_Return2 br = new Borrow_Return2();
		Scanner sc =new Scanner(System.in);
		
        int choice;
		  do 
			{
				System.out.println("Welcome to Library Management System........");
				System.out.println("1. Add Book");
				System.out.println("2. To get all Books");
				System.out.println("3. For borrow Book from Library ");
				System.out.println("4. Exit");
				
				System.out.println("Select your option :");
				
				choice = sc.nextInt();
				sc.nextLine();
				
				if(choice == 1)
				{
					li.addBook();

				}else if(choice == 2)
				{
				li.BookList();
			    }else if(choice == 3)
				{
					br.menu();
				}
				else if(choice == 4)
				{
					System.out.println("Exit the system");
			    	sc.close();
			    	break;
				}
				else 
				{
					System.out.println("Name is not match from Book");
				}
			
			
		}while(true);
		  
		}
	}


       
	



		
		
		
		
		
