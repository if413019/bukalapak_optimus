package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;

public class Vp extends BaseScreen {
    private AppiumDriver driver;

    public Vp(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
}
