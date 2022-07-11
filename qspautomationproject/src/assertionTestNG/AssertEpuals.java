package assertionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEpuals {
	@Test
	public void tc1()
	{
		String ActualResult= "hello";
	String ExpectedResult= "hell";
 	Assert.assertNotEquals(ActualResult,ExpectedResult);
		//String ActualResult= "hello";
		//String ExpectedResult= "hello";
     	//Assert.assertEquals(ActualResult,ExpectedResult,"Both result are not same");
	}

}
