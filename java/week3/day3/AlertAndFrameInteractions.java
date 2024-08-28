package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndFrameInteractions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		   
		   //switch to frame
		   driver.switchTo().frame("iframeResult");
		   Thread.sleep(2000);
		   WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
		   Thread.sleep(3000);
		   //Javascript click method 
		   driver.executeScript("arguments[0].click();",element);
		   Thread.sleep(2000);
		   //Switch to alert popup message
		   Alert alert = driver.switchTo().alert();  
		   alert.getText();
		   alert.accept();
		   Thread.sleep(2000);
		   //text
		   String text = driver.findElement(By.id("demo")).getText();
		   System.out.println(text);
		   //switch to main page 
		   driver.switchTo().defaultContent();
		   driver.close();		      	   
           	}
}
