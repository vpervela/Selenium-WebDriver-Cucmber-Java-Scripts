package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.HashMap;
import java.util.Set;

public class NOPHome extends Page{
    public NOPHome() {
        url = "https://nop-qa.portnov.com/";
        title = "Your store. Home page title";
    }
    //Locators
    @FindBy(xpath = "//a[@class = 'ico-cart']")
    private WebElement shoppingCart;

    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    private WebElement shoppingCartTitle;

    //Methods

    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void clickVerifyShoppingCart() {
        shoppingCart.click();
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //wait.until(ExpectedConditions.visibilityOf(shoppingCartTitle));
        waitForElement(shoppingCart);
       // assertThat(shoppingCart.getText()).isEqualTo("Shopping cart");
        assertThat(shoppingCartTitle.getText()).isEqualTo("Shopping cart");
    }

    //Generic Method to click ANY Product
    public void clickProduct(String text) {
        //Storing into an element
        WebElement element = driver.findElement( By.xpath("//*[text()='" + text + "']"));
        //Creating an instance of Webdriver Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //Waiting Until the element is visible
        wait.until(ExpectedConditions.visibilityOf(element));
        //Clicking element
        element.click();
    }
    //Generic Method to click ANY Category
    public void clickCategory(String category) {
        if(category.equals("Computers")){
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
        } else if (category.equals("Electronics")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();
        } else if (category.equals("Apparel")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).click();
        } else if (category.equals("Digital downloads")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).click();
        } else if (category.equals("Books")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")).click();
        } else if (category.equals("Jewelry")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")).click();
        } else if (category.equals("Gift Cards")) {
            driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")).click();
        } else {
            throw new IllegalArgumentException("Invalid category: " + category);
        }
    }

    public void clickSubcategory(String subcategory) {
        if (subcategory.equals("Desktops")) {
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/desktops']")).click();
        } else if (subcategory.equals("Notebooks")) {
            driver.findElement(By.xpath("//div[@class='block block-category-navigation']//a[@href='/notebooks']")).click();
        } else if (subcategory.equals("Software")) {
            driver.findElement(By.xpath("//di" +
                    "v[@class='block block-category-navigation']//a[@href='/software']")).click();
        } else {
            throw new IllegalArgumentException("Invalid subcategory: " + subcategory);
        }
    }
    public void goToShoppingCart() {
        shoppingCart.click();
    }

    public void clickSocials(String social) {

            driver.findElement(By.className(social)).click();

    }

    public String getMainWindowHandle(){
        return driver.getWindowHandle();

    }

    public void switchToWindow(){
       Set<String> windowHandles = driver.getWindowHandles();
       for(String handle: windowHandles){
           if(!handle.equals(getMainWindowHandle())){
               driver.switchTo().window(handle);
           }
       }
    }

    public void verifyTitle(String expectedTitle){
        assertThat(driver.getTitle()).containsIgnoringCase(expectedTitle);
    }
    //method overload
    public void verifyTitle(){
        assertThat(driver.getTitle()).isEqualTo(title);
    }

    public void closeWindow(){
        driver.close();
    }

    public void hoverOverElement(String text) throws InterruptedException {
        WebElement category = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='" + text +" ']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(category).perform();
        //Thread.sleep(2000);

    }

    public void verifySubcategory(String text) {
        WebElement subcategory = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" +text +"']"));
       // assertThat(subcategory.getText()).isEqualTo(text);
        //assertThat(subcategory.isDisplayed()).isTrue();
        assertThat(subcategory.isDisplayed()).isTrue();
    }
}
