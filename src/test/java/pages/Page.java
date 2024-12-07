package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.DriverFactory;

import javax.swing.*;
import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Page {
   protected String url;
   protected String title;
   protected WebDriver driver;
   protected Actions actions;
   protected WebDriverWait wait;

    public Page() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        actions = new Actions(driver);

    }

    public void openURL() {
        //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    public String getTitle() {
        return title;
    }
}
