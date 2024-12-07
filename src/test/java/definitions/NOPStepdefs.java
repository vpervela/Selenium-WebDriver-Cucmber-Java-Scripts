package definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.*;
import support.DriverFactory;

import javax.swing.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NOPStepdefs {

    HashMap<String, String> user;
    String mainWindow;

    WebDriver driver = DriverFactory.getDriver();

    //Instance of NOPRegister page
    NOPRegister nopRegister = new NOPRegister();
    NOPLogin nopLogin = new NOPLogin();
    NOPHome nopHome = new NOPHome();
    NOPProduct nopProduct = new NOPProduct();
    NOPCart nopCart = new NOPCart();

    public NOPStepdefs() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("I am on the nopCommerce homepage")
    public void iAmOnTheNopCommerceHomepage() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://nop-qa.portnov.com/");
    }

    @When("I click on the {string} category tab")
    public void iClickOnTheCategoryTab(String category) {
//        if(category.equals("Computers")){
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
//        } else if (category.equals("Electronics")) {
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
//        } else if (category.equals("Apparel")) {
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
//        } else if (category.equals("Digital downloads")) {
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
//        } else if (category.equals("Books")) {
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
//        } else if (category.equals("Jewelry")) {
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
//        } else if (category.equals("Gift Cards")) {
//            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
//        } else {
//            throw new IllegalArgumentException("Invalid category: " + category);
//        }
        nopHome.clickCategory(category);
    }

    @When("I click on the {string} subcategory in the sidebar")
    public void iClickOnTheSubcategoryInTheSidebar(String subcategory) {
//        if (subcategory.equals("Desktops")) {
//            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/desktops']")).click();
//        } else if (subcategory.equals("Notebooks")) {
//            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/notebooks']")).click();
//        } else if (subcategory.equals("Software")) {
//            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/software']")).click();
//        } else {
//            throw new IllegalArgumentException("Invalid subcategory: " + subcategory);
//        }
        nopHome.clickSubcategory(subcategory);

    }


    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        nopRegister.openURL();
    }

    @When("I register with a Default User")
    public void iRegisterWithADefaultUser() {
        //Fill out the Registered User AND store the users email and password
        this.user = nopRegister.registerUser();
        //nopRegister.registerUser();
    }

    @Then("I should see a registration success message")
    public void iShouldSeeARegistrationSuccessMessage() {
        nopRegister.waitForRegistrationResultMessage();
    }

    @When("I register using first name {string}, last name {string}, email {string}, and password {string}")
    public void iRegisterUsingFirstNameLastNameEmailAndPassword(String fname, String lname, String email, String password) {
        nopRegister.registerUser(fname,lname,email,password);
    }

    @And("I click Logout")
    public void iClickLogout() {
        nopRegister.clickLogoutButton();
    }

    @When("I am on the login page")
    public void iAmOnTheLoginPage() {
        nopLogin.openURL();
    }

    @When("I enter Default Credentials")
    public void iEnterDefaultCredentials() {
//       String email = user.get("email");
//       String password = user.get("password");
        nopLogin.login(user.get("email"), user.get("password"));
    }

    @Then("I verify something")
    public void iVerifySomething() {
    }

    @And("I am logged in as a registered user")
    public void iAmLoggedInAsARegisteredUser() {
       this.user = nopRegister.registerUser();
        nopLogin.login(user.get("email"), user.get("password"));
    }

    @And("I select the product {string}")
    public void iSelectTheProduct(String text) {
        nopHome.clickProduct(text);
    }

    @And("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        nopProduct.addToCart();
    }

    @And("I click on Shopping cart tab")
    public void iClickOnShoppingCartTab() {
        nopHome.goToShoppingCart();
    }

    @Then("I proceed to the checkout page")
    public void iProceedToTheCheckoutPage() {
        nopCart.acceptTerms();
        nopCart.clickCheckout();
    }

    @And("I select RAM as {string} for Desktop")
    public void iSelectRAMAsForDesktop(String ram) {
        nopProduct.selectRAM(ram);

    }
 //windows handling
    @When("I click on the {string} link in the footer")
    public void iClickOnTheLinkInTheFooter(String socials) throws InterruptedException {
        this.mainWindow = nopHome.getMainWindowHandle();
        nopHome.clickSocials(socials.toLowerCase());
        Thread.sleep(5000);

    }

    @Then("I should be redirected to the {string} page")
    public void iShouldBeRedirectedToThePage(String social) {
        nopHome.switchToWindow();
        nopHome.verifyTitle(social);
    }

    @When("I close the new tab")
    public void iCloseTheNewTab() throws InterruptedException {
        //driver.close();
        nopHome.closeWindow();
       // Thread.sleep(5000);
        
    }

    @Then("I should return back to nopCommerce homepage")
    public void iShouldReturnBackToNopCommerceHomepage() {
        driver.switchTo().window(mainWindow);
       // nopHome.switchToWindow(mainWindow);
        nopHome.verifyTitle();

    }

    @When("I hover over the {string} category tab")
    public void iHoverOverTheCategoryTab(String category) throws InterruptedException {
        nopHome.hoverOverElement(category);
        Thread.sleep(5000);

    }


    @Then("I should see subcategory:$")
    public void iShouldSeeSubcategory(DataTable subcategory) {
        //converts data table to list of categories that can loop through
        List<String> subcategories = subcategory.asList(String.class);
        for (String sub: subcategories){
            nopHome.verifySubcategory(sub);
        }

    }

    @When("I click and wait for Shopping Cart")
    public void iClickAndWaitForShoppingCart() {
        nopHome.clickVerifyShoppingCart();
    }
}


