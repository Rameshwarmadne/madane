package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	@Test ( timeOut=5000)//this annotation used to run the script within this time if not it gives res false
	public void Tc1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("Running test case tc1",true);
	}
	@Test
	public void Tc2()
	{
		Reporter.log("Running tc 2",true);
	}

}
