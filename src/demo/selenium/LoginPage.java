package demo.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//*[@id='textfield-1018-inputEl']")
	public WebElement userName;

	@FindBy(xpath = "//*[@id='textfield-1019-inputEl']")
	public WebElement passWord;

	@FindBy(xpath = "//*[@id='button-1020-btnIconEl']")
	public WebElement loginBtn;

	public String baseUrl = "http://10.13.6.55:8013/kiwi/";
	public WebDriver driver;

	public LoginPage() {

		System.out.println("test constractor method");

		driver = new FirefoxDriver();
		PageFactory.initElements(driver, this);

	}

	public void load() {

		driver.get(baseUrl);

	}

	public void quit() {

		driver.quit();
	}

	public void login() {
		
		System.out.println(userName.getText());

		userName.sendKeys("u1@testb.dom");
		passWord.sendKeys("p");
		loginBtn.click();
	}

	public WebDriver getDriver() {

		return driver;

	}

}
