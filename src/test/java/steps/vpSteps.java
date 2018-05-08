package steps;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import pages.Vp;

public class vpSteps extends BaseSteps {
    @Given("^(\\w+)\\s+wait inquiry result$")
    public void waitInquiryResult(String consumer) throws Throwable {
        Vp vp = new Vp(getDriverInstanceFor(consumer));
        vp.waitForElementToBeVisible(By.xpath("//*[@text='Rincian Informasi']"),5);
    }
}
