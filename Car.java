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
		return this.doorCount;
	}
	
	public int getPassengers()
	{
		return this.passengerCount;
	}
	
	@Override
	public String toString()
	{		
		String result = String.format("%d-door %s %s with license %s.", this.doorCount, super.getMake(), super.getModel(), super.getPlate());
		return result;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Car))
		{
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.doorCount == otherCar.doorCount)
		{
			if(this.passengerCount == otherCar.passengerCount)
			{
				return super.equals(otherCar);
			}
		}
		
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