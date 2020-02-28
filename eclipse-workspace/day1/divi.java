class divi{
		public static void main(String ar[]){
			int num=2;

			if(num%3==0 && num%5==0)
				{
				System.out.println("divisible by both 3 and 5");}
			else if(num%3==0)
				{
				System.out.println("divisible by 3");}
			else if(num%5==0)
				{
				System.out.println("divisible by 5");}
			
			else {
				System.out.println("not divisible by 3 and 5");}
}
}