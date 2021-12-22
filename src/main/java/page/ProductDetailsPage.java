package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductDetailsPage extends BasePage {
    @FindBy(xpath = "//app-product-buy-btn//button[contains(@class,'buy-button')]")
    private WebElement buyButton;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnBuyButton() {
        buyButton.click();
    }

}
