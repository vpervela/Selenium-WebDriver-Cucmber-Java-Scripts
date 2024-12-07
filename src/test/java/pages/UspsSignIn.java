package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsSignIn extends Page{
    //create constructor
    public UspsSignIn() {
        url = " https://reg.usps.com/entreg/LoginAction_input";
        title = "USPS.com® - Sign In";
    }

    //selectors
    @FindBy(xpath = "//h1[@id='sign-in-to-your-account-header']")
    private WebElement signInHeader;

    @FindBy(xpath = "//h2[text()='Already have an account?']")
    private WebElement alreadyHaveAnAccount;


    //create method to validate expected message "Already have an account?" is present
    public boolean isMessagePresent(String message) {
        return alreadyHaveAnAccount.getText().contains(message);
    }
}
