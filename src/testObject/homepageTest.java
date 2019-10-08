package testObject;

import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.contactUs;


public class homepageTest extends abstractTest {

	@Test(priority=1)
	public void Contact()   {
     Homepage.clickContact();
     }
	@Test(priority=2)
	public void fillcontact() {
		contactus.contractForm();
	}
	@Test(priority=3)
	public void successmsg() {
		contactus.verifyMsg();
		Assert.assertEquals(contactus.verifyMsg(), "Your message has been successfully sent to our team."  ,  "Verify msg");
	}
}
