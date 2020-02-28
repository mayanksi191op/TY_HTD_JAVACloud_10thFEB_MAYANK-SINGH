
public class FactMethod {

	
		static int fact(int a)
		{
			int f=1;
			for(int i=1;i<a;i++)
			{
				f=f*i;
			}
			return f;
		}
		

	
	public static void main(String[] args)
	{
		int res=fact(7);
		System.out.println("result is"+res);
	}
}
