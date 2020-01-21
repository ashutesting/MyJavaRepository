package Packages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Documents/workspace/Test_Cases_Youtube/Driver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		WebElement signin= driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-formatted-string[@id='text']"));
		signin.click();
		WebElement username= driver.findElement(By.xpath("//input[@id='identifierId']"));
		username.sendKeys("sonisivangi725@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("Shivangi123");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		WebElement trending= driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Trending')]"));
		trending.click();
		List<WebElement> total= driver.findElements(By.id("video-title"));
		System.out.println(total.size());
		total.get(2).click();
		driver.findElement(By.xpath("//div[@id='info']//ytd-toggle-button-renderer[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")).click();
		
		
		System.out.println("Running Successfully");
	}

}
