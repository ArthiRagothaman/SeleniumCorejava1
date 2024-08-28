package week3.day3;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions cp = new ChromeOptions();
		cp.addArguments("--disbale-notifications");
		  ChromeDriver driver = new ChromeDriver(cp);
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   

	}

}
