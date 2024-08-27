package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSetAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
		//Instead of click using keys
		src.sendKeys("ear buds",Keys.ENTER);
		//Getting the whole price using List
		List<WebElement> totalEarBudPrice = driver.findElements(By.className("a-price-whole"));
		int totalSize = totalEarBudPrice.size();
		System.out.println(totalSize);
		//empty list
		List<Integer> price = new ArrayList<Integer>();
		for(WebElement p: totalEarBudPrice) {
			String text = p.getText();
			System.out.println(text);
			//checking if text is null or empty
			if(!text.isEmpty()) {
			String replaceAll = text.replaceAll(",", "");
			System.out.println(replaceAll);
			//Converting the string into integer value
			int pareseInt = Integer.parseInt(replaceAll);
			System.out.println(pareseInt);
			price.add(pareseInt);	
		}
		}	
		// List into set to remove duplicate values
		Set<Integer> value = new TreeSet<Integer>(price);
		System.out.println(value);
		int getSize = value.size();
		System.out.println(getSize);
		
		if(totalSize!=getSize) {
			System.out.println("Duplicate Values");
		}
		else {
			System.out.println("No Duplicate Values");
		}
	}
}
