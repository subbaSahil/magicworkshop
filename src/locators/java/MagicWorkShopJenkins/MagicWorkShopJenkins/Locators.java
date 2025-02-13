package MagicWorkShopJenkins.MagicWorkShopJenkins;

import org.openqa.selenium.By;

public class Locators {
	public By ContactUsButton = By.xpath("(//span[text()='CONTACT US']/parent::a)[2]");
	public By emailElement = By.xpath("//input[@data-brz-type='Email']");
	public By firstNameElement = By.xpath("//input[@data-brz-label=\"First Name\"]");
	public By lastNameElement = By.xpath("//input[@data-brz-label=\"Last Name\"]");
	public By subjectElement = By.xpath("//input[@data-brz-label=\"Subject\"]");
	public By notesElement = By.xpath("//textarea[@data-brz-label=\"How can we help you?\"]");
	public By submitButtonElement = By.xpath("//span[text()='Submit Message']/parent::button");
}