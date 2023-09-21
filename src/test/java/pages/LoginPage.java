package pages;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	public void user_enter_and_deatils(String username, String pass) {

		WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
		userName.sendKeys(username);

		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);

	}

	public void user_click_on_login_button() {

		WebElement loginBtn = driver.findElement(By.cssSelector("#login-button"));

		clickonElement(loginBtn);

	}
	
	public void validate_error_message() {
	  WebElement errorMessage= driver.findElement(By.xpath("//h3[@data-test='error']"));
	  Assert.assertTrue(errorMessage.isDisplayed());
	}

}
