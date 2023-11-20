

public class HatchbackCarFactory implements CarFactory 
{
	  @Override
	  public Car buildCar(String model, String fuel_type, String color, String wheel, String engine) 
	  {        
	       Car car = new HatchbackCar(model, fuel_type ,color, wheel, engine);
	       
	       //Can declare and call internal method to assemble parts here
	       //System.out.println("%s car is assembled with wheels from %s and engine from %s"+ car.model+ car.wheel+ car.engine);
	       
	       return car;  
	  }
}



