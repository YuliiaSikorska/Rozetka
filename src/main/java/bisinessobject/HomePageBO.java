package bisinessobject;

import org.openqa.selenium.WebDriver;
import page.HomePage;


public class HomePageBO {
    private HomePage homePage;

    public HomePageBO(WebDriver driver) {
        homePage = new HomePage(driver);
    }

    public void searchOfProduct(String item) {
        homePage.inputIntoSearchForm(item);
    }
}
