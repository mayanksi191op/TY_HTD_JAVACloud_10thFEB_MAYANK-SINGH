import java.util.Scanner;

public class TestC {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the name");
				String name=scan.nextLine();
				
				System.out.println("Enter the age");
				int age=scan.nextInt();
				
				System.out.println("Enter the height");
				double height=scan.nextDouble();
				
				System.out.println("Name is "+name);
				System.out.println("Age is "+age);
				System.out.println("Height is "+height);
				scan.close();
	}
}
