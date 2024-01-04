package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.plaf.PanelUI;

public class AlertFrameWindowPage extends BasePage{
    public AlertFrameWindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    private WebElement alerts;
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement frames;

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindows;



    public void clickAlerts() {
        alerts.click();
    }

    public void ClickFrames() {
        frames.click();
    }

    public void clickwindows() {
        browserWindows.click();
    }
}
