package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NOPProduct {
    protected WebDriver driver;
    // Constructor
    public NOPProduct() {
    }

    // Locators
    @FindBy(xpath = "//button[contains(@id, 'add-to-cart-button')]")
    private WebElement addToCartButton;

    @FindBy(id = "product-details")
    private WebElement productDetails;

    @FindBy(id ="product_attribute_2")
    private WebElement productAttribute2;

    // Method to add product to cart
    public void addToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addToCartButton));
        addToCartButton.click();
    }

    // Method to verify product details are visible
    public void verifyProductDetails() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(productDetails));
    }

    //ONLY FOR DESKTOP
    public void selectRAM(String ramSize) {
        Select dropdown = new Select(productAttribute2);
        dropdown.selectByVisibleText(ramSize);
    }
}


