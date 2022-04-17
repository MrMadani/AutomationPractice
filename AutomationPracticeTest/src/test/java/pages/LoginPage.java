package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class LoginPage {
private static WebElement element = null;
	
	
	public static WebElement emailCreatefield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='email_create']"));
		    return element;
			
	}

	public static WebElement submit_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		return element;
	}
	public static WebElement emailLoginfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='email']"));
		    return element;
			
	}
	public static WebElement passwordfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='passwd']"));
		    return element;
			
	}
	public static WebElement submit_Loginbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		return element;
	}
	
}
