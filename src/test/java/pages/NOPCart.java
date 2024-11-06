package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NOPCart extends Page {
    // Constructor
    public NOPCart() {
        url = "https://nop-qa.portnov.com/cart";
        title = "Your store. Shopping Cart";
    }

    // Locators
    @FindBy(id = "termsofservice")
    private WebElement termsOfServiceCheckbox;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    //methods
    public void acceptTerms() {
        termsOfServiceCheckbox.click();

    }
    public void clickCheckout() {
        checkoutButton.click();

    }
}
