package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import support.DriverFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Page {
   protected String url;
   protected String title;
   protected WebDriver driver;

    public Page() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    public void openURL() {
        driver.get(url);
    }

    public String getTitle() {
        return title;
    }
}
