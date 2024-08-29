package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowhandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://leafground.com/window.xhtml");
		   driver.findElement(By.xpath("//span[text()='Open']")).click();
		   //getWindowHandle -1 address
		   Thread.sleep(2000);
		   String windowHandle = driver.getWindowHandle();
		   System.out.println(windowHandle);
		   System.out.println(driver.getTitle());
		   //To Handle multiple windows
		   Set<String> allwindow = driver.getWindowHandles();
		   System.out.println(allwindow);
		   //switch between two windows get()
		   //convert set into list
           
		   List<String> childWindow = new ArrayList<String>(allwindow);
		   //switch to child window
		   driver.switchTo().window(childWindow.get(1));
		   //print the title of child window
		   String title = driver.getTitle();
		   System.out.println("Child Window name:"+title);
		   
		   //conform the status in child window page 
		   driver.findElement(By.id("email")).sendKeys("xxxx@gmail.com");
		   //close the current child window
		   driver.close();
		  //again switch from child to parent window
		   driver.switchTo().window(childWindow.get(0));
		   
		   driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		   //driver.quit();
		   // how many child browser are opened 
		   Set<String> anotherChild = driver.getWindowHandles();
		   System.out.println(anotherChild);
	}

}
