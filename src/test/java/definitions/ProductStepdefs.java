//package support;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//import static org.assertj.core.api.Assertions.*;
//import static support.DriverFactory.getDriver;
//
//
//public class ProductStepdefs {
//    @Given("I open the browser and navigate to {string} page")
//    public void iOpenTheBrowserAndNavigateTo(String url)
//    {
//        getDriver().get(url);
//    }
//
//    @Then("I verify the page title {string}")
//    public void iVerifyThePageTitle(String pageTitle)
//    {
//        assertThat(getDriver().getTitle()).isEqualTo(pageTitle);
//    }
//
//    @When("I click on {string} item")
//    public void iClickOnItem(String product) throws InterruptedException {
//        String xpath = "//img[@title='"+product +"']";
//
//        getDriver().findElement(By.xpath(xpath)).click();
//        Thread.sleep(3000);
//    }
//
//    @Then("I land on product description page")
//    public void iLandOnProductDescriptionPage()
//    {
//        String title = "";
////        switch (category) {
////            case "Mac": {
////
////                css = "#menu-item-15";
////                break;
////
////            }
////            case "iPhone": {
////
////                css = "#menu-item-13";
////                break;
////
////            }
////            case "Watch": {
////
////                css = "#menu-item-16";
////                break;
////
////            }
////            case "Accessories": {
////
////                css = "#menu-item-12";
////                break;
////
////            }
////            default: {
////
////                System.out.println("bad category");
////
////            }
////
////        }
//
//        assertThat(getDriver().getTitle()).isEqualTo("iMac – E-Market");
//    }
//
//    @And("I verify product information contains the {string}")
//    public void iVerifyProductInformationContainsThe(String productName)
//    {
//        assertThat(getDriver().findElement(By.xpath("//div[@class='woocommerce-product-details__short-description']")).getText()).contains(productName);
//    }
//
//    @When("I Increase the Counter and Add to Cart")
//    public void iIncreaseTheCounterAndAddToCart()
//    {
//        WebElement quantity=getDriver().findElement(By.xpath("//input[@name='quantity']"));
//        quantity.clear();
//        quantity.sendKeys("3");
//    }
//
//    @Then("Verify Product has been added")
//    public void verifyProductHasBeenAdded()
//    {
//        assertThat(getDriver().findElement(By.xpath("//div[@class='woocommerce-message']")).getText()).containsIgnoringCase("have been added to your cart.");
//    }
//
//    @Then("I click on {string} button")
//    public void iClickOnButton(String arg0) throws InterruptedException {
//        getDriver().findElement(By.xpath("//a[@data-product_id='58']")).click();
//        Thread.sleep(3000);
//    }
//
//    @Then("I click on {string}")
//    public void iClickOn(String arg0) {
//       getDriver().findElement(By.xpath("//a[@title='View cart']")).click();
//    }
//
//    @Then("I enter {string},{string} and {string} into the  fields")
//    public void iEnterAndIntoTheFields(String firstName,String lastName,String emailAddress) {
//        getDriver().findElement(By.id("billing_first_name")).sendKeys(firstName);
//        getDriver().findElement(By.id("billing_last_name")).sendKeys(lastName);
//        getDriver().findElement(By.id("billing_email")).sendKeys(emailAddress);
//
//
//
//    }
//
//    @When("I click on {string} I should land on check out page")
//    public void iClickOnIShouldLandOnCheckOutPage(String arg0) {
//        getDriver().findElement(By.xpath("//a[contains(text(),'Proceed to checkout')]")).click();
//    }
//
//    @And("I click  {string} button")
//    public void iClickButton(String arg0) {
//        WebElement element = getDriver().findElement(By.xpath("//button[@id='place_order']"));
//        Actions actions = new Actions(getDriver());
//
//
//       // actions.moveToElement(element, 0, 32).click().perform();
//        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
//        executor.executeScript("arguments[0].click();", element);
//
//    }
//
//    @Then("I verify the Confirmation Page and all of the information")
//    public void iVerifyTheConfirmationPageAndAllOfTheInformation() throws InterruptedException {
//        assertThat(getDriver().getTitle()).containsIgnoringCase("Checkout – E-Market");
//        //assertThat(getDriver().findElement(By.xpath("//p[contains(text(),'Thank you. Your order has been received.')]")).getText())
//               // .containsIgnoringCase("order has been received");
//        Thread.sleep(3000);
//    }
//
//
//
////    @Given("I open the browser and navigate to {string} page")
////    public void iOpenTheBrowserAndNavigateToPage(String arg0) {
////    }
//
//
////    @Then("I enter {string}, {string} and {string} into the  fields")
////    public void iEnterAndIntoTheFields(String arg0, String arg1, String arg2) {
////    }
//}
