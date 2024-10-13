package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.DriverFactory;

import java.time.Duration;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class QuoteStepDefs {
    WebDriver driver = DriverFactory.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//    public QuoteStepDefs() {
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }

    @Given("I navigate to {string} page")
    public void iNavigateToPage(String url) {

        driver.navigate().to(url);
    }

    @Then("I verify the page title as {string}")
    public void iVerifyThePageTitleAs(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @When("I enter {string} into username field")
    public void iEnterIntoUsernameField(String username) {
        driver.findElement(By.xpath("//input[@name = 'username']")).sendKeys(username);
    }

    @And("I enter {string} into password field")
    public void iEnterIntoPasswordField(String password) throws Throwable {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }


    @Then("I should see a new window")
    public void iShouldSeeANewWindow() {
        //store parent window ID
        String parentWindowID = driver.getWindowHandle();

        //get all window IDs
        Set<String> allWindowIDs = driver.getWindowHandles();

        //iterate through all IDs to switch to required window
        for (String myWindowID : allWindowIDs) {
            if (!myWindowID.equals(parentWindowID)) {
                driver.switchTo().window(myWindowID);
                break;
            }
        }

    }

    @And("I enter {string} into firstname field")
    public void iEnterIntoFirstnameField(String firstname) {
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(firstname);
    }

    @And("I enter {string} into middlename field")
    public void iEnterIntoMiddlenameField(String middlename) {
        driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(middlename);
    }

    @And("I enter {string} into lastname field")
    public void iTypeIntoLastnameField(String lastname) {
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lastname);
    }

    @Then("I switch to parent window")
    public void iSwitchToParentWindow() {
        String parentWindowID = driver.getWindowHandle();
        driver.switchTo().window(parentWindowID);
    }

    @And("I enter {string} into Email field")
    public void iEnterIntoEmailField(String email) {
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
        emailField.sendKeys(email);
    }

    @And("I enter {string} into Confirm Password field")
    public void iEnterIntoConfirmPasswordField(String confirmPassword) {
        WebElement confirmPass = driver.findElement(By.xpath("//input[@id='confirmPassword']"));
        boolean active = confirmPass.isEnabled();
        if (active) {
            confirmPass.sendKeys(confirmPassword);
        }

    }


    @When("I select the Privacy Policy check box")
    public void iSelectThePrivacyPolicyCheckBox() {
        WebElement checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox' and @name='agreedToPrivacyPolicy']"));
        if (!checkBox.isSelected()) {
            checkBox.click();
        }

    }

    @And("I click on the submit button")
    public void iClickOnTheSubmitButton() {
        WebElement submit = driver.findElement(By.xpath("//button[@id ='formSubmit']"));
        submit.click();

    }


    @Then("I verify we see the Submitted Application Page")
    public void iVerifyWeSeeTheSubmittedApplicationPage() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='quotePageResult']")));

            //wait for frstname to visible
            WebElement firstNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[@name='firstName']")));
            System.out.println("First Name: " + firstNameElement.getText());
            assertThat(firstNameElement.getText()).isNotNull().isEqualTo("Sara");

             //check for middleName
            WebElement middleNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[@name='middleName']")));
            System.out.println("Middle Name: " + middleNameElement.getText());
            assertThat(middleNameElement.getText()).isNotNull().isEqualTo("M");

            //check for lastName
            WebElement lastNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[@name='lastName']")));
            System.out.println("Last Name: " + lastNameElement.getText());
            assertThat(lastNameElement.getText()).isNotNull().isEqualTo("Lee");

            //check for username
            WebElement userNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[@name='username']")));
            System.out.println("Username: " + userNameElement.getText());
            assertThat(userNameElement.getText()).isNotNull().isEqualTo("SaraM");

            //for password field make sure it is not empty
           WebElement  passwordElement = driver.findElement(By.xpath("//b[@name='password']"));
          //print the password
            System.out.println("Password: " + passwordElement.getText());
           boolean value = !passwordElement.getText().isEmpty();
            System.out.println("Is Password  Not Empty?: " + value);
            //assert that password field is not empty
                  assertThat(value).isTrue();

            //for privacy policy check box make sure it is checked
            boolean checkBox = driver.findElement(By.xpath("//input[@type = 'checkbox' and @name='agreedToPrivacyPolicy']")).isSelected();
            assertThat(checkBox).isTrue();

        } catch (org.openqa.selenium.TimeoutException e) {
            System.err.println("Element not found within the wait time: " + e.getMessage());
           // System.err.println("Page source at the time of failure: " + driver.getPageSource());

            throw e;
        }

    }
}


