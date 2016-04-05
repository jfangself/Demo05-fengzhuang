package demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginVerify {

	public WebDriver driver;

	@Test
	public void VerifyLogin() throws InterruptedException {

		LoginPage loginpage = new LoginPage();

		loginpage.load();

		 Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By
//				.xpath("//*[@id='component-1028']")));

		loginpage.login();
		Thread.sleep(5000);

		
		// try {
		//
		// Thread.sleep(5000);
		//
		// } catch (InterruptedException e) {
		//
		// e.printStackTrace();
		// }

		// wait.until(ExpectedConditions.titleContains("Inbox"));

		System.out.println("test loginverify");

		Assert.assertTrue(loginpage.getDriver().getPageSource().contains("u1"));

		loginpage.quit();

	}

}
