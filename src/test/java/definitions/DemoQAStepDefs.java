package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class DemoQAStepDefs {
    @Given("I am on the {string} page")
    public void iAmOnThePage(String page) {
        if(page.equals("Elements") ) {
            getDriver().get("https://demoqa.com/elements");
            //Thread.sleep(3000);
        }else if(page.equals("Forms") ){
            getDriver().get("https://demoqa.com/forms");
        }else{
            System.out.println("BAD CALL MATE!!!");
        }
    }

    @When("I click on the {string} option")
    public void iClickOnTheOption(String tab) {
       // if(tab.equals("Practice Form") ) {
           // getDriver().findElement(By.id("item-0")).click();
            //Thread.sleep(3000);
        //}else if(tab.equals( "Text Box")){
          //  getDriver().findElement(By.id("item-0")).click();
       // }else{
          //  System.out.println("BAD CALL MATE!!!");
       // }
        getDriver().findElement(By.xpath("//span[contains(text(),'" + tab + "')]")).click();
    }

    @Then("I verify I am on the {string} page")
    public void iVerifyIAmOnThePage(String expectedResult) {
        //String expectedResult = "Text Box";
        String actualResult = getDriver().findElement(By.className("text-center")).getText();
        assertThat(actualResult).isEqualTo(expectedResult);
        //assertThat(getDriver().findElement(By.className("text-center")).getText()).isEqualTo("Text Box");
    }

    @And("I should see fields for {string}")
    public void iShouldSeeFieldsFor(String arg0) {
    }


    @When("I fill out the Text Box fields")
    public void iFillOutTheTextBoxFields() {
        getDriver().findElement(By.id("userName")).sendKeys("TopG");
        getDriver().findElement(By.id("userEmail")).sendKeys("test@test.com");
        getDriver().findElement(By.id("currentAddress")).sendKeys("123 Automation Lane");
        getDriver().findElement(By.id("permanentAddress")).sendKeys("42069 LAMAO Street");
        getDriver().findElement(By.id("submit")).click();
    }

    @Then("I verify the output")
    public void iVerifyTheOutput() {
        String fullName = "TopG";
        String email = "test@test.com";
        String currentAddress = "123 Automation Lane";
        String permanentAddress = "42069 LAMAO Street";

        String nameActual = getDriver().findElement(By.xpath("//div[@id='output']//p[@id='name']")).getText();
        String emailActual = getDriver().findElement(By.xpath("//div[@id='output']//p[@id='email']")).getText();
        String currentAddressActual = getDriver().findElement(By.xpath("//div[@id='output']//p[@id='currentAddress']")).getText();
        String permanentAddressActual = getDriver().findElement(By.xpath("//div[@id='output']//p[@id='permanentAddress']")).getText();

        assertThat(nameActual).containsIgnoringCase(fullName);
        assertThat(emailActual).containsIgnoringCase(email);
        assertThat(currentAddressActual).containsIgnoringCase(currentAddress);
        assertThat(permanentAddressActual).containsIgnoringCase(permanentAddress);
    }

    @When("I fill out the Practice Form")
    public void iFillOutThePracticeForm() {
        getDriver().findElement(By.id("firstName")).sendKeys("Top");
        getDriver().findElement(By.id("lastName")).sendKeys("G");
        getDriver().findElement(By.id("userEmail")).sendKeys("test@test.com");
        //Here is where you would put If/Elese

        getDriver().findElement(By.xpath("//label[contains(text(),'Other')]")).click();
        getDriver().findElement(By.id("userNumber")).sendKeys("3105551234");

        getDriver().findElement(By.id("dateOfBirthInput")).clear();
        getDriver().findElement(By.id("dateOfBirthInput")).sendKeys("22 Oct 1958");
    }

    @Then("I verify the form results")
    public void iVerifyTheFormResults() {
    }

    @When("I click the button for {string} alert")
    public void iClickTheButtonForAlert(String button) {
        //TODO Add Timed, confirm and prompt options LATER
        if (button.equals("Simple")) {
            getDriver().findElement(By.id("alertButton")).click();
        } else {
            System.out.println("Bad Button");
        }

    }

    @Then("an alert should appear")
    public void anAlertShouldAppear() {
        //        Alert a = getDriver().switchTo().alert();
//        assertThat(a).isNotNull();
        assertThat(getDriver().switchTo().alert()).isNotNull();
    }

    @And("I accept the alert")
    public void iAcceptTheAlert() {
        getDriver().switchTo().alert().accept();
    }

    @When("I click the {string} button")
    public void iClickTheButton(String button) {
        //TODO Add New Window Message option
        if (button.equals("New Tab")) {
            getDriver().findElement(By.id("tabButton")).click();
        } else if (button.equals("New Window")) {
            getDriver().findElement(By.id("windowButton")).click();
        } else {
            System.out.println("Bad Button");
        }
    }

    @Then("a new window or tab should open")
    public void aNewWindowOrTabShouldOpen() {
        Iterator<String> iterator = getDriver().getWindowHandles().iterator();
        String newWindow = iterator.next();
        String og = newWindow;
        while(iterator.hasNext()) {
            newWindow = iterator.next();
        }
        assertThat(og.equals(newWindow)).isFalse();
    }

    @And("I switch to the new window or tab")
    public void iSwitchToTheNewWindowOrTab() {
        Iterator<String> iterator = getDriver().getWindowHandles().iterator();
        String newWindow = iterator.next();
        while(iterator.hasNext()) {
            newWindow = iterator.next();
        }
        getDriver().switchTo().window(newWindow);
    }

    @And("I should see {string} text")
    public void iShouldSeeText(String expected) {
        String actual = getDriver().findElement(By.id("sampleHeading")).getText();
        assertThat(actual).isEqualTo(expected);
    }

    @When("I switch to the frame with id {string}")
    public void iSwitchToTheFrameWithId(String id) {
        getDriver().switchTo().frame(id);
    }

    @Then("I should see {string} text in the frame")
    public void iShouldSeeTextInTheFrame(String expected) {
        String actual = getDriver().findElement(By.id("sampleHeading")).getText();
        assertThat(actual).isEqualTo(expected);
    }
}
