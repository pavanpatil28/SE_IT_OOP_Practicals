
public class SedanCar implements Car 
{
	String model;
	String fuel_type;
	String color;
	String wheel;
	String engine;
	
    SedanCar(String model, String fuel_type, String color, String wheel, String engine) 
	{
        this.model = model;
        this.fuel_type = fuel_type;
        this.color = color;
		this.wheel = wheel;
		this.engine = engine;
    } 
	
	public String getModel()
	{
		return model;
	}
	
	public void setWheel(String wheel)
	{
		this.wheel = wheel;
	}

	public void setFuel_Type(String fuel_type)
	{
		this.fuel_type = fuel_type;
	}
	
	public String getFuel_Type()
	{
		return fuel_type;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getWheel()
	{
		return wheel;
	}
	
	public void setEngine(String engine)
	{
		this.engine = engine;
	}

	public String getEngine()
	{
		return engine;
	}

}
