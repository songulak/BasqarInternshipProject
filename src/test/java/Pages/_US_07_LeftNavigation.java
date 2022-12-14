package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _US_07_LeftNavigation extends _US_00_Parent {
    WebElement myElement;

    public _US_07_LeftNavigation() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Messaging']")
    private WebElement messaging;
    @FindBy(xpath = "//span[text()='Notifications']")
    private WebElement notifications;

    @FindBy(linkText = "Parameters")
    private WebElement parametersButton;

    @FindBy(linkText = "Document Types")
    private WebElement documentsTypesButton;

    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {

            case "messaging":
                myElement = messaging;
                break;

            case "notifications":
                myElement = notifications;
                break;

            case "documentsTypesButton":
                myElement = documentsTypesButton;
                break;

        }
        clickFunction(myElement);
    }


}
