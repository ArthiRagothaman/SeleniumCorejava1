package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		
		Thread.sleep(2000);
		//Mouse hover
		WebElement element = driver.findElement(By.xpath("//span[text()='WOMEN']"));
		Actions ob= new Actions(driver);
		Thread.sleep(1000);
		ob.moveToElement(element).perform();
		
	}

}
