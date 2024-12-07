package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpsShipperResult extends Page {
    public UpsShipperResult() {
        url = "https://www.ups.com/ship/basic/service-selection?tx=33100247393859819&loc=en_US";
        title = "UPS Shipping";
    }

    //selectors
    private By fullName = By.xpath("//div[@id = 'shippingSummaryOriginName']");
    private By email = By.xpath("//div[@id = 'shippingSummaryOriginEmail']");
    private By streetAddress = By.xpath("//div[@id = 'shippingSummaryOriginAddressLine1']");
    private By shipperPostalDetails = By.xpath("//div[@id = 'shippingSummaryOriginCityStatePostalCode']");


    private WebElement waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void getShipperDetails() {
        //check if shipper details is visible

        waitForElementToBeVisible(By.xpath("//h2[contains(text(),'Shipper Details')]"));
        System.out.println("Shipper Details:");
        System.out.println("Full Name: " + waitForElementToBeVisible(fullName).getText());
        System.out.println("Email: " + waitForElementToBeVisible(email).getText());
        System.out.println("Street Address: " + waitForElementToBeVisible(streetAddress).getText());
        System.out.println("City, State, Postal Code: " + waitForElementToBeVisible(shipperPostalDetails).getText());
    }
    public void getReceiverDetails() {
        //check if receiver details is visible

        waitForElementToBeVisible(By.xpath("//h2[contains(text(),'Receiver Details')]"));
        System.out.println("Receiver Details:");
        System.out.println("Full Name: " + waitForElementToBeVisible(By.xpath("//div[@id = 'shippingSummaryDestinationName']")).getText());
        System.out.println("Street Address: " + waitForElementToBeVisible(By.xpath("//div[@id = 'shippingSummaryDestinationAddressLine1']")).getText());
        System.out.println("City, State, Postal Code: " + waitForElementToBeVisible(By.xpath("//div[@id = 'shippingSummaryDestinationCityStatePostalCode']")).getText());
    }
}
