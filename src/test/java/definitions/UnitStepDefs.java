
package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class UnitStepDefs {
    @Given("I go to {string} page")
    public void iGoToPage(String arg0) {
        getDriver().get("https://www.unitconverters.net/");
    }

    @When("I click on {string}")
    public void iClickOn(String tab) {

//        String xpath = "//a[text()='"+tab+" ']";
//        getDriver().findElement(By.xpath(xpath)).click();
        getDriver().findElement(By.partialLinkText(tab)).click();
    }

    @And("I set {string} to {string}")
    public void iSetTo(String unit1, String unit2) {
        //TODO Finish the FIGHT!!!!!!
        WebElement webElement = getDriver().findElement(By.xpath("//select[@id='calFrom']"));
        Select select = new Select(webElement);
        select.selectByVisibleText(unit1);

        WebElement element = getDriver().findElement(By.xpath("//select[@id='calTo']"));
        Select select1 = new Select(element);
        select1.selectByVisibleText(unit2);

//        WebElement webElement = getDriver().findElement(By.xpath("//select[@id='calFrom']"));
//        Select select = new Select(webElement);
//        select.selectByVisibleText(unit1);
//        WebElement webElement2 = getDriver().findElement(By.xpath("//select[@id='calTo']"));
//        Select select2 = new Select(webElement2);
//        select2.selectByVisibleText(unit2);
    }

    @Then("I enter into From field {string} and verify {string} result")
    public void iEnterIntoFromFieldAndVerifyResult(String field, String result) {
        getDriver().findElement(By.xpath("//input[@id='fromVal']")).sendKeys(field);
        String actual = getDriver().findElement(By.id("toVal")).getAttribute("value");
        assertThat(actual).isEqualTo(result);

    }
}
