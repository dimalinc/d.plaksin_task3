package elements;

import org.openqa.selenium.By;

public class ImageJoinNow extends BaseElement{

    private By locator = By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img");
    private String elementName = "Join now image";


    public ImageJoinNow() {
        super();
        super.setLocator(locator);
        super.setElementName(elementName);
    }






}
