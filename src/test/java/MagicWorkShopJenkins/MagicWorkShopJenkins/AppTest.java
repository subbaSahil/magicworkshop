package MagicWorkShopJenkins.MagicWorkShopJenkins;

import org.testng.annotations.Test;

import Helper.BaseTest;

public class AppTest extends BaseTest{
	private App app;
	
	@Test(priority = 1)
	public void contactUsButton() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality_TC_01_05();
	}
	@Test(priority = 2)
	public void contactUsFormSubmission() throws InterruptedException {
		app = new App(driver,wait);
		app.contactUsFormSubmission_06("sahil@sahil.com", "sahil", "subba", "subject", "textarea notes");;
	}
	@Test(priority = 3)
	public void projectEnggButtonFunctionality() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality_TC_01_05();
	}
	@Test(priority = 4)
	public void coInventionButtonFunctionality() {
		app = new App(driver,wait);
		app.contactUsButtonFunctionality_TC_01_05();
	}
	@Test(priority = 5)
	public void magicDriverVideo_07() {
		app = new App(driver,wait);
		app.magicDriverVideo_07();
	}
	@Test(priority = 6)
	public void magicEdxVideo_08() {
		app = new App(driver,wait);
		app.magicEdxVideo_08();
	}
	@Test(priority = 7)
	public void magicHealthVideo_10() {
		app = new App(driver,wait);
		app.magicHealthVideo_10();
	}
	@Test(priority = 8)
	public void magicAiVideo_11() {
		app = new App(driver,wait);
		app.magicAiVideo_11();
	}
	@Test(priority = 9)
	public void navigateToMagicHealthWebsite_12() {
		app = new App(driver,wait);
		app.navigateToMagicHealthWebsite_12();
	}
	@Test(priority = 10)
	public void navigateToMagicAiWebsite_13() {
		app = new App(driver,wait);
		app.navigateToMagicAiWebsite_13();
	}
	@Test(priority = 11)
	public void magicGovernVideo_15() {
		app = new App(driver,wait);
		app.magicGovernVideo_15();
	}
	
}
