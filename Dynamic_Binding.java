// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;

// Creating Abstract Class Shape for both Rectangle and Triangle 
abstract class Shape 
	{
	
	// Declaring variables for taking value of length and breadth of both Shape
	double length,breadth;
	
	// Creating Object sc for Class Scanner
	Scanner sc = new Scanner(System.in);
	
	// Creating a method get_data for taking input of length and breadth
	public void get_data() 
	{
		
		System.out.print("\n >> Enter the Length = ");
		length = sc.nextDouble();
		System.out.print(" >> Enter the Breadth = ");
		breadth = sc.nextDouble();
		
	}
	
	// Declaring Abstract method compute_area for defining in derived class 
	abstract void compute_area(double length,double breadth);
}

// Creating Child Class Triangle from Parent Class Shape
class Triangle extends Shape {
	
	// Declaring a Variable 
	double area;
	
	// Defining the Abstract Method compute_area
	public void compute_area(double length,double breadth) {
		
		// Computing area value
		area = (length * breadth)/2;
		System.out.println("\n --> Area of Triangle is = " +area);
		System.out.println("=====================================================================");

	}
	
}

// Creating Child Class Rectangle from Parent Class Shape
class Rectangle extends Shape {
	
	// Declaring a Variable
	double area;
	
	// Defining the Abstract Method compute_area
	public void compute_area(double length,double breadth) {

		// Computing area value
		area = length * breadth;
		System.out.println("\n --> Area of Rectangle is = " +area);
		System.out.println("=====================================================================");

	}
	
}

// Creating Main Class Dynamic_Binding
public class Dynamic_Binding {

	public static void main(String[] args) {

		System.out.println("\n \t    ======================================= ");
		System.out.println(" \t    ||   Dynamic Binding Area of Shape   || ");
		System.out.println(" \t    ======================================= ");
		Triangle obj1 = new Triangle();
		Rectangle obj2 = new Rectangle();

		// Using a infinite While loop for performing operations infinite times
		while(true) {

			// Creating the object sc of the Scanner file
			Scanner sc = new Scanner(System.in);
			
			// Declaring integer variable choice to take the user's choice
			int choice;
			System.out.println("\n=====================================================================");
			
			// Creating a Menu to Ask the User about which Operation to be Performed
			System.out.println(" >>> Shape Area Menu :- ");
			System.out.print("\n 1] Calculate Area of Triangle \n 2] Calculate Area of Rectangle \n 3] Exit Program \n >> Enter the Shape :: ");

			// Taking Input from user
			choice = sc.nextInt();
			System.out.println("=====================================================================");
			
			// Condition to stop the Program
			if (choice == 3) {

				System.out.println("\n \t -----> Program Exited Successfully --> ");
				System.out.println("\n=====================================================================");
				break;

			}

			else{

				// Using switch case for different operations to perform
				switch(choice) {

					case 1 :
						// Calculating Triangle Area
						System.out.println("\n=====================================================================");
						System.out.println(" >>> Triangle :- ");
						
						// Calling get_data() method 
						obj1.get_data();
						
						// Calling compute_area() method
						obj1.compute_area(obj1.length,obj1.breadth);
						break;

					case 2 :
						// Calculating Rectangle Area
						System.out.println("\n=====================================================================");
						System.out.println(" >>> Rectangle :- ");
						
						// Calling get_data() method
						obj2.get_data();
						
						// Calling compute_area() method
						obj2.compute_area(obj2.length,obj2.breadth);
						break;

				}

			}

		}


	}

}
