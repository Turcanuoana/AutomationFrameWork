package HelpMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertMethods {

    private WebDriver driver;

    public AlertMethods(WebDriver driver) {
        this.driver = driver;

    }
    private void waitforalert(){

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }
    public void acceptalert(){
        waitforalert();
        Alert alertOK = driver.switchTo().alert();
        alertOK.accept();
    }
    public void cancalalert(){
        waitforalert();
        Alert alertOkCancel=driver.switchTo().alert();
        alertOkCancel.dismiss();
    }
    public void fillalert(String value){
        waitforalert();
        Alert alertValue=driver.switchTo().alert();
        alertValue.sendKeys(value);
        alertValue.accept();
    }

}