package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomaticAlert {

	public static void main(String[] args) throws InterruptedException {
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://leafground.com/alert.xhtml");
		   driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		   Thread.sleep(1000);
		   //Alert
		   Alert alert = driver.switchTo().alert();
		   
		   alert.sendKeys("Arthi");
		   String text = alert.getText();
		   System.out.println(text);
		   alert.accept();
		   String text2 = driver.findElement(By.id("confirm_result")).getText();
		  System.out.println(text2);
		   Thread.sleep(2000);

	}

}
