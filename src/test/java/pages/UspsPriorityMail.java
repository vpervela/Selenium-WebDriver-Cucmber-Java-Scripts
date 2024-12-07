package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsPriorityMail extends Page {
    //create constructor
    public UspsPriorityMail() {
        url = "https://www.usps.com/ship/priority-mail.htm";
        title = "Priority Mail | USPS";
    }

    //selectors

    @FindBy(xpath = "//a[@class='button--primary' and contains(text(),'Ship Now ')]")
    private WebElement shipNowButton;

    //create method to click Ship Now button
    public void clickShipNow() {
        shipNowButton.click();
    }

    //create method to switch to new window
    public void switchToNewWindow() {
        String mainWinHandle = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            if(!winHandle.equals(mainWinHandle)) {
                driver.switchTo().window(winHandle);
                break;
            }
        }
    }

}
