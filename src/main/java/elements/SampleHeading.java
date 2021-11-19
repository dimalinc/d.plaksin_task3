package elements;

import org.openqa.selenium.By;

public class SampleHeading extends BaseElement{

    public SampleHeading() {
        super(By.xpath("//h1[@id='sampleHeading']"),
                "Sample Page heading");
    }

}
