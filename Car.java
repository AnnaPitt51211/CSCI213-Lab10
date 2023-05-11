/**
 * This is the implemented Lab 10 Car class
 * @author Anna Pitt
 *
 */
public class Car extends Vehicle
{
	// Declares the instance variables
	private int doorCount;
	private int passengerCount;
	
	public Car(String makeIn, String modelIn, String plateIn, int doorIn, int passIn)
	{
		// Calls the super constructor
		super(makeIn, modelIn, plateIn);
		
		// Initializes the new instance variables
		this.doorCount = doorIn;
		this.passengerCount = passIn;
	}
	
	public int getDoors()
	{
		// Returns the Car's door count
		return this.doorCount;
	}
	
	public int getPassengers()
	{
		// Returns the Car's passenger count
		return this.passengerCount;
	}
	
	@Override
	public String toString()
	{	
		// Formats the String
		String result = String.format("%d-door %s %s with license %s.", this.doorCount, super.getMake(), super.getModel(), super.getPlate());
		
		// Returns the String result
		return result;
	}
	
	@Override
	public boolean equals(Object other)
	{
		// Returns false if the object passed in isn't of the Car type
		if(!(other instanceof Car))
		{
			return false;
		}
		
		// Casts the object passed in to the Car type
		Car otherCar = (Car) other;
		
		// If the Cars are equal, returns True
		if(this.doorCount == otherCar.doorCount)
		{
			if(this.passengerCount == otherCar.passengerCount)
			{
				return super.equals(otherCar);
			}
		}
		
		// Otherwise, returns False
		return false;
	}
	
	public Car copy()
	{
		// Initializes the copy of the Car
		Car carCopy = new Car(super.getMake(), super.getModel(), super.getPlate(), this.getDoors(), this.getPassengers());
		
		// Returns the copy of the Car
		return carCopy;
	}
}