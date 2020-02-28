
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cartPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.Chrome.Driver",
		// "C:\\Users\\Mayank\\Documents\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mayank\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		String[] itemsNeeded = { "Brocolli", "Cauliflower", "Cucumber" };
		int j = 0;
		List<WebElement> prodList = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < prodList.size(); i++) {
			String[] name = prodList.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemsNeededList=Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j == 3)
					break;
			}
		}

	}

	private static List asList(String[] itemsNeeded) {
		// TODO Auto-generated method stub
		return null;
	}

}
