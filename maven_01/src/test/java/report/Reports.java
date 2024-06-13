package report;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamic_code.Base_class;

public class Reports extends Base_class {

	public static void main(String[] args) throws Throwable {

		String projectpath = System.getProperty("user.dir");
		System.out.println(projectpath);

		ExtentSparkReporter esr = new ExtentSparkReporter(projectpath + "\\reports\\report_1");
		esr.config().setDocumentTitle("automation");
		esr.config().setReportName("flipcart_report");
		esr.config().setTheme(Theme.STANDARD);

		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);

		er.setSystemInfo("operating system", "windows");
		er.setSystemInfo("browser", "chrome");
		er.setSystemInfo("tester", "achal");
		er.setSystemInfo("e_commerce_site", "flipcart");

		ExtentTest et = er.createTest("search-flipcart");
        et.log(Status.INFO,"find_search_webelement");
        
        ExtentTest et1 = er.createTest("click_search");
        et.log(Status.INFO,"click_search_webelement");
        
        ExtentTest et2 = er.createTest("search-laptops");
        et.log(Status.FAIL,"sendkeys_in_search_box");
        
        ExtentTest et3 = er.createTest("click_search_btn");
        et.log(Status.INFO,"find_search_btn");
        
        ExtentTest et4 = er.createTest("click_on_laptop");
        et.log(Status.SKIP,"find_dell_laptop");
		
		launch_Browser("chrome");
		hiturl("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		search.click();
		search.sendKeys("laptops");
		takesscreenshot("search_laptops");
		et2.addScreenCaptureFromPath(projectpath+"\\flipcart_sc\\search_laptops.png");
	   
	    er.flush();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
