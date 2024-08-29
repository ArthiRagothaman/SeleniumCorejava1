package week3.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomateAlertandFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disbale-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//switch to frame
		  driver.switchTo().frame("iframeResult");
		  Thread.sleep(3000);
		  WebElement element = driver.findElement(By.xpath("//button[text()='Try it']"));
		 
		  driver.executeScript("arguments[0].click();",element);
		  Thread.sleep(3000);
		  //switch to alert
		  Alert alert = driver.switchTo().alert();
		  alert.getText();
		  alert.accept();
		  Thread.sleep(3000);
		  String text = driver.findElement(By.id("demo")).getText();
		  System.out.println(text);
		  driver.close();

	}

}
