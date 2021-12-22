package decoratorElement;

import org.openqa.selenium.WebElement;

public class TextReceive extends AbstractElement{
    public TextReceive(WebElement element) {
        super(element);
    }

    public String getText(){
        return element.getText();
    }
}
