package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "//Users//AshishSoni//Documents//workspace//Gold11//chrme driver//chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gold11.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	    WebElement play=  driver.findElement(By.className("btn waves-light letsPlayButton waves-effect waves-light"));		
		play.click();
	}

}
