package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.DriverFactory;

public class QuoteForm extends Page {


    //create constructor
    public QuoteForm() {
        url = "https://skryabin.com/market/quote.html";
        title = "Get a Quote";
       // PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    //selectors
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    private WebElement confirmPassword;

    //name dialog selectors
    @FindBy(xpath = "//input[@id='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//input[@name='agreedToPrivacyPolicy']")
    private WebElement agreedToPrivacyPolicy;

    @FindBy(xpath = "//button[@id='formSubmit']")
    private WebElement formSubmit;

    @FindBy(xpath = "//button[@id='thirdPartyButton']")
    private WebElement thirdPartyButton;

    //contact person iframe selectors
    @FindBy(xpath = "//input[@name='contactPersonName']")
    private WebElement contactPersonName;

    @FindBy(xpath = "//input[@name='contactPersonPhone']")
    private WebElement contactPersonPhone;

    //related document selectors
    @FindBy(xpath = "//button[contains(@onclick,'new_window')]")
    private WebElement relatedDocumentButton;

    @FindBy(xpath = "//li[text()='Document 2']")
    //@FindBy(xpath = "//body/ul]")
    private WebElement relatedDocumentList;


    //methods

    public void fillUsername(String userName){
       this.userName.sendKeys(userName);

    }

    public void fillEmail(String email){
        this.email.sendKeys(email);
    }

    public void fillPassword(String password){
        this.password.sendKeys(password);
        confirmPassword.sendKeys(password);
    }

    public void fillName(String firstName, String lastName){
        name.click();
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        saveButton.click();
    }
    public void acceptPrivacyPolicy(){
        if(!agreedToPrivacyPolicy.isSelected()){
            agreedToPrivacyPolicy.click();
        }
    }

    public void declinePrivacyPolicy(){
        if(agreedToPrivacyPolicy.isSelected()){
            agreedToPrivacyPolicy.click();
        }
    }

    public void clickSubmitButton(){
        formSubmit.click();
    }

    public void acceptThirdPartyAgreement(){
        thirdPartyButton.click();
        driver.switchTo().alert().accept();
    }

    public void declineThirdPartyAgreement(){
        thirdPartyButton.click();
        driver.switchTo().alert().dismiss();
    }

    public void fillContactPersonInfo(String contactName,String contactPhone){
        driver.switchTo().frame("additionalInfo");
        contactPersonName.sendKeys(contactName);
        contactPersonPhone.sendKeys(contactPhone);
        driver.switchTo().defaultContent();
    }


    public boolean isRelatedDocumentPresent(String documentName) {
        String mainWindowHandle = driver.getWindowHandle();
        relatedDocumentButton.click();
//        for(String handle : driver.getWindowHandles()){
//            driver.switchTo().window(handle);
//        }
//        String[] handles = driver.getWindowHandles().toArray(new String[0]);
//        int lastIndex = handles.length - 1;
//        driver.switchTo().window(handles[lastIndex]);
        //above can be written like this
        driver.getWindowHandles().forEach(handle -> driver.switchTo().window(handle));
        //System.out.println(relatedDocumentList.getText());
        boolean isDocumentPresent = relatedDocumentList.getText().contains(documentName);
        //switch to original window
        driver.switchTo().window(mainWindowHandle);
        return isDocumentPresent;

    }
}
