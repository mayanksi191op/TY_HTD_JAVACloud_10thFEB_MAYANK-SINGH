
public class Star6 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++)
		{
			//System.out.print(" ");
			for(int j=i; j<4; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<i; k++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<3; k++)
			{
				System.out.print("x");
			}
			System.out.println();
		}
		
	/*	for(int p=0; p<3; p++)
		{
			for(int k=3; k<=p; k--)
			{
				System.out.print("x");
			}
			System.out.println();
		} */
	}

}
