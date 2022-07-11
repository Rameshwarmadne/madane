package assertionTestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class AssertTrue1 {
	@Test
	public void tc3()
	{
		Boolean actualresult=true;
		Assert.assertFalse(actualresult);
		//Boolean act= false;
	//	Assert.assertTrue(act);
	}

}
