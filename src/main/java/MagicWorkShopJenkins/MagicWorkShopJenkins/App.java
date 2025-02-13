package MagicWorkShopJenkins.MagicWorkShopJenkins;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import MagicWorkShopJenkins.MagicWorkShopJenkins.Locators;
public class App {
	private WebDriver driver;
	private WebDriverWait wait;
	private Locators locators;
	public App(WebDriver driver, WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
		 this.locators= new Locators();
	}
	public void contactUsButtonFunctionality() {
		WebElement contactUsButton = this.wait.until(ExpectedConditions.elementToBeClickable(this.locators.ContactUsButton));
		contactUsButton.click();
	}
	public void contactUsFormSubmission(String email, String firstname, String lastname, String subject, String notes) {
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
}
