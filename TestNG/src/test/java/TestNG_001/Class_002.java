package TestNG_001;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_002 {
  @Test
  public void m() {
	  System.out.println("test1");
  }
  
  @BeforeMethod
  public void o() {
	  System.out.println("beforemethod1");
  }
}
