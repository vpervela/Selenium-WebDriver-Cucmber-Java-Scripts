package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UspsAddressForm extends Page {
    //create constructor
    public UspsAddressForm() {
        url = "https://tools.usps.com/zip-code-lookup.htm?byaddress";
        title = "ZIP Code™ Lookup | USPS";
    }

    //selectors for company,street address, city, state
    @FindBy(xpath = "//input[@id = 'tCompany']")
    private WebElement company;

    @FindBy(xpath = "//input[@id = 'tAddress']")
    private WebElement streetAddress;

    @FindBy(xpath = "//input[@id = 'tCity']")
    private WebElement city;

    // @FindBy(xpath = "//select[@id='tState']/option[contains(text(),'CA - California')]")
    @FindBy(id = "tState")
    private WebElement state;

    @FindBy(xpath = "//a[@id='zip-by-address']")
    private WebElement findButton;


    @FindBy(xpath = "//a[@id='navsearch']/..")
    private WebElement searchMenu;

    @FindBy(id = "global-header--search-track-search")
    private WebElement searchField;


    //create method to fill out the form
    public void fillOutAddressForm(String company, String streetAddress, String city, String state) {
        this.company.sendKeys(company);
        this.streetAddress.sendKeys(streetAddress);
        this.city.sendKeys(city);
        Select select = new Select(this.state);
        select.selectByValue(state);

    }

    public void clickFindButton() {
        findButton.click();
    }

    public void searchFor(String text) {

        actions.moveToElement(searchMenu).perform();
        searchField.sendKeys(text + Keys.ENTER);

    }
}
