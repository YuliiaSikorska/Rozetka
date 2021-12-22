package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//div[@data-filter-name='producer']//input[contains(@class,'sidebar')]")
    private WebElement searchBrand;

    @FindBy(xpath = "//li[contains(@class,'catalog-grid__cell')]")
    private List<WebElement> selectFirstItemsOfList;

    @FindBy(xpath = "//div[@data-filter-name='producer']//li[contains(@class,'checkbox-filter')]")
    private List<WebElement> brandListFilter;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchBrand(final String sendKeyword) {
        searchBrand.sendKeys(sendKeyword + Keys.ENTER);
    }

    public void waitForCheckbox() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeSelected(searchBrand));
    }

    public void clickFirstItemsOfProductList() {
        selectFirstItemsOfList.get(0).click();
    }

    public void clickFirstOfBrandList() {
        brandListFilter.get(0).click();
    }

}
