package TestNG_001;

import org.testng.annotations.Test;

public class Depends_on_method {
  @Test
  public void launchbrowser() {
	  System.out.println("launchbrowser");
  }
  
  @Test(dependsOnMethods = "launchbrowser")
  public void hiturl() {
	  System.out.println("hiturl");
  }
  @Test(dependsOnMethods = "hiturl")
  public void webelemet() {
	  System.out.println("webelement");
  }
  @Test
  public void clickonsearchbox() {
	  System.out.println("clickonsearchbox");
  }
  @Test
  public void sendkeys() {
	  System.out.println("sendkeys");
  }
  @Test(dependsOnMethods = "sendkeys")
  public void clickonsearchbtn() {
	  System.out.println("clickonsearchbtn");
  }
  
  
  
  
  
  
}
