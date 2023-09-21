package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BasketPage;

public class BasketPageSteps {
	
	BasketPage basket= new BasketPage();
	
	
	@And ("user click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		basket.clickOnAddToCart();
	}
	
	
	
	@Then ("Validte cart count is {string}")
	public void validate_cart_count(String count) {
		basket.validateCartCount(count);
	}
	
	@And ("user nvaigate to checkout page")
	public void user_nvaigate_to_checkout_page() {
		  basket.user_nvaigate_to_checkout_page();
	}

}
