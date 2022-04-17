package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddItem {
private static WebElement element = null;
	
	public static WebElement DressClick(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]"));
		    return element;
			
	}
	public static WebElement CasualDressClick(WebDriver driver) {
		element = driver.findElement(By.linkText("Casual Dresses"));
		return element;
	}
	public static WebElement ClickCacualDress(WebDriver driver) {
		element = driver.findElement(By.linkText("Printed Dress"));
		    return element;
			
	}
	public static WebElement AddtoCartbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button"));
		    return element;
			
	}
	public static WebElement ContinueShoppingbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span"));
		    return element;
			
	}
	public static WebElement Tshirtclick(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a"));
		    return element;
			
	}
	public static WebElement colorclick(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[1]/div[1]/div[1]/form/div/div[2]/ul/li[2]/label/a"));
		    return element;
			
	}
	public static WebElement ItemTshirtclick(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"color_2\"]"));
		return element;
	}
	public static WebElement AddtoCartbtn2(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
		    return element;
		   
	}
	public static WebElement Checkoutbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
		    return element;
			
	}
	public static WebElement Checkoutbtn2(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		    return element;
			
	}
	public static WebElement Checkoutbtn3(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		    return element;
			
	}
	public static WebElement Checkoutbtn4(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
	    return element;
		
}
	
	public static WebElement TermCheckbox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));
		    return element;
			
	}
	
	public static WebElement PayCheckbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
		    return element;
			
	}
	public static WebElement Comfirmbtn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
		    return element;
			
	}
	
}
