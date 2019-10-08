package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage  {

	
	@FindBy(linkText= "Contact us")
	public static WebElement contact_us;
	
	public void clickContact() {
		contact_us.click();
	}

	
	
	
	
}
