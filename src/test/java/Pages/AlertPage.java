package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertPage extends BasePage{

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "alertButton")
    private WebElement button1;

    @FindBy(id = "timerAlertButton")
    private WebElement alertDelayButton;

    @FindBy(id = "confirmButton")
    private WebElement alertOkCancelButton;

    @FindBy(id = "promtButton")
    private WebElement alertValueButton;


    public void interractAlertOK() {
        button1.click();
        alertMethods.acceptalert();
//        Alert alertOK = driver.switchTo().alert();
//        alertOK.accept();

    }
public void interractAlertDelay(){
        alertDelayButton.click();
        alertMethods.acceptalert();

//    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.alertIsPresent());
//
//    Alert alertdelay=driver.switchTo().alert();
//    alertdelay.accept();
}
 public void interractAlertDismiss(){
     alertOkCancelButton.click();
     alertMethods.cancalalert();

//     Alert alertOkCancel=driver.switchTo().alert();
//     alertOkCancel.dismiss();
 }
 public void interractAlertValue(String value){
     alertValueButton.click();
     alertMethods.fillalert(value);

//     Alert alertValue=driver.switchTo().alert();
//     alertValue.sendKeys(value);
//     alertValue.accept();

 }
}
