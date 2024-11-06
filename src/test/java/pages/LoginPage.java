package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {
    public LoginPage() {
        url = "https://skryabin.com/market/login.html";
        title = "Careers Portal";
    }

    //selectors

    @FindBy(xpath = "//div[@id = 'root']//label[text() = 'Username']/following-sibling::input")
    private WebElement username;

    @FindBy(xpath = "//div[@id = 'root']//label[text() = 'Password']/following-sibling::input")
    private WebElement password;

    @FindBy(xpath = "//button[@id = 'loginButton']")
    private WebElement submitButton;

    //methods
    public void fillUsername(String username) {
        this.username.sendKeys(username);
    }

    public void fillPassword(String password) {
        this.password.sendKeys(password);
    }

    public void fillLoginDetails(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        clickSubmitButton();


    }

    public void clickSubmitButton() {
        submitButton.click();
    }

}
