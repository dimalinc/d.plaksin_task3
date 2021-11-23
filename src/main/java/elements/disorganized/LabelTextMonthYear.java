package elements.disorganized;

import elements.BaseElement;
import org.openqa.selenium.By;

public class LabelTextMonthYear extends BaseElement {

    public LabelTextMonthYear() {
        super(By.xpath("//*[@class=\"react-datepicker__current-month react-datepicker__current-month--hasYearDropdown react-datepicker__current-month--hasMonthDropdown\"]"),
                "Month, Year label");
    }



}
