package decoratorElement;

import org.openqa.selenium.WebElement;

public class Checkbox extends AbstractElement{
    public Checkbox(WebElement element) {
        super(element);
    }

    public void setChecked(boolean shouldBeChecked){
        if((element.isSelected() && !shouldBeChecked) || (!element.isSelected() && shouldBeChecked)){
    element.click();
        }else{
            System.out.println("Element is already 'checked'" + shouldBeChecked);
        }
    }

    public boolean isChecked(){
        return element.isSelected();
    }
}
