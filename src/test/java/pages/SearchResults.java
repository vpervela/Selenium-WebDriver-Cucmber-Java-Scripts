package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SearchResults extends Page {
    //create constructor
    public SearchResults() {
        url = "https://www.usps.com/search/results.htm?keyword=boxes&PNO=1&Nrpp=&navFolder=&navSteps=0&navDisplayName=&mainDirName=";
        title = "Search Results Page | USPS";
    }

    //selectors for filter
//    @FindBy(xpath = "//div[@class='search-results']")
    @FindBy(xpath = "//ul[@id='records']//li")
    private List<WebElement> resultItems;

    @FindBy(css = ".spinner-content")
    private WebElement spinner;



    //methods to interact with the page

    private WebElement filterElement(String filter) {
        return driver.findElement(By.xpath("//label[text()='" + filter + "']"));
    }
    public void filterResults(String text) {
        wait.until(ExpectedConditions.invisibilityOf(spinner));
        filterElement(text).click();

    }

    public int getResultCount() {
        wait.until(ExpectedConditions.invisibilityOf(spinner));
        return resultItems.size();
    }
}
