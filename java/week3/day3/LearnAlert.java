package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
	
   ChromeDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   driver.get("https://leafground.com/alert.xhtml");
   driver.findElement(By.xpath("//span[text()='Show']")).click();
   
   //Alert
   Alert alert = driver.switchTo().alert();
   String text = alert.getText();
   System.out.println("Text presented in alert box: " +text);
   Thread.sleep(2000);
   alert.accept();
   Thread.sleep(2000);
   String text2 = driver.findElement(By.id("simple_result")).getText();
   System.out.println(text2);
   Thread.sleep(3000);
   
   //confirmation alert
   driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
   Thread.sleep(1000);
   System.out.println(alert.getText());
   Thread.sleep(2000);
   alert.dismiss();
   String text3 = driver.findElement(By.id("result")).getText();
   System.out.println(text3);
   
   
   //1.Alert is not presented but trying to handle it
   //No AlertPresentException
   //alert.accept();
   //2.Alert is present but not handling the alert
   //UnhandledAlertException
   
	}

}
