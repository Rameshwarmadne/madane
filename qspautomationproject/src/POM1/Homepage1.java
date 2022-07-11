package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class....> regular class dosen't contain main method
public class Homepage1 {
	@FindBy(xpath="//a[@href='/administration/userlist.do']") private WebElement user;
	@FindBy(xpath="//td[text()='Customer']") private WebElement custm;
	
	
	Homepage1(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	public void newUser()
	{
		user.click();
		
	}
	public void customer()
	{
		custm.click();
	}

	
	
	
}
