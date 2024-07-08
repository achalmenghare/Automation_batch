package testNG_class;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import dynamic_code.Base_class;
import project_object_module.Demo_1;

public class Practice extends Base_class {
  @Test
  public void account_create() {
	  Demo_1 demo = new Demo_1(driver);
	  demo.create_account();
  }
  
  @BeforeSuite
  public void befosuite() {
	  launch_Browser("chrome");
	  hiturl("http://www.automationpractice.pl/");
	  
  }
  @AfterSuite
  public void aftersuite() {
	  
	  
	  
  }
}
