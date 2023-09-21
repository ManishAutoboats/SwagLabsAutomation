package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutPage;

public class CheckoutPageSteps {
	
	CheckoutPage checkout = new CheckoutPage();

@Then("user enter personal details {string} {string} {string}")
public void user_enter_personal_details(String fname, String lanme, String pcode) {
     checkout.user_enter_personal_details(fname, lanme, pcode);
}  

@And ("user click on Continue button")
public void user_click_on_Continue_button() {
	checkout.clickOnContinueBtn();
}

@Then ("Validate user navigate to checkout two page")
public void Validate_user_navigate_to_checkout_two_page() {
	checkout.Validate_user_navigate_to_checkout_two_page();
}
}
