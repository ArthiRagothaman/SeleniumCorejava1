package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowhandlingAssignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disbale-notifications");
		cp.addArguments("--disable-search-engine-choice-screen");
		ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.get("https://www.irctc.co.in/");
		   driver.findElement(By.linkText("FLIGHTS")).click();
		 //getWindowHandle -1 address
		   Thread.sleep(2000);
		   String windowHandle = driver.getWindowHandle();
		   System.out.println(windowHandle);
		   System.out.println(driver.getTitle());
		 //To Handle multiple windows
		   Set<String> allwindow = driver.getWindowHandles();
		   System.out.println(allwindow);
		   //convert set into list
    
		   List<String> childWindow = new ArrayList<String>(allwindow);
		   //switch to child window
		   driver.switchTo().window(childWindow.get(1));
		   //print the title of child window
		   String title = driver.getTitle();
		   System.out.println("Child Window name:"+title);
		   driver.close();
		 //again switch from child to parent window
		   driver.switchTo().window(childWindow.get(0));
		   System.out.println("Parent window: "+driver.getTitle());
		   

	}

}
