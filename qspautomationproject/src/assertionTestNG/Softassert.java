
package assertionTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void s1()
	{
		String s1="ram";
		String s2="sham";
		SoftAssert soft =new SoftAssert();
		soft.assertEquals(s1, s2,"both result are not same");
		Reporter.log("1 st verification is completed",true);
		
		Boolean b1=true;
		soft.assertTrue(b1,"2nd result is fail ");
		Reporter.log("2nd verification is completed",true);
		soft.assertAll();
		
	}
}
