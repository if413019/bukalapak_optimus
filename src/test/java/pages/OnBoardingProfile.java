package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OnBoardingProfile extends BaseScreen {

    @FindBy(className = "android.widget.Button")
    private List<WebElement> buttons;

    private AppiumDriver driver;
    public OnBoardingProfile(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void viewLoginForm(){
        this.buttons.get(0).click();
    }
}
