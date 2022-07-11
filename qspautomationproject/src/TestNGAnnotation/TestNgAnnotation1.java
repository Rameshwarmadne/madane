package TestNGAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotation1 {

	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("TestNGdemo class method",true);
	}
	@BeforeMethod
	public void Beforem()
	{
		Reporter.log("before method",true);
	}
	@Test
	public void test()
	{
		Reporter.log("Test",true);
	}
	@Test
	public void test1()
	{
		Reporter.log("Test case1",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("Test case1",true);
	}
	@AfterMethod
	public void Aftermethod()
	{
		Reporter.log("After method",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close Broser",true);
	}
	
	

}
