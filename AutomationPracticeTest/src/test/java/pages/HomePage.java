package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	
	public static WebElement signin_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@class='login']"));
		    return element;
			
	}

}
