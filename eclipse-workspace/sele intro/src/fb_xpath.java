import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("dope1");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("mypass");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mypass");

		// parent child travenrse using xpath for link example
		// driver.findElement(By.xpath("//td[@class='login_form_label_field']/div/a")).click();
	}
}
