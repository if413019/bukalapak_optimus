package steps;

import cucumber.api.java.en.Given;
import pages.Login;
import pages.OnBoardingProfile;

public class LoginSteps extends BaseSteps {

    @Given("^(\\w+)\\s+on login screen login with credentials (\\w+)$")
    public void LoginWithUserCredential(String consumer, String userName) throws Throwable{
        OnBoardingProfile onBoardingProfile = new OnBoardingProfile(getDriverInstanceFor(consumer));
        Login loginScreen = new Login(getDriverInstanceFor(consumer));
        onBoardingProfile .viewLoginForm();
        loginScreen       .login(userName, credentials.data.get(userName)[0]);
    }
}
