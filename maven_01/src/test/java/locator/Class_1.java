package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://www.facebook.com/");
	
	//id
	driver.findElement(By.id("dweb_pip_id"));
	driver.findElement(By.id("flt-srch-wdgt"));
	
	//name
	driver.findElement(By.name("author"));
	driver.findElement(By.name("google-site-verification"));
	
	
	//class
	driver.findElement(By.className("jsx-9eb1b484cea2908f relative mx-auto max-w-[990px]"));
	driver.findElement(By.className("sc-cvbbAY bixBmU"));
	
	//linktext
	
	driver.findElement(By.linkText("New Releases"));
	driver.findElement(By.linkText("Customer Service"));
	
	//partiallinketext
	
	driver.findElement(By.partialLinkText("Health, Household & Pers"));
	driver.findElement(By.partialLinkText("Kindle eBo"));
	
	//css combination
	
	//1.tagname & id value
	driver.findElement(By.cssSelector("div#criteo-tags-div"));
	driver.findElement(By.cssSelector("div#batBeacon450802881721"));
	
	//2.tagname & classname
	driver.findElement(By.cssSelector("div.rtcSection"));
	driver.findElement(By.cssSelector("div.seoPartialListContainer"));
	
	//3.tagname & arrtibute
	driver.findElement(By.cssSelector(" meta[charset=\"utf-8\"]"));
	driver.findElement(By.cssSelector("header[id=\"navbar-main\"]"));
	
	//4.tagname & multiple attributes
	driver.findElement(By.cssSelector("li[id=\"menu-item-6898\"][class=\"menu-item menu-item-type"
	+ "-post_type menu-item-object-page menu-item-6898\"]"));
	
	driver.findElement(By.cssSelector("div[id=\"wrapper\"][class=\"full_wrapper page_title_bgr responsive\"]"));
	
	//tagname
	driver.findElements(By.tagName("a"));
	driver.findElements(By.tagName("li"));
	
	//startswith
	driver.findElement(By.cssSelector("a[class^=\"mini_banner_\"]"));
	driver.findElement(By.cssSelector("ul[id^=\"recent_sear\"]"));
	
	//contain
	driver.findElement(By.cssSelector("span[class*=\"landingSprite listYourPropertyIcon appendRight10\"]"));
	driver.findElement(By.cssSelector("div[id*=\"wrapper\"]"));
	
	//endswith
	driver.findElement(By.cssSelector("nav[class$=\"igation\"]"));
	driver.findElement(By.cssSelector("footer[id$=\"ter\"]"));
	
	//psuedo class
	//first child
	driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :first-child"));
	
	//last child
	driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :last-child"));
	
	//nth child
	driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :nth-child(4)"));
	
	//nth last child
	driver.findElement(By.cssSelector("div[class=\"Dropdown-menu\"] :nth-last-child(3)"));
	
	//xpath
	//absolute xpath
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/ul/li[5]/a"));
	
	//relative xpath
	//combination
	
	// 1.tagname and attribute
	driver.findElement(By.xpath("//a[@class=\"RY_vertical TrainTicket_tab\"]"));
	
	// 2.tagname and multiple attribute
	driver.findElement(By.xpath("//button[@class=\"btn btn-default\"][@type=\"submit\"]"));
	
	//and operator
	driver.findElement(By.xpath("//input[@name=\"boarding_to\"and@id=\"to_stn_input\"]"));
	
	//or operator
	driver.findElement(By.xpath("//input[@id=\"src\"or@class=\"search-btn\"]"));
			
	//contains
	driver.findElement(By.xpath("//input[contains(@id,\"to_stn_input\")]"));	
	
	//startswith
	driver.findElement(By.xpath("//html[starts-with(@class,\"useInterFont en\")]"));
			
	//text without index
	driver.findElement(By.xpath("//a[text()=\" Electronics \"]"));
	
	//text with index
	driver.findElement(By.xpath("(//a[text()=\"Sum of diagonal elements using Comprehension\"])[3]"));
			
   //parent and child relationship
	driver.findElement(By.xpath("(//div[@class=\"Dropdown-menu\"]//div[@class=\"Dropdown-option\"])[1]"));
	
    //select current node
	driver.findElement(By.xpath("//form[@class=\"PreferenceForm_form__28cCJ\"]//self::form"));
	
	//select parent of current element node
    driver.findElement(By.xpath("//option [@value=\"search-alias=fashion\"]//parent::select"));
	
	//select child of parent element 
   driver.findElement(By.xpath("(//select[@id=\"searchDropdownBox\"]//child::option)[1]"));
  
   
	}

}
