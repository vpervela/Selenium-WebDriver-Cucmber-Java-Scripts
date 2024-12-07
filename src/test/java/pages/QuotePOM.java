package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.DriverFactory;

public class QuotePOM {
    WebDriver driver = DriverFactory.getDriver();
    private static final String URL = "https://skryabin.com/market/quote.html";

    //constructor
    public QuotePOM() {
        PageFactory.initElements(driver, this);
    }

    //selectors
    @FindBy(xpath = "//iframe")
    private WebElement iframe;

    @FindBy(xpath = "//input[@id='contactPersonName']")
    private WebElement contactPersonName;

    @FindBy(xpath = "//input[@id='contactPersonPhone']")
    private WebElement contactPersonPhone;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement name;

    //methods
    public void openQuoteForm() {
        driver.get(URL);
    }

    public void goInsideIframe() {
        driver.switchTo().frame(iframe);
    }

    public void typeContactPersonName(String name) {
        contactPersonName.sendKeys(name);
    }

    public void typeContactPersonPhone(String phone) {
        contactPersonPhone.sendKeys(phone);
    }

    public void typeName(String name) {
        this.name.sendKeys(name);
    }

    public void goOutOfIframe() {
        driver.switchTo().defaultContent();
    }

}
