package MagicWorkShopJenkins.MagicWorkShopJenkins;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Interactions;
import Locators.Locators;
public class App {
	private WebDriver driver;
	private WebDriverWait wait;
	private Locators locators;
	private Interactions interactrions;
	public App(WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
		 this.locators= new Locators();
		this.interactrions = new Interactions(driver);
	}
	public void contactUsButtonFunctionality_TC_01_05() {
		WebElement contactUsButton = this.wait.until(ExpectedConditions.elementToBeClickable(this.locators.ContactUsButton));
		contactUsButton.click();
	}
	public void contactUsFormSubmission_06(String email, String firstname, String lastname, String subject, String notes) throws InterruptedException {
		
		contactUsButtonFunctionality_TC_01_05();
		
		Thread.sleep(3000);
		WebElement emailInput = this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.locators.emailElement));
		emailInput.sendKeys(email);
		
		WebElement firstNameInput = this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.locators.firstNameElement));
		firstNameInput.sendKeys(firstname);
		
		WebElement lastNameInput = this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.locators.lastNameElement));
		lastNameInput.sendKeys(lastname);
		
		WebElement subjectInput = this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.locators.subjectElement));
		subjectInput.sendKeys(subject);
		
		WebElement notesInput = this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.locators.notesElement));
		notesInput.sendKeys(notes);
		
		WebElement submitButton = this.wait.until(ExpectedConditions.elementToBeClickable(this.locators.submitButtonElement));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);

	    // Use JavaScript to click the button as a last resort
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
	}
	public void projectEnggButtonFunctionality_02() {
		WebElement contactUsButton = this.wait.until(ExpectedConditions.elementToBeClickable(this.locators.projectEnggButton));
		contactUsButton.click();
	}
	public void coInventionButtonFunctionality_04() {
		WebElement contactUsButton = this.wait.until(ExpectedConditions.elementToBeClickable(this.locators.coInventionButton));
		contactUsButton.click();
	}
	public void incubationButtonFunctionality_03() {
		WebElement contactUsButton = this.wait.until(ExpectedConditions.elementToBeClickable(this.locators.incubation));
		contactUsButton.click();
	}
	
	public void magicDriverVideo_07() {
		this.interactrions.click(this.locators.magicDriverVideo);
	}
	public void magicEdxVideo_08() {
		this.interactrions.click(this.locators.magicEdxCVideo);
	}
	public void magicHealthVideo_10() {
		this.interactrions.click(this.locators.magicHealthVideo);
	}
	public void magicAiVideo_11() {
		this.interactrions.click(this.locators.magicAiVideo);
	}
	public void navigateToMagicHealthWebsite_12() {
		this.interactrions.click(this.locators.magicHealtWebsite);
	}
	public void navigateToMagicAiWebsite_13() {
		this.interactrions.click(this.locators.magicAiWebiste);
	}
	public void magicGovernVideo_15() {
		this.interactrions.click(this.locators.magicGovernce);
	}
}
