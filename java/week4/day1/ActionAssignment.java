package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		//ScrollToElement Action
		
		WebElement sc = driver.findElement(By.linkText("About Us"));
		Thread.sleep(2000);
		Actions ob = new Actions(driver);
		ob.scrollToElement(sc).perform();
		Thread.sleep(1000);
		sc.click();
		

	}

}
