package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom class....> Regular clas it dosent contain main method

public class lOGINpAGE {
	//Deceleration
	@FindBy(xpath="//input[@name='username']") private WebElement usn;
	@FindBy(xpath="//input[@type='password']") private WebElement pas;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement login;
	//initialization
	lOGINpAGE(WebDriver driver)
	{
	PageFactory.initElements(driver,this); 
	}
	//usage
	public void EnterUn()
	{
		usn.sendKeys("admin");
		
	}
	public void EnterPass()
	{
		pas.sendKeys("manager");
	}
	public void ClickToLogin()
	{
		login.click();
	}
	
	
	
	
	

}
