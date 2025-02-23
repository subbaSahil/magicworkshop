package Locators;

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
	public By magicDriverVideo = By.xpath(
			"//div[@data-src='https://www.youtube.com/embed/o_krlurLeTk?autoplay=1&controls=1&start=0&end=0&modestbranding=0&wmode=transparent&enablejsapi=1&loop=0&rel=0&mute=0']/following-sibling::div/child::div");
			
	public By magicEdxCVideo = By.xpath(
			"//div[@data-src='https://www.youtube.com/embed/D5ABfe1SEo0?autoplay=1&controls=1&start=0&end=0&modestbranding=0&wmode=transparent&enablejsapi=1&loop=0&rel=0&mute=0']/following-sibling::div/child::div");
			
	public By magicGovernce = By.xpath("//div[@data-src=\"https://www.youtube.com/embed/7LmiIfX0Css?autoplay=1&controls=1&start=0&end=0&modestbranding=0&wmode=transparent&enablejsapi=1&loop=0&rel=0&mute=0\"]/following-sibling::div/child::div");
	public By magicAiVideo = By.xpath("//div[@data-src=\"https://www.youtube.com/embed/CDlKJHD8A-E?autoplay=1&controls=1&start=0&end=0&modestbranding=0&wmode=transparent&enablejsapi=1&loop=0&rel=0&mute=0\"]/following-sibling::div/child::div");
	public By magicHealthVideo = By.xpath("//div[@data-src=\"https://www.youtube.com/embed/bt7-5-801jg?autoplay=1&controls=1&start=0&end=0&modestbranding=0&wmode=transparent&enablejsapi=1&loop=0&rel=0&mute=0\"]/following-sibling::div/child::div");
	public By magicHealtWebsite = By.xpath("//a[@href=\"https://magichealth.io/\"]");
	public By magicAiWebiste = By.xpath("//a[@href=\"https://www.mayagic.ai/\"]");
	public By magicEdxWebsite = By.xpath("//a[@href=\"https://www.magicedx.ai/\"]");
	public By magicDriverWebsite = By.xpath("//a[@href=\"https://www.magicdrive.ai/\"]");
}