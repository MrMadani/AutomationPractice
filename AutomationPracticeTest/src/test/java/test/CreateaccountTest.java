package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.javafaker.Faker;

import pages.AddItem;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.*;
import test.*;

public class CreateaccountTest {
	public static WebDriver driver = null;
	public static Faker faker =null;
	
	
	public static void CreateAccount() throws InterruptedException {
		driver = new FirefoxDriver();
		  faker = new Faker();
		//goes to home page
		driver.get("http://automationpractice.com/index.php");
		
		
		//perform click function
	      HomePage.signin_btn(driver).click();
	      
	      Thread.sleep(5000);
	     
	    //After getting to the login page
//	      values for the input field
//			String name = faker.name().fullName();
			String firstName = faker.name().firstName();
			String lastName = faker.name().lastName();
			String password = "123456";
			String company = faker.company().name();
			String address = (faker.address().buildingNumber())+faker.address().streetAddress();
			String address2 = faker.address().streetAddress();
			String city = faker.address().cityName();
//			String zip = 0000;
			String addinfo = faker.address().latitude();
			String h_phone = faker.phoneNumber().cellPhone();
			String m_phone = faker.phoneNumber().cellPhone();
			String a_phone = faker.phoneNumber().cellPhone();
			String alis_add = faker.address().buildingNumber();
			String email = firstName+"007@gmail.com";
			//inputing value in email field to create account 
	    LoginPage.emailCreatefield(driver).sendKeys(email);
	      	//click submit button to create account
	    LoginPage.submit_btn(driver).click();
	    Thread.sleep(300);
	    
	      	//Performing Register function
	    //entering values
	    //personal information section
	    Thread.sleep(3000);
	    RegisterPage.title_textfield(driver).click();
	    Thread.sleep(3000);
	    RegisterPage.first_name_textfield(driver).sendKeys(firstName);
	    Thread.sleep(3000);
	    RegisterPage.last_name_textfield(driver).sendKeys(lastName);
	    Thread.sleep(3000);
//	    RegisterPage.email_textfield(driver).sendKeys(email);
	    Thread.sleep(3000);
	    RegisterPage.password_textfield(driver).sendKeys(password);
	    RegisterPage.date_of_birth(driver);
	    Thread.sleep(2000);
	    RegisterPage.month_of_birth(driver);
	   
	    RegisterPage.year_of_birth(driver);
	    Thread.sleep(2000);
	    RegisterPage.newsletter_checkbox(driver).click();
	    Thread.sleep(2000);
	    //address section
	    RegisterPage.company_textfield(driver).sendKeys(company);
	    Thread.sleep(2000);
	    RegisterPage.address_textfield(driver).sendKeys(address);
//	    Thread.sleep(2000);
	    RegisterPage.address2_textfield(driver).sendKeys(address2);
	    Thread.sleep(2000);
	    RegisterPage.city_textfield(driver).sendKeys(city);
	    RegisterPage.state_dropdown(driver);
	    RegisterPage.zipcode_textfield(driver).sendKeys("01234");
	    RegisterPage.country_dropdown(driver);
//	    Thread.sleep(2000);
	    RegisterPage.addinfo_textfield(driver).sendKeys(a_phone);
	    Thread.sleep(2000);
	    RegisterPage.homephone_textfield(driver).sendKeys(h_phone);
//	    Thread.sleep(2000);
	    RegisterPage.phone_textfield(driver).sendKeys(m_phone);
	    RegisterPage.alias_add_textfield(driver).sendKeys(alis_add);
	 
	    System.out.println("Clicking on the registration btn");
	    //click register button
	    
	    RegisterPage.register_btn(driver).click();
	    Thread.sleep(2000);
	    //Click Sign out
	    RegisterPage.signout_btn(driver).click();
	    Thread.sleep(2000);
	    //Login to new account
	    LoginPage.emailLoginfield(driver).sendKeys(email);
	    Thread.sleep(2000);
	    LoginPage.passwordfield(driver).sendKeys(password);
	    Thread.sleep(2000);
	    LoginPage.submit_Loginbtn(driver).click();
	    Thread.sleep(2000);
	    //Add Item to cart
	    AddItem.DressClick(driver).click();
	    Thread.sleep(2000);
	    AddItem.CasualDressClick(driver).click();
	    Thread.sleep(2000);
	    AddItem.ClickCacualDress(driver).click();
	    Thread.sleep(2000);
	    AddItem.AddtoCartbtn(driver).click();
	    System.out.println("Clicking on the continue shopping btn");
	    Thread.sleep(2000);
	    
	    AddItem.ContinueShoppingbtn(driver).click();
	    Thread.sleep(2000);
	    AddItem.Tshirtclick(driver).click();
	    Thread.sleep(2000);
	    AddItem.colorclick(driver).click();
	    Thread.sleep(2000);
	    AddItem.ItemTshirtclick(driver).click();
	    Thread.sleep(2000);
	    AddItem.AddtoCartbtn2(driver).click();
	    System.out.println("Clicking on the Checkout btn");
	    Thread.sleep(2000);
	    
	    AddItem.Checkoutbtn(driver).click();
	    Thread.sleep(2000);
	    AddItem.Checkoutbtn2(driver).click();
	    Thread.sleep(2000);
	    AddItem.Checkoutbtn3(driver).click();
	    Thread.sleep(2000);
	    AddItem.TermCheckbox(driver).click();
	    Thread.sleep(2000);
	    AddItem.Checkoutbtn4(driver).click();
	    System.out.println("Clicking on the paychek btn");
	    Thread.sleep(2000);
	    
	    AddItem.PayCheckbtn(driver).click();
	    Thread.sleep(2000);
	    AddItem.Comfirmbtn(driver).click();
	    RegisterPage.signout_btn(driver).click();
	    
//	    
	    
//		driver.close();
		
	}

}
