package decoratorElement;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.WebDriverManager;

public class Button extends AbstractElement{
    public Button(WebElement element) {
        super(element);
    }

    public void safeClick(){
        try{
            super.click();
        }catch (ElementClickInterceptedException e){
            new WebDriverWait(WebDriverManager.getInstance(),10).until(ExpectedConditions.elementToBeClickable(element));
            super.click();
        }
    }
}
