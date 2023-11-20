
public class SedanCarFactory implements CarFactory
{
    @Override
	public Car buildCar(String model, String fuel_type, String color, String wheel, String engine) 
    {
	               
        Car car = new SedanCar(model, fuel_type, color, wheel, engine);
			      
        return car;  
	}
}
