package aassignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.language.Selection;
import graphql.language.SelectionSet;

public class Ebay {
	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("apple watches");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	Thread.sleep(3000);
         driver.findElement(By.xpath("//span[@class='srp-format-tabs-h2'][1]"));
         //driver.findElement(By.xpath("(//*[@id=\"x-refine__group__4\"]/ul/li[1]/div/a/div/div/span[1])"));
          ArrayList<WebElement> lis = (ArrayList<WebElement>) driver.findElements(By.xpath("//h3[contains(@class,'s-item__title')]"));
           
         for(int i=0;i<=lis.size();i++)
         {
        	 if (i==10)
        	 {
        	 WebElement pl = lis.get(10);
        	 String sr=pl.getText();
        	 System.out.println(sr);
        	 }
        	 
         }
	}

}