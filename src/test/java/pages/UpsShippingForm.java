package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.logging.Logger;

import static support.DriverFactory.getDriver;

public class UpsShippingForm extends Page {
    private static final Logger logger = Logger.getLogger(UpsShippingForm.class.getName());

    //create constructor
    public UpsShippingForm() {
        url = "https://www.ups.com/ship/basic/shipment-info";
        title = "UPS Shipping";
    }

    //selectors for ship from
    @FindBy(id = "ShippingSummaryOriginAdd-Name")
    private WebElement fullName;

    @FindBy(id = "ShippingSummaryOriginAdd-Email")
    private WebElement email;


    @FindBy(xpath = "//form[@id='ShippingSummaryOriginAdd-Form']//input[@name='singleaddress1']")
    private WebElement streetAddress;

    //@FindBy(xpath = "//button[@class='dropdown-item active']")
    @FindBy(xpath = "//ngb-typeahead-window[@id='ngb-typeahead-0']/button[@id = 'ngb-typeahead-0-0']")
    private WebElement addressShipList;



    //selectors for ship to
    @FindBy(id = "ShippingSummaryDestinationAdd-Name")
    //@FindBy(xpath = "//input[@id = 'ShippingSummaryDestinationAdd-Name']")
    //@FindBy(xpath = "//div[@class = 'ups-form_group ups-input user-info typed']//input[@id = 'ShippingSummaryDestinationAdd-Name']")
    private WebElement fullNameShipTo;

    @FindBy(xpath = "//form[@id = 'ShippingSummaryDestinationAdd-Form']//input[@id = 'ShippingSummaryDestinationAdd-Address poBox-error-message']")
    //@FindBy(xpath = "//input[@id = 'ShippingSummaryDestinationAdd-Address poBox-error-message']")
    private WebElement streetAddressShipTo;

    @FindBy(xpath = "//ngb-typeahead-window[@id = 'ngb-typeahead-1']/button[@id = 'ngb-typeahead-1-0']")
    private WebElement addressShipToList;

    //selectors for packaging
    @FindBy(xpath = "//input[@id = 'ShippingSummaryOriginAdd-Weight']")
    //@FindBy(xpath = "//div[@id ='divWeight']")
    private WebElement weight;

    @FindBy(xpath = "//input[@id = 'ShippingSummaryOriginAdd-Length']")
    private WebElement length;

    @FindBy(xpath = "//input[@id = 'ShippingSummaryOriginAdd-Width']")
    private WebElement width;

    @FindBy(xpath = "//input[@id = 'ShippingSummaryOriginAdd-Height']")
    private WebElement height;

    @FindBy(xpath = "//button[@id = 'next-btn']")
    private WebElement submitButton;





    @FindBy(xpath = "//button[@class = 'close_btn_thick']")
    private WebElement cookieClose;
    @FindBy(xpath = "//button[@data-dismiss = 'modal']")
    private WebElement simplifiedShippingClose;


    private String address = "4970 El Camino Real, Los Altos, CA";
    private String name = "John Doe";
    private String emailAddress = "jdoe@example.com";

    //methods

    public void closeCookie() {
        cookieClose.click();
    }

    public void closeShippingModal() {
        simplifiedShippingClose.click();
    }


    private WebElement waitForElementToBeClickable(By locator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public void fillOutShippingForm() {

        waitForElementToBeClickable(By.id("ShippingSummaryOriginAdd-Name")).sendKeys(name);
        waitForElementToBeClickable(By.id("ShippingSummaryOriginAdd-Email")).sendKeys(emailAddress);
        WebElement streetAddressElement = waitForElementToBeClickable(By.xpath("//form[@id='ShippingSummaryOriginAdd-Form']//input[@name='singleaddress1']"));
        streetAddressElement.sendKeys(address);
        waitForElementToBeClickable(By.xpath("//ngb-typeahead-window[@id='ngb-typeahead-0']/button[@id = 'ngb-typeahead-0-0']")).click();


    }
    public void fillOutShipTo() {
        //fill out ship to fields

        waitForElementToBeClickable(By.id("ShippingSummaryDestinationAdd-Name")).sendKeys(name);
        WebElement streetAddressShipToElement = waitForElementToBeClickable(By.xpath("//form[@id = 'ShippingSummaryDestinationAdd-Form']//input[@id = 'ShippingSummaryDestinationAdd-Address poBox-error-message']"));
        streetAddressShipToElement.sendKeys(address);
        waitForElementToBeClickable(By.xpath("//ngb-typeahead-window[@id = 'ngb-typeahead-1']/button[@id = 'ngb-typeahead-1-0']")).click();

    }
    public void fillOutPackaging() {

        WebElement weightElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ShippingSummaryOriginAdd-Weight")));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", weightElement);
        weightElement.click();
        weightElement.sendKeys("10");

        waitForElementToBeClickable(By.id("ShippingSummaryOriginAdd-Length")).sendKeys("10");
        waitForElementToBeClickable(By.id("ShippingSummaryOriginAdd-Width")).sendKeys("10");
        waitForElementToBeClickable(By.id("ShippingSummaryOriginAdd-Height")).sendKeys("10");

    }
    public void submitShippingForm() throws InterruptedException {

        waitForElementToBeClickable(By.xpath("//button[@id = 'next-btn']")).click();
    }
}
