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
	public By projectEnggButton = By.xpath("(//span[text()='PRODUCT ENGINEERING']/parent::a)[2]");
	public By coInventionButton = By.xpath("(//span[text()='CO-INNOVATION']/parent::a)[2]");
	public By incubation  = By.xpath("(//span[text()='INCUBATION']/parent::a)[2]");
	public By magicHealthVideo = By.xpath("//div[@data-src='https://www.youtube.com/embed/bt7-5-801jg?autoplay=1&controls=1&start=0&end=0&modestbranding=0&wmode=transparent&enablejsapi=1&loop=0&rel=0&mute=0']");
}