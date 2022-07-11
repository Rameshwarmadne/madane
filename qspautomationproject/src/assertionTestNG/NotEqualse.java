package assertionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

class NotEqualse {
	@Test
	public void notequals()
	{
		String ActualResult= "hello";
		String ExpectedResult= "hell";
	 	Assert.assertNotEquals(ActualResult,ExpectedResult);
	}

}
