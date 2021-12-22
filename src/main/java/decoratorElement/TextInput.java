package decoratorElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TextInput extends AbstractElement{
    public TextInput(WebElement element) {
        super(element);
    }

    public void sendTextInEmptyField(String sendKeyword){
        element.clear();
        element.sendKeys(sendKeyword);
    }

    public void submit() {
        element.sendKeys(Keys.ENTER);
    }
}
