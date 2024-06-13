package dynamic_code;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_class {

	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir")	;
	
	public static void launch_Browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			
		driver= new ChromeDriver();	
		
		}else if (browser.equalsIgnoreCase("edge")) {
			
		driver= new EdgeDriver();
		
		}else if (browser.equalsIgnoreCase("firefox")) {
			
		driver= new FirefoxDriver();	
		}
		
		System.out.println("the browser launched is:"+browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		}
		
		public static void hiturl(String url) {
		driver.get(url);	
		System.out.println(driver.getTitle());	
			
		}
		
		public static void takesscreenshot(String screenshot_name) throws Throwable  {
			TakesScreenshot TS = (TakesScreenshot) driver;
			File way = TS.getScreenshotAs(OutputType.FILE);
			File store = new File("./flipcart_sc/"+screenshot_name+ ".png");
			FileHandler.copy(way, store);	
			
			}
	
		public static void screenshot(String filename) throws Throwable  {
			TakesScreenshot TS1 = (TakesScreenshot) driver;
			File way1 = TS1.getScreenshotAs(OutputType.FILE);
			File store1 = new File(".\\DEMOQA_Alerts\\"+filename+ ".png");
			FileHandler.copy(way1, store1);	
			
			}
	
		

}
