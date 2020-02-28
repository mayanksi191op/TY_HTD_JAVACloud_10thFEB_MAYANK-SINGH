
public class ElectricBike implements Cycle, Battery {

	public void move()
	{
		System.out.println("Cycle can move.");
	}
	public void charge()
	{
		System.out.println("Charge is full.");
	}
}
