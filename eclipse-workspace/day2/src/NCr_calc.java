
public class NCr_calc {

	public static void main(String[] args) {
		int n=5;
		int r=2;
		int k=0;
		int nrf=1;
		
		int nf=1;
		int rf=1;
		
		for(int i=1; i<=n; i++)
		{
			nf=nf*i;
		}
		for(int i=1; i<r; i++)
		{
			rf=rf*i;
		}
		for(int i=1; i<(n-r); i++)
		{
			nrf=nrf*i;
		}
		
		k=nf/(rf*nrf);
		System.out.println("nCr is "+k);

	}

}
