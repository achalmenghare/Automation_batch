package dynamic_code;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_reports {

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static ExtentReports er;
	public static ExtentTest test;

	public static void reports(String doctitle, String reportname, String app) {

		ExtentSparkReporter esr = new ExtentSparkReporter(projectpath + "\\reports\\report_2");
		esr.config().setDocumentTitle("doctitle");
		esr.config().setReportName("reportname");
		esr.config().setTheme(Theme.STANDARD);

		er = new ExtentReports();
		er.attachReporter(esr);

		er.setSystemInfo("operating system", "windows");
		er.setSystemInfo("browser", "chrome");
		er.setSystemInfo("tester", "achal");
		er.setSystemInfo("e_commerce_site", "snapdeal");
	}

	public static void Test(String Testname, String Testinfo) {
		test = er.createTest(Testname);
		test.log(Status.INFO, Testinfo);

	}

	public static void addscreencapture(String screenshotname) {
		test.addScreenCaptureFromPath(projectpath + "\\flipcart_sc\\" + screenshotname + ".png");
	}

	public static void launch_Browser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}

		System.out.println("the browser launched is:" + browser);
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
		File store1 = new File(".\\report_amazon\\"+filename+ ".png");
		FileHandler.copy(way1, store1);	
		
		}
        
	   

}
