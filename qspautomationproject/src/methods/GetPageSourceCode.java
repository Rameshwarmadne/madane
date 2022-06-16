package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
	 d.get("https://opensource-demo.orangehrmlive.com/");
	 String sourceCodeOfTheWebPage=d.getPageSource();
	System.out.println(sourceCodeOfTheWebPage);
	
	}

}
