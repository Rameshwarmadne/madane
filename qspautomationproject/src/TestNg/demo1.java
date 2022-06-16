package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1 {
  @Test
  public void method() {
	 // System.out.println("test case is passed");
	  Reporter.log("method executed",true);
	  
  }
}
