package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Login extends BaseScreen{
    @FindBy(id = "et")
    private List<WebElement> loginForm;

    @FindBy(id = "button_login_normal")
    private WebElement buttonLogin;

    private AppiumDriver driver;
    public Login(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void login(String username, String password){
        this.sendKeys(loginForm.get(0), username);
        this.sendKeys(loginForm.get(1), password);
        this.buttonLogin.click();
    }

}
