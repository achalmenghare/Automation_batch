package select;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.redbus.in/");

		WebElement from = driver.findElement(By.cssSelector("input#src"));
		from.click();
		from.sendKeys("nagpur");

		List<WebElement> option = driver.findElements(By.xpath("//div[@class=\"sc-gZMcBi grvhsy\"]//child::text"));

		
		for (int a = 0; a <= option.size(); a++) {
		try {if (option.get(a).getText().equalsIgnoreCase("dharampeth")) {
			option.get(a).click();
		}
			
		} catch (StaleElementReferenceException e) {
			
		}	

		}

		 //System.out.println("the entered stn_name is:" + from.getAttribute("value"));

		WebElement to = driver.findElement(By.xpath("(//div[@class=\"sc-htoDjs kyqvCq\"])[1]"));
		to.click();
		
		to.sendKeys("amravat");

		List<WebElement> option1 = driver.findElements(By.xpath("//div[@class=\"sc-gZMcBi grvhsy\"]//child::text"));

		
		for (int b = 0; b <= option1.size(); b++) {
			if (option.get(b).getText().equalsIgnoreCase("amravati road")) {
				option.get(b).click();
			}

		}

	}

}
