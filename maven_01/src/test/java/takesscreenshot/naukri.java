package takesscreenshot;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class naukri {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		TakesScreenshot TS = (TakesScreenshot) driver;
		File way = TS.getScreenshotAs(OutputType.FILE);
		File store = new File("./screenshot/naukri_app.png");
		FileHandler.copy(way, store);

		driver.get("https://www.naukri.com");
		System.out.println(driver.getTitle());
		
		TakesScreenshot TS1 = (TakesScreenshot) driver;
		File way1 = TS1.getScreenshotAs(OutputType.FILE);
		File store1 = new File("./screenshot/naukri_app1.png");
		FileHandler.copy(way1, store1);

		WebElement search = driver.findElement(By.xpath("(//input[@class=\"suggestor-input \"])[1]"));
		search.click();
		search.sendKeys("software tester");
		TakesScreenshot TS3 = (TakesScreenshot) driver;
		File way3 = TS3.getScreenshotAs(OutputType.FILE);
		File store3 = new File("./screenshot/naukri_search1.png");
		FileHandler.copy(way3, store3);

		
		
	  driver.findElement(By.cssSelector("div.qsbSubmit")).click();
	  Thread.sleep(6000);
	  
	  String Projectpath = System.getProperty("user.dir");
	  System.out.println("projectpath");
	  TakesScreenshot TS2 = (TakesScreenshot) driver;
		File way2 = TS2.getScreenshotAs(OutputType.FILE);
		File store2 = new File(Projectpath+"\\screenshot\\naukri_search2.png");
		FileHandler.copy(way2, store2);
         
		
		
      
	}
}
