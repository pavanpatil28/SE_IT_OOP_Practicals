// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;
//Importing the Java Formatter class to format the output.
import java.util.Formatter;

// Creating the class Employee
class Employee
{	
	// Declaring the String variables to use in the program
		String name, mail, employeeid, date, mobno, str = "|";
		
	// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);	

	// Making the Constructor Public
		public 
	
	// Creating Constructor Employee
	Employee()
	{				
		System.out.println("======================================================================\n");
		// Taking Input from user
			
		System.out.println(" \t\t ======================= ");
		System.out.print(" \t\t ||   Employee Data   || \n");
		System.out.println(" \t\t ======================= \n");		
			
		System.out.print(" >> Enter Name of the Employee             ::  ");
		name = sc.next();
		System.out.print(" >> Enter Employee-Id                      ::  ");
		employeeid = sc.next();
		System.out.print(" >> Enter Date of Joining of the Employee  ::  ");
		date = sc.next();
		System.out.print(" >> Enter Email-Id of the Employee         ::  ");
		mail = sc.next();
		Mob_No();
			
	}

	private void Mob_No() 
	{
		System.out.print(" >> Enter Mobile No of the Employee        ::  ");
		mobno = sc.next();
		
		if(mobno.length() == 10)
		{
			for(int i = 1; i < mobno.length(); i++)
			{
				if(mobno.charAt(i) == '0' || mobno.charAt(i) == '1' || mobno.charAt(i) == '2' || mobno.charAt(i) == '3' || mobno.charAt(i) == '4' || mobno.charAt(i) == '5' || mobno.charAt(i) == '6' || mobno.charAt(i) == '7' || mobno.charAt(i) == '8' || mobno.charAt(i) == '9')
				{
					break;
				}
				else
				{
					System.out.println("\n --> Enter a Valid Mobile No \n");
					Mob_No();
				}
			}
		}
		else
		{
			System.out.println("\n --> Enter a Valid Mobile No \n");
			Mob_No();			
		}
		
	}
	
}

// Inheriting the derived class Programmer from the base class Employee
class Programmer extends Employee 
{	
	// Declaring the Float variables to use in the derived class
	float BP,DA,HRA,PF,CF,GS,NS,TD;
	
	// Constructor to Calculate the Programmer Salary data
	Programmer()
	{	
		// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);

		// Calculations
		System.out.print(" >> Enter Basic Salary of the Employee     ::  ");
		BP = sc.nextFloat();
		System.out.println("\n --> Employee Data Entered Successfully ");
		
		DA = (97*BP)/100;
		HRA = (10*BP)/100;
		PF = (12*BP)/100;
		CF = (0.1f*BP)/100;
		GS = BP + DA + HRA;
		NS = GS - PF - CF;		
		TD = PF + CF;
		System.out.println("\n======================================================================\n");
	}
	
	// Method to display the Entered data and calculated data
	public void display()
	{	
		Formatter fmt1 = new Formatter(); 
		Formatter fmt2 = new Formatter(); 
		Formatter fmt3 = new Formatter(); 
		
		// Displaying the data
		System.out.println("======================================================================\n");
		System.out.println(" \t\t\t ======================================== ");
		System.out.print(" \t\t\t ||   Salary Sleep of the Programmer   || \n");
		System.out.println(" \t\t\t ======================================== \n");
		
		System.out.println(" ___________________________________________________________________________________");	
		fmt1.format("%1s %43s %39s \n", "|", "GOOGLE", "|");
		System.out.print(fmt1);
		System.out.println("|___________________________________________________________________________________|");
		
		fmt2.format("%1s %50s %32s \n", "|", "Redmond, Washington", "|");
		System.out.print(fmt2);		
		System.out.println("|___________________________________________________________________________________|");

		fmt3.format("%1s %48s %34s \n", "|", "Pay Slip Feb-22", "|");
		System.out.print(fmt3);
		System.out.println("|___________________________________________________________________________________|");
		
		System.out.printf("|  Employee Name     | %2s %13s", name, str);
		System.out.printf("  Employee DA           | %2s %9s", DA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee ID       | %2s %12s", employeeid, str);
		System.out.printf("  Employee HRA          | %2s %10s", HRA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");			
		
		System.out.printf("|  Date of Joining   | %2s %8s", date, str);
		System.out.printf("  Employee PF           | %2s %10s", PF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Designation       | Programmer        |");
		System.out.printf("  Employee CF           | %2s %12s", CF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");		
		
		System.out.printf("|  Employee E-mail   | %2s %2s", mail, str);	
		System.out.printf("  Employee GS           | %2s %8s", GS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee Mob No   | %2s %8s", mobno, str);		
		System.out.printf("  Employee NS           | %2s %8s", NS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
				
		System.out.printf("|  Total Deduction   |    %5s %52s", TD, str);
		System.out.println("\n|____________________|______________________________________________________________|");
		
		System.out.println("\n\n======================================================================\n");	
	}
	
}

// Inheriting the derived class Team_Lead from the base class Employee
class Team_Lead extends Employee
{	
	// Declaring the Float variables to use in the derived class
	float BP,DA,HRA,PF,CF,GS,NS,TD;
	
	// Constructor to Calculate the TEam_Lead Salary data
	Team_Lead()
	{		
		// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);

		// Calculations
		System.out.print(" >> Enter Basic Salary of the Employee     ::  ");
		BP = sc.nextFloat();
		System.out.println("\n --> Employee Data Entered Successfully ");
		
		DA = (97*BP)/100;
		HRA = (10*BP)/100;
		PF = (12*BP)/100;
		CF = (0.1f*BP)/100;
		GS = BP + DA + HRA;
		NS = GS - PF - CF;	
		TD = PF + CF;
		System.out.println("\n======================================================================\n");
	}
	
	// Method to display the Entered data and calculated data
	public void display() 
	{		
		// Displaying the data
		System.out.println("======================================================================\n");
		System.out.println(" \t\t\t ======================================= ");
		System.out.print(" \t\t\t ||   Salary Sleep of the Team Lead   || \n");
		System.out.println(" \t\t\t ======================================= \n");
		
		Formatter fmt1 = new Formatter(); 
		Formatter fmt2 = new Formatter(); 
		Formatter fmt3 = new Formatter(); 
		
		System.out.println(" ___________________________________________________________________________________");	
		fmt1.format("%1s %43s %39s \n", "|", "GOOGLE", "|");
		System.out.print(fmt1);
		System.out.println("|___________________________________________________________________________________|");
		
		fmt2.format("%1s %50s %32s \n", "|", "Redmond, Washington", "|");
		System.out.print(fmt2);		
		System.out.println("|___________________________________________________________________________________|");

		fmt3.format("%1s %48s %34s \n", "|", "Pay Slip Feb-25", "|");
		System.out.print(fmt3);
		System.out.println("|___________________________________________________________________________________|");
		
		System.out.printf("|  Employee Name     | %2s %14s", name, str);
		System.out.printf("  Employee DA           | %2s %9s", DA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee ID       | %2s %12s", employeeid, str);
		System.out.printf("  Employee HRA          | %2s %10s", HRA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");			
		
		System.out.printf("|  Date of Joining   | %2s %8s", date, str);
		System.out.printf("  Employee PF           | %2s %10s", PF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Designation       | Team Lead         |");
		System.out.printf("  Employee CF           | %2s %12s", CF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");		
		
		System.out.printf("|  Employee E-mail   | %2s %2s", mail, str);	
		System.out.printf("  Employee GS           | %2s %8s", GS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee Mob No   | %2s %8s", mobno, str);		
		System.out.printf("  Employee NS           | %2s %8s", NS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Total Deduction   |    %5s %52s", TD, str);
		System.out.println("\n|____________________|______________________________________________________________|");
		
		System.out.println("\n\n======================================================================\n");
	}
	
}

//Inheriting the derived class Assistant_Project_Manager from the base class Employee
class Assistant_Project_Manager extends Employee
{	
	// Declaring the Float variables to use in the derived class
	float BP,DA,HRA,PF,CF,GS,NS,TD;
	
	// Constructor to Calculate the Assistant_Project_Manager Salary data
	Assistant_Project_Manager()
	{
		// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);

		// Calculations
		System.out.print(" >> Enter Basic Salary of the Employee     ::  ");
		BP = sc.nextFloat();
		System.out.println("\n --> Employee Data Entered Successfully ");
		
		DA = (97*BP)/100;
		HRA = (10*BP)/100;
		PF = (12*BP)/100;
		CF = (0.1f*BP)/100;
		GS = BP + DA + HRA;
		NS = GS - PF - CF;	
		TD = PF + CF;
		System.out.println("\n======================================================================\n");
	}
	
	// Method to display the Entered data and calculated data
	public void display() 
	{		
		// Displaying the data
		System.out.println("======================================================================\n");
		System.out.println(" \t\t ======================================================= ");
		System.out.print(" \t\t ||   Salary Sleep of the Assistant Project Manager   || \n");
		System.out.println(" \t\t ======================================================= \n");
		
		Formatter fmt1 = new Formatter(); 
		Formatter fmt2 = new Formatter(); 
		Formatter fmt3 = new Formatter(); 
		
		System.out.println(" ___________________________________________________________________________________");	
		fmt1.format("%1s %43s %39s \n", "|", "GOOGLE", "|");
		System.out.print(fmt1);
		System.out.println("|___________________________________________________________________________________|");
		
		fmt2.format("%1s %50s %32s \n", "|", "Redmond, Washington", "|");
		System.out.print(fmt2);		
		System.out.println("|___________________________________________________________________________________|");

		fmt3.format("%1s %48s %34s \n", "|", "Pay Slip Feb-27", "|");
		System.out.print(fmt3);
		System.out.println("|___________________________________________________________________________________|");
		
		System.out.printf("|  Employee Name     | %2s %13s", name, str);
		System.out.printf("  Employee DA           | %2s %8s", DA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee ID       | %2s %12s", employeeid, str);
		System.out.printf("  Employee HRA          | %2s %9s", HRA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");			
		
		System.out.printf("|  Date of Joining   | %2s %8s", date, str);
		System.out.printf("  Employee PF           | %2s %9s", PF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Designation       | Assistant Project Manager |");
		System.out.printf("  Employee CF   | %2s %12s", CF, str);
		System.out.println("\n|____________________|___________________________|________________|_________________|");		
		
		System.out.printf("|  Employee E-mail   | %2s %2s", mail, str);	
		System.out.printf("  Employee GS           | %2s %8s", GS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee Mob No   | %2s %8s", mobno, str);		
		System.out.printf("  Employee NS           | %2s %8s", NS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Total Deduction   |    %5s %52s", TD, str);
		System.out.println("\n|____________________|______________________________________________________________|");
		
		System.out.println("\n======================================================================\n");
	}
	
}

//Inheriting the derived class Project_Manager from the base class Employee
class Project_Manager extends Employee
{	
	// Declaring the Float variables to use in the derived class
	float BP,DA,HRA,PF,CF,GS,NS,TD;
	
	// Constructor to Calculate the Project_Manager Salary data
	Project_Manager()
	{		
		// Creating the object sc of the Scanner file
		Scanner sc = new Scanner(System.in);

		// Calculations
		System.out.print(" >> Enter Basic Salary of the Employee     ::  ");
		BP = sc.nextFloat();
		System.out.println("\n --> Employee Data Entered Successfully ");
		
		DA = (97*BP)/100;
		HRA = (10*BP)/100;
		PF = (12*BP)/100;
		CF = (0.1f*BP)/100;
		GS = BP + DA + HRA;
		NS = GS - PF - CF;	
		TD = PF + CF;
		System.out.println("\n======================================================================\n");
	}
	
	// Method to display the Entered data and calculated data
	public void display() 
	{		
		// Displaying the data
		System.out.println("======================================================================\n");
		System.out.println(" \t\t\t ============================================= ");
		System.out.print(" \t\t\t ||   Salary Sleep of the Project Manager   || \n");
		System.out.println(" \t\t\t ============================================= \n");
				
		Formatter fmt1 = new Formatter(); 
		Formatter fmt2 = new Formatter(); 
		Formatter fmt3 = new Formatter(); 
				
		System.out.println(" ___________________________________________________________________________________");	
		fmt1.format("%1s %43s %39s \n", "|", "GOOGLE", "|");
		System.out.print(fmt1);
		System.out.println("|___________________________________________________________________________________|");
				
		fmt2.format("%1s %50s %32s \n", "|", "Redmond, Washington", "|");
		System.out.print(fmt2);		
		System.out.println("|___________________________________________________________________________________|");

		fmt3.format("%1s %48s %34s \n", "|", "Pay Slip Mar-2", "|");
		System.out.print(fmt3);
		System.out.println("|___________________________________________________________________________________|");
				
		System.out.printf("|  Employee Name     | %2s %10s", name, str);
		System.out.printf("  Employee DA           | %2s %8s", DA, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
		
		System.out.printf("|  Employee ID       | %2s %12s", employeeid, str);
		System.out.printf("  Employee HRA          | %2s %9s", HRA, str);
				System.out.println("\n|____________________|___________________|________________________|_________________|");			
		
		System.out.printf("|  Date of Joining   | %2s %8s", date, str);
		System.out.printf("  Employee PF           | %2s %9s", PF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
				
		System.out.printf("|  Designation       | Project Manager   |");
		System.out.printf("  Employee CF          | %3s %11s", CF, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");		
				
		System.out.printf("|  Employee E-mail   | %2s %2s", mail, str);	
		System.out.printf("  Employee GS           | %2s %8s", GS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");
				
		System.out.printf("|  Employee Mob No   | %2s %8s", mobno, str);		
		System.out.printf("  Employee NS           | %2s %8s", NS, str);
		System.out.println("\n|____________________|___________________|________________________|_________________|");

		System.out.printf("|  Total Deduction   |    %5s %52s", TD, str);
		System.out.println("\n|____________________|______________________________________________________________|");
		
		System.out.println("\n======================================================================\n");
	}
	
}

// Creating class Inheritance which is the main class of this program
public class Inheritance
{
	// Creating main method
	public static void main(String[] args) {

		System.out.println("\n \t\t =========================== ");
		System.out.print(" \t\t ||   Welcome to GOOGLE   || \n");
		System.out.println(" \t\t =========================== \n");
		
		// Using a infinite While loop for performing operations infinite times 
		while(true) {
			
			// Creating the object sc of the Scanner file
			Scanner sc = new Scanner(System.in);
			
			// Declaring integer variable choice to take the user's choice
			int choice;
			
			System.out.println("======================================================================");
			// Creating a Menu to Ask the User about which Operation to be Performed
			System.out.println(" >>> Designation Menu :- \n");
			System.out.println(" 1] Programmer. " + "\t\t" + " 2] Team_Lead. " + "\n" + " 3] Assistant_Project_Manager. " + "\t" + " 4] Project_Manager. " + "\n" + " 5] Exit. ");					
			System.out.print("\n >> Enter the Designation of the Employee :: ");
			// Taking Input from user
			choice = sc.nextInt();
			System.out.println("\n======================================================================\n");
			
			// Condition to stop the Program
			if (choice == 5) 
			{	
				System.out.println("\t -----> Program Exited Successfully --> ");			
				System.out.println("\n======================================================================\n");
				break;
				
			}
			
			else{
				
				// Using switch case for different operations to perform
				switch(choice) {
				
					case 1 :
						Programmer obj1 = new Programmer();
						obj1.display();
						break;
					
					case 2 :
						// Creating object obj2 of class Team_Lead
						Team_Lead obj2 = new Team_Lead();
						obj2.display();
						break;
					
					case 3 :	
						// Creating object obj3 of class Assistant_Project_Manager
						Assistant_Project_Manager obj3 = new Assistant_Project_Manager();
						obj3.display();
						break;
					
					case 4 :
						// Creating object obj4 of class Project_Manager
						Project_Manager obj4 = new Project_Manager();
						obj4.display();
						break;
					
				}
				
			}
				
		}

	}

}
