package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyText {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://twitter.com/i/flow/login");

		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='css-901oao css-bfa6kz r-37j5jr r-1inkyih r-16dba41 r-135wba7 r-bcqeeo r-1pn2ns4 r-95jzfe r-13f91hp r-lrvibr r-qvutc0']")).sendKeys("7083493578");
		
		
	}

}
