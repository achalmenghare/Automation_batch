package base_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Properties_file_baseclass {
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties B_U;
	public static Properties data;
	public static Properties locators;
	public static WebDriver driver;

	public static void property_file() throws IOException {

		// browser_irl
		fis = new FileInputStream(projectpath + "\\src\\test\\resources\\Browser_url.properties");
		B_U = new Properties();
		B_U.load(fis);

		// data
		fis = new FileInputStream(projectpath + "\\src\\test\\resources\\Data.properties");
		data = new Properties();
		data.load(fis);

		// locators
		fis = new FileInputStream(projectpath + "\\src\\test\\resources\\Locators.properties");
		locators = new Properties();
		locators.load(fis);
	}

	public static void open_browser(String browserkey) {

		if (B_U.getProperty(browserkey).equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();

		} else if (B_U.getProperty(browserkey).equalsIgnoreCase("firefox")) {
            driver = new EdgeDriver();
            		
		} else if (B_U.getProperty(browserkey).equalsIgnoreCase("edge")) {
            driver = new FirefoxDriver();
		}
		System.out.println("the browser launched is:"+B_U.getProperty(browserkey));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	
		public static void navigate_url(String urlkey) {
			driver.get(B_U.getProperty(urlkey));
			System.out.println("navigate url is:"+B_U.getProperty(urlkey));
			System.out.println("the title of webpage is:"+driver.getTitle());
		
		
		
		
		
		
		

	}
}