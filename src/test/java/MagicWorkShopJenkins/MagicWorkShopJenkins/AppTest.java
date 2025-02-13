package MagicWorkShopJenkins.MagicWorkShopJenkins;

import org.testng.annotations.Test;

public class AppTest extends BaseTest{
	private App app;
	
	@Test(priority = 1)
	public void contactUsButton() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality();
	}
	@Test(priority = 2)
	public void contactUsFormSubmission() throws InterruptedException {
		app = new App(driver,wait);
		app.contactUsFormSubmission("sahil@sahil.com", "sahil", "subba", "subject", "textarea notes");;
	}
}
