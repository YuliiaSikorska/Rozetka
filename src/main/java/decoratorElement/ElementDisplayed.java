package decoratorElement;

import org.openqa.selenium.WebElement;

public class ElementDisplayed extends AbstractElement{
    public ElementDisplayed(WebElement element) {
        super(element);
    }
    public boolean isElementVisible(){
        return element.isDisplayed();
    }
}
