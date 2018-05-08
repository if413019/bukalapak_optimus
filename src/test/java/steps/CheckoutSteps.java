package steps;

import cucumber.api.java.en.Given;
import pages.Checkout;

public class CheckoutSteps extends BaseSteps {
    @Given("^(\\w+)\\s+do checkout$")
        public void tapCheckout(String consumer) throws Throwable {
        	Checkout checkout = new Checkout(getDriverInstanceFor(consumer));
        	checkout.scrollDownToThenTap("Bayar");
    	}

	@Given("^(\\w+)\\s+do checkout from landing page$")
	public void tapCheckoutFromLandingPage(String consumer) throws Throwable {
		Checkout checkout = new Checkout(getDriverInstanceFor(consumer));
		checkout.scrollDownToThenTap("Bayar");
	}

}
