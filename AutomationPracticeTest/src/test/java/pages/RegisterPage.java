package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	private static WebElement element = null;
	static WebDriver driver = null;
	
	public static WebElement title_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		    return element;
			
	}
	public static WebElement first_name_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		    return element;
			
	}
	public static WebElement last_name_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		    return element;
			
	}
	public static WebElement email_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='email']"));
		    return element;
			
	}
	public static WebElement password_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='passwd']"));
		    return element;
			
	}
	//need to complete it drop down value is needed
	
	public static WebElement date_of_birth(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='days']"));
		 new Select(element).selectByValue("7");
		return element;
			
	}
	public static WebElement month_of_birth(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='months']"));
		 new Select(element).selectByValue("7");
		return element;
			
	}
	public static WebElement year_of_birth(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='years']"));
		 new Select(element).selectByValue("1994");
		return element;
			
	}
	public static WebElement newsletter_checkbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='optin']"));
		    return element;
			
	}
	
	public static WebElement offercheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='optin']"));
		    return element;
			
	}
	public static WebElement company_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='company']"));
		    return element;
			
	}
	
	public static WebElement address_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='address1']"));
		    return element;
			
	}
	public static WebElement address2_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='address2']"));
		    return element;
			
	}
	public static WebElement city_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='city']"));
		    return element;
			
	}
	//need to complete it
	public static WebElement state_dropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='id_state']"));
		new Select(element).selectByValue("7");    
		return element;
			
	}
	//need to complete it
	public static WebElement country_dropdown(WebDriver driver) {
			element = driver.findElement(By.xpath("//select[@id='id_country']"));
			new Select(element).selectByValue("21");     
			return element;
				
		}
	public static WebElement zipcode_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='postcode']"));
		    return element;
			
	}
	public static WebElement addinfo_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='other']"));
		    return element;
			
	}
	public static WebElement homephone_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='phone']"));
		    return element;
			
	}
	public static WebElement phone_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		    return element;
			
	}
	public static WebElement alias_add_textfield(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='alias']"));
		    return element;
			
	}
	
	public static WebElement register_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		    return element;
			
	}
	
	
	public static WebElement signout_btn(WebDriver driver) {
		element = driver.findElement(By.linkText("Sign out"));
		    return element;
			
	}
	public void checkTextsElements(WebDriver driver) {
	        assertEquals("Authentication", driver.findElement(By.className("navigation_page")).getText());
	        WebElement formAccoutCreation = driver.findElement(By.id("noSlide"));
	        assertEquals("YOUR PERSONAL INFORMATION",formAccoutCreation.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/h3N")).getText());
	        assertEquals("Title",formAccoutCreation.findElement(By.className("clearfix")).getText());
	    }

	
	
	
}
