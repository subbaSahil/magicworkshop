package MagicWorkShopJenkins.MagicWorkShopJenkins;

import org.testng.annotations.Test;

import Helper.BaseTest;

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
	@Test(priority = 3)
	public void projectEnggButtonFunctionality() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality();
	}
	@Test(priority = 4)
	public void coInventionButtonFunctionality() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality();
	}
	@Test(priority = 5)
	public void incubationButtonFunctionality() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality();
	}
	
}
