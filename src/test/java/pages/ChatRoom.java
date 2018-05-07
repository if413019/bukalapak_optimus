package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatRoom extends BaseScreen {
    private AppiumDriver driver;

    @FindBy(id="eetChat")
    private WebElement chatField;

    @FindBy(id="ivSend")
    private WebElement buttonSend;

    public ChatRoom(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }

    public void typeMessage(String message){
    	this.sendKeys(chatField, message);
        this.buttonSend.click();
    }

}