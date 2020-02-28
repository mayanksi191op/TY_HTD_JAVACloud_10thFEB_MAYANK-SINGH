
public class TestH {

	public static void main(String[] args) {
		Cow c=new Cow();
		System.out.println("......Cow......");
		c.eat();
		c.walk();
		
		System.out.println(".....Animal.....");
		Animal a=new Animal();
		a.eat();
		
		System.out.println("........Lion.........");
		Lion l=new Lion();
		l.eat();
		l.run();
		

	}

}
