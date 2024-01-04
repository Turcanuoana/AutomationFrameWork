package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertsFrameWindow;

    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elements;

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceforms;



    public void  clickAlertFrameWindow(){
        alertsFrameWindow.click();
    }
public void clickforms() {
    practiceforms.click();
}
         public void clickElements(){
        elements.click();

}
}
