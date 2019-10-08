package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class contactUs {

  
      @FindBy(id="id_contact")
      public static WebElement subject_heading;
	   @FindBy(name= "from")
	   public static WebElement email;
	   @FindBy(id="id_order")
	   public static WebElement order_reference;
	   @FindBy(id="message")
	   public static WebElement message;
	   @FindBy(id="submitMessage")
	   public static WebElement submit;
	   @FindBy(className="alert-danger")
	   public static WebElement error_message;
	   @FindBy(className="alert-success")
	   public static WebElement success_message;
	   
	   public void contractForm() {
		   Select s = new Select(subject_heading);
	      s.selectByVisibleText("Customer service");
	    email.sendKeys("abc@gmail.com");
       order_reference.sendKeys("12");
      message.sendKeys("automation testing");
       submit.click();
	}
	 
	public String verifyMsg() {
		// TODO Auto-generated method stub
		 return success_message.getText();
	}
}

