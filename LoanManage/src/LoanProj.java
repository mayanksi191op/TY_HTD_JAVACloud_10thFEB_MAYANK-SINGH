import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class LoanProj {

	public void UserInfo() {
		
		Scanner sc=new Scanner(System.in);
		LoanProj loanProj=new LoanProj();
		ArrayList<Object> arrayList = new ArrayList<Object>();
		int x=1;
		//char entry = 0;
		while(x!=0) {
		System.out.println("enter the user_id");
		arrayList.add(sc.nextInt());
		sc.nextLine();
		System.out.print("enter the name");
		//String name=sc.nextLine();
		arrayList.add(sc.nextLine());
		System.out.print("enter the password");
		arrayList.add(sc.nextLine());
		System.out.println("enter the email");
		arrayList.add(sc.nextLine());
		System.out.println("enter another entry? (Y/N)");
		String entry=sc.nextLine();
		System.out.println(" ");
		
		if(entry.equalsIgnoreCase("y")) {
			x=1;
		} else x=0;
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		sc.close();
		
	}
	
	public static void main(String[] args) {

		LoanProj loanProj=new LoanProj();
		int[] arr=new int[10];
		ArrayList<Object> dyn=new ArrayList<Object>();
		
		loanProj.UserInfo();
	}
}
