package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Deceleration
@FindBy(xpath="//a[@class=\"logout\"]") private WebElement logoutLink;
@FindBy(xpath="//a[text()=\"Create new tasks\"]") private WebElement creatNewTask;
@FindBy(xpath="//a[@class=\"content administration\"]") private WebElement settings;
@FindBy(xpath="//input[@id='SubmitTTButton']") private WebElement saveLiveTime;
@FindBy(xpath="//input[@id='SubmitTTButton']") private WebElement newtask;
@FindBy(xpath="//input[@name='task[0].name']") private WebElement block;





//Initialization

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	
//utilization
public WebElement getLogoutLink() {
	return logoutLink;
}

public WebElement getCreatNewTask() {
	return creatNewTask;
}
public WebElement getSettings() {
	return settings;
	}
public WebElement savelivetime() {
	return saveLiveTime;
}

public WebElement clickLogout()
{
	 logoutLink.click();
	return logoutLink ;
}

public WebElement Newtask()
{
	return newtask;
	
}
public WebElement box()
{
	block.sendKeys("123456789");
	return block;
}

//public void clickSaveLeaveTimeBtn()
//{ 
	//saveLiveTime.click();
//}


}
