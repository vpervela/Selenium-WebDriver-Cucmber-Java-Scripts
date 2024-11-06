package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import support.DriverFactory;

public class QuoteResult extends Page {


    //constructor
    public QuoteResult() {
        url = "https://skryabin.com/market/quote.html";
        title = "Get a Quote";
        //PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    //selectors

    @FindBy(xpath = "//div[@id='quotePageResult']")
    private WebElement quotePageResult;

    @FindBy(xpath = "//b[@name='username']")
    private WebElement username;

    @FindBy(xpath = "//b[@name='email']")
    private WebElement email;

    @FindBy(xpath = "//b[@name='password']")
    private WebElement password;

    @FindBy(xpath = "//b[@name='name']")
    private WebElement name;

    @FindBy(xpath = "//b[@name='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//b[@name='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//b[@name='agreedToPrivacyPolicy']")
    private WebElement agreedToPrivacyPolicy;

    @FindBy(xpath = "//b[@name='thirdPartyAgreement']")
    private WebElement thirdPartyAgreement;

    @FindBy(xpath = "//b[@name='contactPersonName']")
    private WebElement contactPersonName;

    @FindBy(xpath = "//b[@name='contactPersonPhone']")
    private WebElement contactPersonPhone;


    //methods

    public String getQuotePageResult() {
        return quotePageResult.getText();
    }

    public String getUserName() {
        return username.getText();
    }

    public String getEmail() {
        return email.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public boolean isPasswordNotEmpty() {
        String passwordText = getPassword();
        return !passwordText.isEmpty();
    }

    public String getName() {
        return name.getText();

    }

    public String getFirstName() {
        return firstName.getText();
    }

    public String getLastName() {
        return lastName.getText();
    }

    public boolean isAgreedToPrivacyPolicySelected() {
        return "true".equalsIgnoreCase(agreedToPrivacyPolicy.getText());
    }

    public boolean getThirdPartyAgreement() {
        // return "true".equalsIgnoreCase(thirdPartyAgreement.getText());
        if (thirdPartyAgreement.getText().equalsIgnoreCase("accepted")) {
            return true;
        } else if (thirdPartyAgreement.getText().equalsIgnoreCase("declined")) {
            return false;
        } else {
            throw new Error("Unknown result: " + thirdPartyAgreement.getText());

        }
    }

    public String getContactPersonName() {
        return contactPersonName.getText();
    }

    public String getContactPersonPhone() {
        return contactPersonPhone.getText();
    }


    }
