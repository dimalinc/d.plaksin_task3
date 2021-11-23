package pageObjects;

import elements.*;
import elements.baseicelements.Button;
import elements.baseicelements.Image;
import elements.baseicelements.Link;
import org.openqa.selenium.By;

public class HomePage extends BaseForm{

    private static final BaseElement uniqueElement = new Image(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img"),
            "Join now image");
    private Image imageJoinNow = new Image(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img"),
            "Join now image");
    private Button button_alertsFrameAndWindows = new Button(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"),
            "Alerts, Frame & Windows");
    private Button button_elements = new Button(By.xpath("//h5[contains(text(),'Elements')]"),
            "Elements");
    private Button button_alertsFrameAndWindows_alerts = new Button(By.xpath("//span[contains(text(),'Alerts')]"),
            "Alerts (in Al.., Frame & Windows");
    private Button button_alertsFrameAndWindows_alerts_clickButtonToSeeAlert = new Button(By.xpath("//button[@id='alertButton']"),
            "Click Button to see alert");
    private Button button_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears = new Button(By.xpath("//button[@id='confirmButton']"),
            "On button click, confirm box will appear");
    private Button alertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears = new Button(By.xpath("//button[@id='promtButton']"),
            "On button click, confirm box will appear");
    private Button button_alertsFrameAndWindows_nestedFrames = new Button(By.xpath("//span[contains(text(),'Nested Frames')]"),
            "Nested Frames (in Al.., Frame & Windows");
    private Button button_alertsFrameAndWindows_browserWindows = new Button(By.xpath("//span[contains(text(),'Browser Windows')]"),
            "Browser Windows (in Al.., Frame & Windows");
    private Button button_newTab = new Button(By.xpath("//button[@id='tabButton']"),
            "Button New Tab in Browser Windows");
    private Button button_elements_links = new Button(By.xpath("//span[text()='Links']"),
            "Elements-Links");
    private Button button_elements_leftPanel = new Button(By.xpath("//*[contains(text(),'Elements')]"),
            "Elements in the Left Panel");
    private Link homeLink = new Link(By.xpath("//a[@id='simpleLink']"),
            "Home Link on Elements-Links page");
    private Button button_close_fixedban = new Button(By.xpath("//*[@id=\"close-fixedban\"]/img"),
            "Close lower banner");
    private Button button_widgets = new Button(By.xpath("//h5[contains(text(),'Widgets')]"),
            "Widgets button");
    private Button button_widgets_datePicker = new Button(By.xpath("//span[contains(text(),'Date Picker')]"),
            "Date Picker button");

    public Button getButton_widgets_datePicker() {
        return button_widgets_datePicker;
    }
    public Button getButton_widgets() {
        return button_widgets;
    }
    public HomePage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }
    public Button getButton_alertsFrameAndWindows_nestedFrames() {
        return button_alertsFrameAndWindows_nestedFrames;
    }
    public Button getAlertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears() {
        return alertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears;
    }
    public Button getButton_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears() {
        return button_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears;
    }
    public Button getButton_alertsFrameAndWindows_alerts_clickButtonToSeeAlert() {
        return button_alertsFrameAndWindows_alerts_clickButtonToSeeAlert;
    }
    public Image getImageJoinNow() {
        return imageJoinNow;
    }
    public Button getButton_alertsFrameAndWindows() {
        return button_alertsFrameAndWindows;
    }
    public Button getButton_alertsFrameAndWindows_alerts() {
        return button_alertsFrameAndWindows_alerts;
    }
    public Button getButton_elements() {
        return button_elements;
    }
    public Button getButton_alertsFrameAndWindows_browserWindows() {
        return button_alertsFrameAndWindows_browserWindows;
    }
    public Button getButton_newTab() {
        return button_newTab;
    }
    public Button getButton_elements_links() {
        return button_elements_links;
    }
    public Button getButton_elements_leftPanel() {
        return button_elements_leftPanel;
    }
    public Link getHomeLink() {
        return homeLink;
    }
    public Button getButton_close_fixedban() {
        return button_close_fixedban;
    }
}
