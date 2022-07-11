package failedXMLFile;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedFileRerun {
	@Test
	public void tc1()
	{
		Reporter.log("Test Case Executed-1",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("Test Case Executed-1",true);
	}

	@Test
	public void tc3()
	{
		Reporter.log("Test Case Executed-1",true);
		//Assert.fail();
	}

	@Test
	public void tc4()
	{
		Reporter.log("Test Case Executed-1",true);
		//Assert.fail();
	}

}
