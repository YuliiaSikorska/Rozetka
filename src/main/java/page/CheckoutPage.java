package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'sum-price')]")
    private WebElement productPrice;

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getProductPrice() {
        return productPrice.getText();
    }
}
