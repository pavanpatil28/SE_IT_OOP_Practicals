
public class SUVCarFactory implements CarFactory
{
    @Override
	public Car buildCar(String model, String fuel_type, String color, String wheel, String engine) 
    {           
        Car car = new SUVCar(model, fuel_type, color, wheel, engine);
          
        return car;   
    }
}