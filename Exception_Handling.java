// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;

// Creating class exception for all the methods
class exception
{
	// Creating the object sc of the Scanner file
	Scanner sc = new Scanner(System.in);
	
	// Creating the method for handling ArithmeticException
	void Arithmetic_Exception()
	
	{
		// try block 
		try
		{
			// Taking inputs from user
			System.out.print("\n Enter Number 1 = ");
			Float num1 = sc.nextFloat();
			System.out.print(" Enter Number 2 = ");
			Float num2 = sc.nextFloat();
			
			if(num2 == 0)
			{
				// Computing division
				int a = Math.round(num1);
				int b = Math.round(num2);
				int div = a/b;
				System.out.println("\n --> Division Num1/Num2 = " + div);
			}
			
			else
			{
				// Computing division
				Float div = num1/num2;
				System.out.println("\n --> Division Num1/Num2 = " + div);				
			}
		}
		
		// catch block if ArithmeticException occurs
		catch(ArithmeticException e)
		{
			// Displaying message
			System.out.println("\n --> This is not allowed as it is divided by zero. ");
		}
		System.out.println("\n======================================================================\n");
	}
	 
	// Creating the method for handling ArrayIndexOutOfBoundsException
	void Array_Out_Of_Bound()
	{
		// try block
		try
		{
			int a [] = new int [5];
			System.out.println();
			for (int i=0; i<5; i++)
			{
				System.out.print(" Enter a[" + (i+1) + "] = ");
				a[i] = sc.nextInt();
			}			
			
			// Taking inputs from user
			System.out.print("\n >> Enter the Index Value of an element to Access = ");			
			int index = sc.nextInt();
			System.out.println("\n --> Value is a[" + (index) + "] = " + a[index-1]);
		}
		
		// catch block if ArrayIndexOutOfBoundsException occurs
		catch(ArrayIndexOutOfBoundsException e)
		{
			// Displaying message
			System.out.println("\n --> The Size of Array is less than accessed element. ");
		}
		System.out.println("\n======================================================================\n");
	}
	
	// Creating the method for handling NumberFormatException
	void Number_Format()
	{
		// try block 
		try 
		{
			// Taking inputs from user
			System.out.print("\n >> Enter Number = ");
			String num3 = sc.next();
			System.out.println("\n --> Entered No. = " + Integer.parseInt(num3));
		}
		
		// catch block if NumberFormatException occurs
		catch(NumberFormatException e)
		{
			// Displaying message
			System.out.println(" \n --> This is not allowed as Number is assigned a String Value ");
		}
		System.out.println("\n======================================================================\n");
	}
	
}

// Creating Main class Exception_Handling
public class Exception_Handling {

	public static void main(String[] args) {
		
		// Creating object of Class exception obj
		exception obj = new exception();
		
		System.out.println("\n \t \t ================================= ");
		System.out.println(" \t \t ||  Exception Handling Program || ");
		System.out.println(" \t \t ================================= ");
	
		// Infinite while loop for a Menu driven Program
		 while(true) {
	            
		        // Creating the object sc of the Scanner file
				Scanner sc = new Scanner(System.in);
				
	            // Declaring integer variable choice to take the user's choice
	            int choice;
	        	System.out.println("\n======================================================================");
	        	
	            // Creating a Menu to Ask the User about which Operation to be Performed
	            System.out.println(" >>> Exception Menu :- ");
	            System.out.print("\n \t 1] Arithmetic Exception \t 2] Array Out of Bound \n \t 3] Number Format \t \t 4] Exit Program \n \n >> Enter the Operation to be Performed :: ");

	            // Taking Input from user
	            choice = sc.nextInt();
	            System.out.println("\n======================================================================");
	            
	            // Condition to stop the Program
	            if (choice == 4) 
	            {
	            	System.out.println("\n\n======================================================================\n ");
					System.out.println("\t -----> Program Exited Successfully --> ");
					System.out.println("\n======================================================================\n ");
					break;
	            }

	            else{

	                // Using switch case for different operations to perform
	                switch(choice) {

	                    case 1 :
	                    	// Calling Method Arithmetic_Exception()
	                        obj.Arithmetic_Exception();
	                        break;

	                    case 2 :
	                    	// Calling Method Array_Out_Of_Bound()
	                        obj.Array_Out_Of_Bound();
	                        break;

	                    case 3 :
	                    	// Calling Method Number_Format()
	                    	obj.Number_Format();	                      
	                        break;

	                }

	            }

	        }

	}

}
