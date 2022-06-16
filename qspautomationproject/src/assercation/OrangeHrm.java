package assercation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrm {
  @Test
 
  public void testCase() 
	{
Reporter.log("launch the browser",true);
Reporter.log("Launch the web application",true);
Reporter.log("verify the login page",true);
SoftAssert softAssert = new SoftAssert();
Assert.assertEquals(false,true);



Reporter.log("perform login",true);
Assert.assertEquals(true,true);
Reporter.log("verify home page",true);
Reporter.log("create contact",true);
Reporter.log("create user",true);
softAssert.assertAll();



	}
}
