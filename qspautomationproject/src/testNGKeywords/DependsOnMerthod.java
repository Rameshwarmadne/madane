package testNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMerthod {
	@Test(timeOut=3000)
	public void tc1() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log(" Running tc1",true);
	
	}
	
	@Test
	public void tc2()
	{
		Reporter.log(" Running tc2",true);
	}
	
	@Test(dependsOnMethods={"tc1","tc2"})//dependsOnMethod is keyword used to run the method 
	public void tc3()                    //depends on given method
	{
		Reporter.log(" Running tc3s",true);
	}

}
