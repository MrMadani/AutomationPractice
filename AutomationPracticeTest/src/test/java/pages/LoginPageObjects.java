package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	WebDriver driver = null;
	
	By email_field = By.xpath("//input[@id='email_create']");
	By submit_btn = By.xpath("//button[@id='SubmitCreate']");
	
	public LoginPageObjects(WebDriver driver) {
		this.driver= driver;
		
	}
	
		
		public void setemailfield(String text) {
			driver.findElement(email_field).sendKeys(text);
		}
		public void click_submit_btn(){
			driver.findElement(submit_btn).click();
		}


	
}
