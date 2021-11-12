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


    public HomePage() {
    super(uniqueElement);
    }
    public static BaseElement getUniqueElement() {
        return uniqueElement;
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
}
