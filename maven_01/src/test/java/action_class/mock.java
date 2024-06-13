package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mock {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   driver.get("https://www.netmeds.com/");
	   System.out.println(driver.getTitle());
	   Actions action = new Actions(driver);
	   
	  WebElement search = driver.findElement(By.xpath("//input[@id=\"search\"]"));
	   action.moveToElement(search).click().sendKeys("paracetamol").build().perform();
	   action.keyDown(Keys.ENTER).build().perform();
	   System.out.println(driver.getTitle());
	   
	   
	}

}
