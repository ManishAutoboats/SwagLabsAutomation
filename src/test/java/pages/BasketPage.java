package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {

	public void clickOnAddToCart() {
		WebElement addToCartBtn = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		clickonElement(addToCartBtn);
	}

	public void validateCartCount(String count) {

		WebElement cartCount = driver.findElement(By.cssSelector("span.shopping_cart_badge"));

		String cartvalue = cartCount.getText();

		Assert.assertEquals(count, cartvalue);
	}

	public void user_nvaigate_to_checkout_page() {
		
	WebElement cartLink=	driver.findElement(By.cssSelector("a.shopping_cart_link"));
        clickonElement(cartLink);
        
       WebElement checkoutBtn= driver.findElement(By.cssSelector("a.btn_action.checkout_button"));
       clickonElement(checkoutBtn);
	}

}
