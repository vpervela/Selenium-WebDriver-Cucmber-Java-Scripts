package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends Page {
    public CareersPage() {
        url = "https://skryabin-careers.herokuapp.com/";
        title = "Careers Portal";
    }

    //selectors

    @FindBy(xpath = "//button[text()='Login']")
    private WebElement loginButton;

    @FindBy(xpath = "//span[@class = 'logout-box']/a")
    private WebElement loggedUser;

    //methods
    public void clickLoginButton() {
        loginButton.click();
    }

    public String getLoggedUser() {
        return loggedUser.getText();
    }

}
