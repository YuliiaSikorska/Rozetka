package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverManager {
    public static Logger logger = Logger.getLogger(WebDriverManager.class);
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private WebDriverManager() {
    }

    public static WebDriver getInstance() {
        if (webDriverThreadLocal.get() != null) {
            return webDriverThreadLocal.get();
        }

        PropertiesReader propertiesReader = new PropertiesReader();
        String driverName = propertiesReader.getDriverName();
        String driverLocation = propertiesReader.getDriverLocation();
        System.setProperty(driverName, driverLocation);
        WebDriver driver = new ChromeDriver() {
            {
                manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            }
        };
        webDriverThreadLocal.set(driver);
        return webDriverThreadLocal.get();

    }

    public static void close() {
        try {
            if (webDriverThreadLocal != null) {
                webDriverThreadLocal.get().quit();
            }
        } catch (Exception e) {
            logger.error("error: can't close" + e);
        } finally {
            webDriverThreadLocal.remove();
        }
    }
}
