package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get("https://www.snapdeal.com/");
		
		//MouseOver
		/*
				Thread.sleep(1000);
				WebElement mo = driver.findElement(By.className("catText"));
				
				Actions obj = new Actions(driver);
				obj.moveToElement(mo).perform();
				
				Thread.sleep(1000);
				WebElement tar = driver.findElement(By.className("linkTest"));
				tar.click();	
				*/
		
		
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("-----disable notification-----");
		ChromeDriver driver = new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//-Load the URL https://www.amazon.in
		driver.get("https://snapdeal.com/");
		
		Thread.sleep(1000);
		//Scroll down to the "Conditions of Use and Sale" section at the bottom of the page using Actions class.
		WebElement element = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Thread.sleep(1000);
		 
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
		
		//-Get the text of "Conditions of Use and Sale" and print it in the console.
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.xpath("//span[text()='Home Audio Systems']"));
		Thread.sleep(2000);
		element2.click();
		

	}

}
