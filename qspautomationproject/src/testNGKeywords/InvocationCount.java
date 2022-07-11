package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount {
  @Test(invocationCount=2,priority=2)//priority keyword is  used to execute the test case as per
	public void tc1()                // our requirement
	{
		Reporter.log("Runniung tc 1..",true);
	}
  @Test(invocationCount=2,priority=1)//invocationCount is used to run the test case in multiple time
  public void Tc2()
  {
	  Reporter.log("Running test case 2",true);
  }
  @Test(enabled=true)  // by default priority is a zero '0';
  public void imcompletmethod() {
	  Reporter.log("This is imcomleted method ",true);
  }
}
