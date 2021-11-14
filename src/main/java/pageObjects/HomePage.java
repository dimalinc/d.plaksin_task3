package pageObjects;

import elements.*;

public class HomePage extends BaseForm{

    private static final BaseElement uniqueElement = new ImageJoinNow();

    private ImageJoinNow imageJoinNow = new ImageJoinNow();
    private Button_AlertsFrameAndWindows button_alertsFrameAndWindows = new Button_AlertsFrameAndWindows();
    private Button_Elements button_elements = new Button_Elements();
    private Button_AlertsFrameAndWindows_Alerts button_alertsFrameAndWindows_alerts = new Button_AlertsFrameAndWindows_Alerts();
    private Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert button_alertsFrameAndWindows_alerts_clickButtonToSeeAlert = new Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert();
    private Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears button_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears = new Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears();
    private Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears alertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears = new Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears();
    private Button_AlertsFrameAndWindows_NestedFrames button_alertsFrameAndWindows_nestedFrames = new Button_AlertsFrameAndWindows_NestedFrames();
    private Button_AlertsFrameAndWindows_BrowserWindows button_alertsFrameAndWindows_browserWindows = new Button_AlertsFrameAndWindows_BrowserWindows();
    private Button_NewTab button_newTab = new Button_NewTab();
    private Button_Elements_Links button_elements_links = new Button_Elements_Links();
    private Button_Elements_LeftPanel button_elements_leftPanel = new Button_Elements_LeftPanel();
    private HomeLink homeLink = new HomeLink();


    public HomePage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
    }

    public Button_AlertsFrameAndWindows_NestedFrames getButton_alertsFrameAndWindows_nestedFrames() {
        return button_alertsFrameAndWindows_nestedFrames;
    }

    public Button_AlertsFrameAndWindows_Alerts_OnButtonClickPROMPTboxAppears getAlertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears() {
        return alertsFrameAndWindows_alerts_onButtonClickPROMPTboxAppears;
    }

    public Button_AlertsFrameAndWindows_Alerts_OnButtonClickConfirmBoxAppears getButton_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears() {
        return button_alertsFrameAndWindows_alerts_onButtonClickConfirmBoxAppears;
    }

    public Button_AlertsFrameAndWindows_Alerts_ClickButtonToSeeAlert getButton_alertsFrameAndWindows_alerts_clickButtonToSeeAlert() {
        return button_alertsFrameAndWindows_alerts_clickButtonToSeeAlert;
    }

    public ImageJoinNow getImageJoinNow() {
        return imageJoinNow;
    }

    public Button_AlertsFrameAndWindows getButton_alertsFrameAndWindows() {
        return button_alertsFrameAndWindows;
    }

    public Button_AlertsFrameAndWindows_Alerts getButton_alertsFrameAndWindows_alerts() {
        return button_alertsFrameAndWindows_alerts;
    }

    public Button_Elements getButton_elements() {
        return button_elements;
    }

    public Button_AlertsFrameAndWindows_BrowserWindows getButton_alertsFrameAndWindows_browserWindows() {
        return button_alertsFrameAndWindows_browserWindows;
    }

    public Button_NewTab getButton_newTab() {
        return button_newTab;
    }

    public Button_Elements_Links getButton_elements_links() {
        return button_elements_links;
    }

    public Button_Elements_LeftPanel getButton_elements_leftPanel() {
        return button_elements_leftPanel;
    }

    public HomeLink getHomeLink() {
        return homeLink;
    }

}
