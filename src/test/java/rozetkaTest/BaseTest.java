package rozetkaTest;
import bisinessobject.HomePageBO;
import bisinessobject.ProductDetailsPageBO;
import bisinessobject.SearchResultPageBO;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import page.CheckoutPage;
import util.PropertiesReader;
import util.WebDriverManager;

public class BaseTest {
    private WebDriver driver;
    PropertiesReader propertiesReader = new PropertiesReader();


    @BeforeMethod
    public void testsSetUp() {
        String url = propertiesReader.getUrl();
        driver = WebDriverManager.getInstance();
        driver.get(url);
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown() {
        WebDriverManager.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public CheckoutPage getCheckoutPage() {
        return new CheckoutPage(getDriver());
    }

    public ProductDetailsPageBO getProductDetailsPageBO(){
        return new ProductDetailsPageBO(getDriver());
    }

    public SearchResultPageBO getSearchResultPageBO(){
        return new SearchResultPageBO(getDriver());
    }

    public HomePageBO getHomePageBO(){
        return new HomePageBO(getDriver());
    }

}
