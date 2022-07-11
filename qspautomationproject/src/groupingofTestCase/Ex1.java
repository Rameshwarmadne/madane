package groupingofTestCase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex1 {
	@Test(groups="login")
	public void tc1()
	{
		Reporter.log("Test Case Executed-1",true);
	}
	@Test(groups="HomePage")//when we execute only some test case we use <include name="TestcaseName">
	public void tc2()
	{
		Reporter.log("Test Case Executed-2",true);
	}
                                 // when we need to execute remaining test case apart from 
	@Test(groups="HomePage")     // <exclude name="TestcaseName">
	public void tc3()
	{
		Reporter.log("Test Case Executed-3",true);
	}
	@Test(groups="login")
	public void tc4()
	{
		Reporter.log("Test Case Executed-4",true);
		
	}

}
