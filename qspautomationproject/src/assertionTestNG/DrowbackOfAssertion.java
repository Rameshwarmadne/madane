package assertionTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class DrowbackOfAssertion {
	// disadvantages of assert class
	@Test
	public void tc3()
	{
		String actual="hello";
		String Expected="hell";
        Assert.assertEquals(actual, Expected,"BOTH ESULT ARE SAME");
        Reporter.log("Verification of 1st is completed",true);
        
        Boolean act=false;
        Assert.assertTrue(act);
        Reporter.log("2nd verification is completed",true);
        
	}

}
