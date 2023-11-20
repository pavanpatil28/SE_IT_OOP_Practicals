// Importing the Java Scanner class to take Input from the user.
import java.util.Scanner;

// Creating Interface Vehicles
interface Vehicles 
{	
	// Declaring Methods we need to Define 
	public void speed_up();
	public void gear_change(int a);
	public void apply_breaks();
	public void display();	 
}

// Creating Class Bicycle which implements Interface Vehicles
class Bicycle implements Vehicles {

	int speed,gear;
	Bicycle()			//default constructor for bicycle
	{
		System.out.println(" --> Bicycle has Started Successfully ");
		gear=1;			//gear is 1 when Cycle starts
		speed=10;		//speed is 10 when Cycle Starts
	}
	
	public void gear_change(int a) {

		gear = a;
		if (gear<7 && gear>0)
		{	
			// maximum gear is 6
			System.out.print("\n --> Gear changed Successfully \n --> Current Gear is :: " + gear);
		}
		else 
		{
			System.out.print(" --> Entered gear Must be Between 1 and 6 ");
		}
		
	}
	public void speed_up() 
	{

		if((speed+5)<60 ) 
		{		
			// 50 is the Maximum Speed
			speed += 5;
			System.out.println(" --> Bicycles speed increased \n --> current speed is :: " + speed + " Km-hr");
		}
		else 
		{
			System.out.println(" --> Speed Cannot Be Increased Above 60 Km-hr ");
		}

	}
	public void apply_breaks() {

		if((speed-5)>0)	
		{		
			// speed cannot be negative
			speed-=5;			// apply brakes bicycle speed is reduced by 5
			System.out.print(" --> Speed Reduced Successfully \n --> Current speed is :: " + speed + " Km-hr ");

		}
		else 
		{
			speed=0;
			gear=0;
			System.out.print(" --> Bicycle has Stopped Successfully ");
		}
		
	}

	public void display(){

		System.out.println(" --> Your Bicycle's Speed is :: " + speed + " Km-hr And Gear is :: " + gear);

	}

}

//Creating Class Car which implements Interface Vehicles
class Car implements Vehicles {

	int speed,gear;
	Car()
	{
		System.out.println(" --> Car has Started Successfully ");
		gear=1;			// speed when car started
		speed=10;		// gear when car started
	}
	
	public void gear_change(int a) {

		gear = a;
		if(gear<7 && gear>0) 
		{	
			// maximum gear is 6
			System.out.print("\n --> Gear changed Successfully \n --> Current Gear is :: " + gear);
		}
		else {
			System.out.print(" --> Entered gear Must be Between 1 and 6 ");
		}
		
	}
	public void speed_up() {

		if((speed+20)<180 )
		{		
			//150 as maximum speed
			speed+=20;
			System.out.println(" --> Car speed increased \n --> Current speed is :: " + speed + " Km-hr ");
		}
		else 
		{
			System.out.println(" --> Speed Cannot Be Increased Above 180 Km-hr ");
		}
		
	}
	public void apply_breaks() {

		if((speed-20)>0) 
		{	
			
			//checks speed is negative or positive if reduced by 20
			speed-=20;			//per apply brakes vehicle speed is reduced by 20
			System.out.print(" --> Speed Reduced Successfully \n --> Current Speed is :: "+speed+" Km-hr ");
		}
		else 
		{
			speed=0;
			gear=0;
			System.out.print(" --> Car has stopped Successfully ");
		}
		
	}
	
	public void display()		//displays current status of car
	{
		System.out.println(" --> Your Car's Speed is :: " + speed + " Km-hr and Gear is :: " + gear);
	}
	
}

//Creating Class Bike which implements Interface Vehicles
class Bike implements Vehicles {

	int gear,speed;		//data members of bike class
	Bike()
	{
		System.out.println(" --> Bike has Started Successfully ");
		gear=1;		//initial gear when bike starts
		speed=10;	//initial speed of bike when starts
	}
	
	public void gear_change(int a) {

		gear = a;
		if(gear<6 && gear>0) 
		{
			//maximum gears is 5
			System.out.print("\n --> Gear Changed Successfully \n --> Current Gear is :: " + gear);
		}
		else 
		{
			System.out.print(" --> Entered Gear Must be Between 1 and 5 ");
		}	
	}
	
	public void speed_up() {

		if((speed+20)<120 )		//maximum speed is 100 for bike
		{
			speed+=20;
			System.out.print(" --> Bike's Speed Increased \n --> Current speed is :: " + speed + " Km-hr. \n");
		}
		else {
			System.out.println(" --> Speed Cannot Be Increased Above 120 Km-hr ");
		}
		
	}
	public void apply_breaks() {

		if((speed-20)>0) 
		{	
			//checks speed is negative or positive if reduced by 20
			speed-=20;			//per apply brakes vehicle speed is reduced by 20
			System.out.print(" --> Speed Reduced Successfully \n --> Current Speed is :: " + speed + " Km-hr. ");
		}
		else
		{
			speed=0;
			gear=0;
			System.out.print(" --> Bike has Stopped Successfully ");
		}
		
	}
	
	//displays current bike status
	public void display() 
	{		
		System.out.println(" --> Your Bike's Speed is :: " + speed + " Km-hr and Gear is :: " + gear);
	}

}

// Creating Main Class Interface
public class Interface {

	public static void main(String[] args) {

		// Creating the object sc of the Scanner file to take Input
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\t    =================================== ");
		System.out.print("\t    ||   Interface Vehicle Program   || \n");
		System.out.println("\t    =================================== \n");
		
		// Infinite While loop for a Menu driven Program
		while(true){

			System.out.println("==============================================================");
			// Creating a Menu for Selecting a Vehicle
			System.out.print(" >>> Select Vehicle :- \n 1] BICYCLE \n 2] CAR \n 3] BIKE \n 4] Exit \n >> Enter Which Vehicle to Start :: ");
			int choice1 = sc.nextInt();
			System.out.println();

			if (choice1==1) {
				
				// Creating obj1 for class Bicycle
				Bicycle obj1 = new Bicycle();
				System.out.println("==============================================================");
				while (true) {
					
					// Creating a Menu to Ask the User about which Operation to be Performed
					System.out.println("\n==============================================================");
					System.out.println(" >>> Bicycle Action Menu :- ");
					System.out.println(" 1] Speed Up the Bicycle ");
					System.out.println(" 2] Change the Gear of the Bicycle ");
					System.out.println(" 3] Apply Breaks to the Bicycle ");
					System.out.println(" 4] Display the Status of the Bicycle ");
					System.out.println(" 5] Stop/Change the Vehicle ");
					System.out.print(" >> Enter the Action to be Performed :: ");
					
					// Taking Input from user
					int choice2 = sc.nextInt();
					System.out.println();
					
					// Condition to stop the Program
					if (choice2 == 5) 
					{
						System.out.println(" --> Bicycle has Stopped Successfully ");
						System.out.println("==============================================================\n");
						break;
					}
					else 
					{
						// Using switch case for different operations to perform
						switch (choice2) {
							case 1:
								// Calling method speed_up()
								obj1.speed_up();
								System.out.println("==============================================================");
								break;
							case 2:
								System.out.println(" >> Which Gear you want ? ");
								System.out.print(" >> ");
								int a = sc.nextInt();
								// Calling method gear_change()
								obj1.gear_change(a);
								System.out.println();
								System.out.println("==============================================================");
								break;
							case 3:
								// Calling method apply_breaks()
								obj1.apply_breaks();
								System.out.println();
								System.out.println("==============================================================");
								break;
							case 4:
								// Calling method display()
								obj1.display();
								System.out.println("==============================================================");
								break;
								
							// Condition for Invalid Input
							default:
								System.out.println(" --> Enter the valid Action ");
								System.out.println("==============================================================");
								break;
						}
					}
				}
			}
			
			else if (choice1==2) {
					Car obj2 = new Car();
					System.out.println("==============================================================");
					
					while (true) {
						
						// Creating a Menu to Ask the User about which Operation to be Performed
						System.out.println("\n==============================================================");
						System.out.println(" >>> Car Action Menu :- ");
						System.out.println(" 1] Speed Up the Car ");
						System.out.println(" 2] Change the Gear of the Car ");
						System.out.println(" 3] Apply Breaks to the Car ");
						System.out.println(" 4] Display the Status of the Car ");
						System.out.println(" 5] Stop/Change the Vehicle ");
						System.out.print(" Enter the Action to be Performed :: ");
						
						// Taking Input from user
						int choice2 = sc.nextInt();
						System.out.println();
						
						// Condition to stop the Program
						if (choice2 == 5) 
						{
							System.out.println(" --> Car has Stopped Successfully ");
							System.out.println("==============================================================\n");
							break;
						} 
						else 
						{
							// Using switch case for different operations to perform
							switch (choice2) 
							{
								case 1:
									// Calling method speed_up()
									obj2.speed_up();
									System.out.println("==============================================================");
									break;
								case 2:
									System.out.println(" >> Which Gear you want ? ");
									System.out.print(" >> ");
									int a = sc.nextInt();
									// Calling method gear_change()
									obj2.gear_change(a);
									System.out.println();
									System.out.println("==============================================================");
									break;
								case 3:
									// Calling method apply_breaks()
									obj2.apply_breaks();
									System.out.println();
									System.out.println("==============================================================");
									break;
								case 4:
									// Calling method display()
									obj2.display();
									System.out.println("==============================================================");
									break;
									
								// Condition for Invalid Input
								default:
									System.out.println(" --> Enter the valid Action ");
									System.out.println("==============================================================");
									break;
							}
						}
					}
				}
			
			else if (choice1==3){
				Bike obj3 = new Bike();
				System.out.println("==============================================================\n");
				while (true) 
				{
					
					// Creating a Menu to Ask the User about which Operation to be Performed
					System.out.println("==============================================================");
					System.out.println("\n >>> Bike Action Menu :- ");
					System.out.println(" 1] Speed Up the Bike ");
					System.out.println(" 2] Change the Gear of the Bike ");
					System.out.println(" 3] Apply Breaks to the Bike ");
					System.out.println(" 4] Display the Status of the Bike ");
					System.out.println(" 5] Stop/Change the Vehicle ");
					System.out.print(" >> Enter the Action to be Performed :: ");
					
					// Taking Input from user
					int choice2 = sc.nextInt();
					System.out.println();
					
					// Condition to stop the Program
					if (choice2 == 5) 
					{
						System.out.println(" --> Bike has Stopped Successfully ");
						System.out.println("==============================================================\n");
						break;
					}
					else 
					{
						// Using switch case for different operations to perform
						switch (choice2) {
							case 1:
								// Calling method speed_up()
								obj3.speed_up();
								System.out.println("==============================================================");
								break;
							case 2:
								System.out.println(" >> Which Gear you want ? ");
								System.out.print(" >> ");
								int a = sc.nextInt();
								// Calling method gear_chage()
								obj3.gear_change(a);
								System.out.println();
								System.out.println("==============================================================");
								break;
							case 3:
								// Calling method apply_breaks()
								obj3.apply_breaks();
								System.out.println();
								System.out.println("==============================================================");
								break;
							case 4:
								// Calling method display()
								obj3.display();
								System.out.println("==============================================================");
								break;
								
							// Condition for Invalid Input
							default:
								System.out.println(" --> Enter the valid Action ");
								System.out.println("==============================================================");
								break;
						}
					}
				}
			}
			else if (choice1==4)
			{
				System.out.println("============================================================== \n ");
				System.out.println(" -----> Program Exited Successfully --> ");
				System.out.println("\n============================================================== \n ");
				break;
			}
			else 
			{
				System.out.println(" --> INVALID INPUT ");
				System.out.println("\n============================================================== \n ");
			}
		}
	}
}


