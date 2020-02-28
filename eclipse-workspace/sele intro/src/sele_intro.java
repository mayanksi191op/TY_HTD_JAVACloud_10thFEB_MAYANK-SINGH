import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sele code
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.cssSelector("input#email.inputtext.login_form_input_box")).sendKeys("dope");
		// driver.findElement(By.name("q")).submit();

		System.out.println(driver.getTitle());
		// driver.get("http://yahoo.com");
		// driver.navigate().back();
		// driver.close();
	}

}
