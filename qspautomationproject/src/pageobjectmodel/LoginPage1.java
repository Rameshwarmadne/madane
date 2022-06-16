package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	


	
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(xpath="//img[contains(@src,'timer')])") private WebElement logo;
	
	@FindBy(id="licenseLink") private WebElement link;
	@FindBy(id="keepLoggedInCheckBox") private WebElement KeeploggedInCheckBox;

	
	//Initialization

	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization

	public void getUsn() {
		usn.sendKeys("admin");
	}
	public void getPass() {
		pass.sendKeys("manager");
	}
	public void getLoginBtn() {
		loginBtn.click();
 


	
	
	
	
	

	
	
	
	
	

	

	}

}
