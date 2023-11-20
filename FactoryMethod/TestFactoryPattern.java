import java.util.*;

public class TestFactoryPattern 
{
	CarFactory carBuilder;
	Car car;
	
    public static void main(String[] args) 
    {
    	TestFactoryPattern client = new TestFactoryPattern();
    	client.buildCarMethod();
    }
    
    public void buildCarMethod() 
    {
    	Scanner sc = new Scanner(System.in);
    	int choice = 0;
    	
    	System.out.println("\n \t\t ======================================");
        System.out.println(" \t\t ||    FACTORY DESIGN PATTERN FOR    ||");
        System.out.println(" \t\t ======================================");
        
    	String model, engine, wheel, fuel_type, color;
    	
    	do 
    	{
    		System.out.println("\n============================================================================\n");
    		
	        System.out.println(" >>> Main Menu For Designing Car :- \n");

	        System.out.println(" 1] Design Hatchback Car \t 2] Design Sedan Car \n\n 3] Design SUV Car \t\t 4] Exit From Program \n " );
			System.out.print(" >> Enter The Action To Be Performed    ::  ");
	        choice=sc.nextInt();
	        System.out.println("\n============================================================================\n");
	        
			switch(choice) 
			{
		        case 1:
		        	System.out.println(" >>> Building Hatchback Car :- \n");
		    		carBuilder = new HatchbackCarFactory();
		    		
		        	System.out.print(" >> Enter Which Model You Want      ::  ");
		    		model = sc.next();
		    		System.out.print(" >> Enter Which Fuel Type You Want  ::  ");
		    		fuel_type = sc.next();
		    		System.out.print(" >> Enter Which Color You Want      ::  ");
		    		color = sc.next();		    		
		    		System.out.print(" >> Enter Which Engine You Want     ::  ");
		    		engine = sc.next();
		    		System.out.print(" >> Enter Which Wheels You Want     ::  ");
		    		wheel = sc.next();
		    		
		    		System.out.println("\n============================================================================\n");
		    		System.out.println(" >>> Hatchback Car Building :- "); 
		    		//car = carBuilder.buildCar("Polo", "Michelin", "VW");
		    		car = carBuilder.buildCar(model,fuel_type,color,engine,wheel);
		   
		    		System.out.println("\n --> Your Car Is Now Going To Be ");
		    		System.out.println("\n --> Ready Please Wait For Few Days ");
		    		System.out.println("\n --> Your Car Is Ready With Following Specifiaction ");
		    		System.out.println("\n --> Which You Given To The Factory ");
		            System.out.println("\n\n --> Car Is Assembled Model of Car is      ::  "+ car.getModel());
		            System.out.println("\n --> Car Is Assembled Fuel Type of Car is  ::  "+ car.getFuel_Type());
		            System.out.println("\n --> Car Is Assembled Color of Car is      ::  "+ car.getColor());
		            System.out.println("\n --> Car Is Assembled Engine of Car is     ::  "+ car.getEngine());
		            System.out.println("\n --> Car Is Assembled Wheel of Car is      ::  "+ car.getWheel());
		            break;
		        case 2:
		        	System.out.println(" >>> Building Sedan Car :- \n");
		        	carBuilder = new SedanCarFactory();
		        
		        	System.out.print(" >> Enter Which Model You Want      ::  ");
		    		model = sc.next();
		    		System.out.print(" >> Enter Which Fuel Type You Want  ::  ");
		    		fuel_type = sc.next();
		    		System.out.print(" >> Enter Which Color You Want      ::  ");
		    		color = sc.next();		    		
		    		System.out.print(" >> Enter Which Engine You Want     ::  ");
		    		engine = sc.next();
		    		System.out.print(" >> Enter Which Wheels You Want     ::  ");
		    		wheel = sc.next();
		    		
		    		System.out.println("\n============================================================================\n");
		    		System.out.println(" >>> Sedan Car Building :- "); 
		    		//car = carBuilder.buildCar("Dzire", "MRF", "Suzuki");
		    		car = carBuilder.buildCar(model,fuel_type,color,engine,wheel);
		    		
		     		System.out.println("\n --> Your Car Is Now Going To Be ");
		    		System.out.println("\n --> Ready Please Wait For Few Days ");
		    		System.out.println("\n --> Your Car Is Ready With Following Specifiaction ");
		    		System.out.println("\n --> Which You Given To The Factory ");
		            System.out.println("\n\n --> Car Is Assembled Model of Car is      ::  "+ car.getModel());
		            System.out.println("\n --> Car Is Assembled Fuel Type of Car is  ::  "+ car.getFuel_Type());
		            System.out.println("\n --> Car Is Assembled Color of Car is      ::  "+ car.getColor());
		            System.out.println("\n --> Car Is Assembled Engine of Car is     ::  "+ car.getEngine());
		            System.out.println("\n --> Car Is Assembled Wheel of Car is      ::  "+ car.getWheel());
		        	break;
		        case 3:
		        	System.out.println(" >>> Building SUV Car :- \n");
		        	carBuilder = new SUVCarFactory();
		        	System.out.print(" >> Enter Which Model You Want      ::  ");
		    		model = sc.next();
		    		System.out.print(" >> Enter Which Fuel Type You Want  ::  ");
		    		fuel_type = sc.next();
		    		System.out.print(" >> Enter Which Color You Want      ::  ");
		    		color = sc.next();		    		
		    		System.out.print(" >> Enter Which Engine You Want     ::  ");
		    		engine = sc.next();
		    		System.out.print(" >> Enter Which Wheels You Want     ::  ");
		    		wheel=sc.next();
		    		
		    		System.out.println("\n============================================================================\n");
		    		System.out.println(" >>> SUV Car Building :- "); 
		    		//car = carBuilder.buildCar("Innova", "Bridgestone", "Fiat");
		    		car = carBuilder.buildCar(model,fuel_type,color,engine,wheel);
		    		
		    		System.out.println("\n --> Your Car Is Now Going To Be ");
		    		System.out.println("\n --> Ready Please Wait For Few Days ");
		    		System.out.println("\n --> Your Car Is Ready With Following Specifiaction ");
		    		System.out.println("\n --> Which You Given To The Factory ");
		            System.out.println("\n\n --> Car Is Assembled Model of Car is      ::  "+ car.getModel());
		            System.out.println("\n --> Car Is Assembled Fuel Type of Car is  ::  "+ car.getFuel_Type());
		            System.out.println("\n --> Car Is Assembled Color of Car is      ::  "+ car.getColor());
		            System.out.println("\n --> Car Is Assembled Engine of Car is     ::  "+ car.getEngine());
		            System.out.println("\n --> Car Is Assembled Wheel of Car is      ::  "+ car.getWheel());
		            break;
		        case 4:
		        	System.out.println("\t --> Program Exited Successfully ");
					System.out.println("\n============================================================================\n");
		        	break;
			}      
    	}while(choice!=4);
    }
}
