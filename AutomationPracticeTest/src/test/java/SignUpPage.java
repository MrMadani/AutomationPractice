import java.nio.charset.Charset;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpPage {
	
	public static void main(String[] args) throws InterruptedException {
		CreateAccount();
	}
	public static void CreateAccount() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//goes to home page
		driver.get("http://automationpractice.com/index.php");
		
		//perform click funciton
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		//input for create account
		Faker faker = new Faker();

		String name = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		String streetAddress = faker.address().streetAddress();

		WebElement textfield =driver.findElement(By.xpath("//input[@id='email_create']"));
		textfield.sendKeys(firstName+"@gmail.com");
		System.out.println(firstName);
		
		//click submit
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
