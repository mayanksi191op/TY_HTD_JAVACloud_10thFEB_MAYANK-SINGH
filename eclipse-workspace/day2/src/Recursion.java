
public class Recursion {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		int i=fact(5);
		System.out.println("factorial is "+i);
	}

}
