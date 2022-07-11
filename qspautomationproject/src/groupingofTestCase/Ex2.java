package groupingofTestCase;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ex2 {
	 @Test(groups="automation")

public void tc5()
	{
		Reporter.log("Test Case Executed-5",true);
	}
	@Test(groups="automation")//when we execute only some test case we use <include name="TestcaseName">
	public void tc6()
	{
		Reporter.log("Test Case Executed-6",true);
	}
                                 // when we need to execute remaining test case apart from 
	@Test(groups="automation")     // <exclude name="TestcaseName">
	public void tc7()
	{
		Reporter.log("Test Case Executed-7",true);
	}
	@Test(groups="automation")
	public void tc8()
	{
		Reporter.log("Test Case Executed-8",true);
		
	}

}

	
	
