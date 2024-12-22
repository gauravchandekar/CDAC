package fi.seleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver d= new ChromeDriver();
		d.get("https://youtube.com");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		//d.close();
		Thread.sleep(1780);
		
		WebElement we= d.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/div[1]/form/input"));
			
		we.click();
		
		WebElement search = d.findElement(By.name("search_query"));
		search.sendKeys("Selenium Tutorials");
		
		Thread.sleep(2000);
		
		WebElement btn = d.findElement(By.xpath("/html/body/ytd-app/div[1]/div[2]/ytd-masthead/div[4]/div[2]/yt-searchbox/button/yt-icon/span/div"));
		btn.click();
		
		Thread.sleep(5000);
		
		WebElement ee=d.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-mini-guide-renderer/div/ytd-mini-guide-entry-renderer[2]/a"));
		Thread.sleep(1000);
		ee.click();
		d.close();
		//WebElement de=d.findElement(By.id("extensionsTabSecondary"));
//		Thread.sleep(2000);
//		de.click();
//		
//		d.manage().window().maximize();
//		Thread.sleep(5000);
//		d.close();
//		
	}

}