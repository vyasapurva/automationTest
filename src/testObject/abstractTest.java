package testObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.contactUs;
import pageObject.homepage;

public class abstractTest {
	WebDriver driver;
	homepage Homepage;
	contactUs contactus;
	@BeforeTest
   public void envirmentSet() {
   System.setProperty("webdriver.chrome.driver", "E:\\Ethentec_java\\selenium setup\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("http://automationpractice.com/");
   
               Homepage = new homepage();
                contactus = new contactUs();
                PageFactory.initElements(driver, Homepage);
    	        PageFactory.initElements(driver, contactus);

	}
	 
	
	
}


