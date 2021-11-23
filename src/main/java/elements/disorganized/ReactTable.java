package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class ReactTable extends BaseElement {

    public ReactTable() {
        super(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]"),
                "React table");
    }

}
