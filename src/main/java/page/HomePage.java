package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchField;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void inputIntoSearchForm(final String sendKeyword) {
        searchField.sendKeys(sendKeyword + Keys.ENTER);
    }

}
