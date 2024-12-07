package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsAddressResult extends Page {

    //create constructor
    public UspsAddressResult() {

    }
    //selectors
    @FindBy(xpath = "//div[@class='zipcode-result-address']")
    private WebElement resultAddress;

    @FindBy(xpath = "//p/strong[contains(text(),'94022')]")
    private WebElement zipCode;

    //method to validate zipcode exists in the result
    //validate that zipcode in the result is the one expected
    public boolean isZipCodeCorrect(String zipCode) {
        return resultAddress.getText().contains(zipCode);
    }

}
