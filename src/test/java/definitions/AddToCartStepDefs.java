package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.assertj.core.api.Assertions.*;
import static support.DriverFactory.getDriver;

public class AddToCartStepDefs {
    @Given("I open the browser and navigate to {string} page")
    public void iOpenTheBrowserAndNavigateToPage(String url) {
       getDriver() .get(url);
    }

    @Then("I verify the page title {string}")
    public void iVerifyThePageTitle(String pageTitle) {
        assertThat(getDriver().getTitle()).isEqualTo(pageTitle);

    }

    @Then("I click on {string} button of {string}")
    public void iClickOnButtonOf(String button, String product) {
//        String xpathExpression = "//h2[contains(text(),'" + product + "')]/following-sibling::a[contains(text(),'" + button + "')]";
//        WebElement addToCartButton= getDriver().findElement(By.xpath(xpathExpression));
//        addToCartButton.click();
//
        //WebElement productElement = getDriver().findElement(By.xpath("//h2[text()='" + product + "']"));

        // Find the 'Add To Cart' button associated with the product
        //WebElement addToCartButton = productElement.findElement(By.xpath("//a[@aria-label='Add '"+ product +"' to your cart']"));
       // WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        //WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@aria-label='Add “"+product+ "” to your cart')]")));
       // addToCartButton.click();

        // Click the 'Add To Cart' button
        //addToCartButton.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText(button)));
        if (addToCartButton.isDisplayed() && addToCartButton.isEnabled()) {
            addToCartButton.click();
        } else {
            System.out.println("Element is either not displayed or not enabled.");
        }


        // Click the 'Add To Cart' button
        addToCartButton.click();
    }

    @And("I click on {string} button")
    public void iClickOnButton(String buttonView) throws InterruptedException {
        if(buttonView.equals("View cart")){
            getDriver().findElement(By.xpath("//a[title = '"+ buttonView +"']")).click();
            Thread.sleep(1000);
            System.out.println(buttonView + "button clicked");

        }
    }

    @Then("I verify the {string} is added to the cart")
    public void iVerifyTheIsAddedToTheCart(String product) {
        assertThat(getDriver().findElement(By.xpath("//a[contains(text(),'"+ product +"')]")).isDisplayed()).isTrue();
    }



}
