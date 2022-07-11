package assertionTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NotNull1 {
	@Test
	public void main()
	{
		String actual ="abc";
		Assert.assertNull(actual,"Actual RESULT IS NULL");
		//String Actual=null;
		
		//Assert.assertNotNull(Actual,"RESULT IS NOT NULL");
	
	}

}
