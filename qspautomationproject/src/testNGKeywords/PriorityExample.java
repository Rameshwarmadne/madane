package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityExample {
	@Test(priority=3,invocationCount=1)
	public void Tc1()
	{
		Reporter.log("running tc 1",true);
	}
	@Test(priority=2,invocationCount=0)
	public void Tc2()
	{
		Reporter.log("running tc 2",true);
	}
	@Test(priority=1,invocationCount=0)
	public void Tc3()
	{
		Reporter.log("running tc 3",true);
	}

}
