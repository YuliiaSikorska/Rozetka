package bisinessobject;

import org.openqa.selenium.WebDriver;
import page.SearchResultPage;

public class SearchResultPageBO {
    private SearchResultPage searchResultPage;

    public SearchResultPageBO(WebDriver driver) {
        searchResultPage = new SearchResultPage(driver);
    }

    public void searchResult(String brand) {
        searchResultPage.clickSearchBrand(brand);
        searchResultPage.clickFirstOfBrandList();
        searchResultPage.clickFirstItemsOfProductList();
    }
}
