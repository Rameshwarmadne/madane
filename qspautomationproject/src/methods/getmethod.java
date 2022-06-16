package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethod {
public static void main(String[] args) {


	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https;//https://support.google.com/chrome/");
	             
			String	titleOfLoginPage=d.getTitle();
			System.out.println(titleOfLoginPage);
		String	CurrentUrl=d.getCurrentUrl();
		System.out.println(CurrentUrl);
		
}
	

}

