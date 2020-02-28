
import java.io.File;
import java.io.IOException;


public class TestA {

		public static void main(String[] args) {
			System.out.println("Main Started");
			
			//System.out.println(10/0);
			
			 File f=new File("Z/Mayank.txt");
			
			 try
			{
				f.createNewFile();
				System.out.println("File Created");
				
			}catch(IOException e)
			{
			System.out.println("Sorry could not creat the file");
			}		
			System.out.println("Main ended");
		}
}
