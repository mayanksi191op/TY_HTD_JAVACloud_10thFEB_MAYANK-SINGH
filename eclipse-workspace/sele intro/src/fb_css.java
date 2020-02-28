import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("cssdope");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("dopepass");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
