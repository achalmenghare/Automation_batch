package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_drag_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://jqueryui.com/slider/");
		
		Actions action = new Actions(driver);
		WebElement slider_frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(slider_frame);
		
		WebElement box = driver.findElement(By.cssSelector("span[style=\"left: 0%;\"]"));
		action.dragAndDropBy(box, 400, 0).build().perform();
		
		Thread.sleep(3000);
		
		action.moveToElement(box).clickAndHold().moveByOffset(500, 0).build().perform();
		
		Thread.sleep(3000);
		
		action.clickAndHold(box).moveByOffset(-500, 0).release(box).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()=\"Resizable\"]")).click();
		
		System.out.println("the current tite is:"+driver.getTitle());
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
