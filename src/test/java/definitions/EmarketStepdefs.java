package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class EmarketStepdefs {
    @Given("I navigate to eMarket Page")
    public void iNavigateToEMarketPage() {
        getDriver().get("https://store-stage.portnov.com/");
    }

    @Then("Verify Page Title is {string}")
    public void verifyPageTitleIs(String title) {
        assertThat(getDriver().getTitle()).isEqualTo(title);
    }

    @Then("Verify Product Categories \\(Both)")
    public void verifyProductCategoriesBoth() {
        String[] categories = {"#menu-item-15", "#menu-item-13", "#menu-item-16", "#menu-item-12"};
        String[] sideCategory = {"cat-item cat-item-15", "cat-item cat-item-16", "cat-item cat-item-19", "cat-item cat-item-20"};
        for (String category : categories) {
            assertThat(getDriver().findElement(By.cssSelector(category)).isDisplayed()).isTrue();
        }
        for (String side : sideCategory) {
            assertThat(getDriver().findElement(By.xpath("//li[@class='" + side + "']")).isDisplayed()).isTrue();
            System.out.println("//li[@class='" + side + "']");
        }

//        for(int i = 0; i < sideCategory.length; i++) {
//            assertThat(getDriver().findElement(By.xpath("//li[@class='" + sideCategory[i] + "']")).isDisplayed()).isTrue();
//        }

        //        WebElement mac = getDriver().findElement(By.cssSelector("#menu-item-15"));
//        assertThat(mac.isDisplayed()).isTrue();

//        assertThat(getDriver().findElement(By.cssSelector("#menu-item-15")).isDisplayed()).isTrue();
//        assertThat(getDriver().findElement(By.cssSelector("#menu-item-13")).isDisplayed()).isTrue();
//        assertThat(getDriver().findElement(By.cssSelector("#menu-item-16")).isDisplayed()).isTrue();
//        assertThat(getDriver().findElement(By.cssSelector("#menu-item-12")).isDisplayed()).isTrue();

    }

    @Then("Verify Cart Icon")
    public void verifyCartIcon() {
        assertThat(getDriver().findElement(By.cssSelector("#site-header-cart")).isDisplayed()).isTrue();
    }

    @Then("Verify Filters")
    public void verifyFilters() {
//        WebElement web = getDriver().findElement(By.xpath("//select[@name='orderby'][1]"));
//        Select select = new Select(web);
//
//        for(int i = 0; i < 4; i++) {
//            List<WebElement> optionList = select.getOptions();
//            select.selectByIndex(i);
//            assertThat(optionList.get(i).isSelected()).isTrue();
//        }
    }

    @When("I click on {string} category")
    public void iClickOnCategory(String category) {
        String css = "";
        switch (category) {
            case "Mac": {
                css = "#menu-item-15";
                break;
            }
            case "iPhone": {
                css = "#menu-item-13";
                break;

            }
            case "Watch": {
                css = "#menu-item-16";
                break;

            }
            case "Accessories": {
                css = "#menu-item-12";
                break;

            }
            default: {
                System.out.println("bad category");
            }
        }
        getDriver().findElement(By.cssSelector(css)).click();
    }

    @Then("I verify we filter for {string} category")
    public void iVerifyWeFilterForCategory(String expected) {
        String actual = getDriver().findElement(By.xpath("//header[@class='woocommerce-products-header']/h1")).getText();
        assertThat(actual).isEqualTo(expected);
    }

//    @Then("I click on {string}")
//    public void iClickOn(String arg0) {
//    }
//
//    @Then("I enter {string},{string} and {string} into the  fields")
//    public void iEnterAndIntoTheFields(String arg0, String arg1, String arg2) {
//    }
}


