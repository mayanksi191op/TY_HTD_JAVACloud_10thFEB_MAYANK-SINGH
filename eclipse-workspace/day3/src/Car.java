
public class Car {
	int cost;
	String color;
	int reg_no;

	void move()
	{
		System.out.println("car can move");
	}
	void stop()
	{
		System.out.println("car can stop");
	}
	void display()
	{
		System.out.println("Cost is Rs"+cost);
		System.out.println("Color is "+color);
		System.out.println("Reg_no is "+reg_no);
	}
}
