package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/select.xhtml");
	    
	    WebElement menu = driver.findElement(By.className("ui-selectonemenu"));
	    //webElement- reuse the data again
	    //returnType findElement- WebElement
	    
	    //object Select
	    Select obj= new Select(menu);
	    //SelectByIndex
	    obj.selectByIndex(1);
	    obj.selectByVisibleText("Puppeteer");
	    
	    //non-select drop down- Sometimes wont be drop down enable that time will use this method
	    
	    driver.findElement(By.id("j_idt87:country_label")).click();
	    driver.findElement(By.id("j_idt87:country_3")).click();
	  
	    

	}

}
