package bisinessobject;

import org.openqa.selenium.WebDriver;
import page.ProductDetailsPage;

public class ProductDetailsPageBO {
    private ProductDetailsPage productDetailsPage;

    public ProductDetailsPageBO(WebDriver driver) {
        productDetailsPage = new ProductDetailsPage(driver);
    }

    public void byuOption() {
        productDetailsPage.clickOnBuyButton();
    }
}
