
public class AreaCircle {

	static double Area(int r)
	{
		double ar=3.14*r*r;
		return(ar);
	}
	public static void main(String[] args) {
		double res=Area(4);
		System.out.println("area is "+res);
	}
}
