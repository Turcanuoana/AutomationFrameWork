package Tests;

import ObjectData.AlertObject;
import Pages.AlertFrameWindowPage;
import Pages.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ShareData.Hooks;
import org.w3c.dom.Text;

import java.time.Duration;

public class AlertsTest extends Hooks {


    @Test
    public void testMethod() {

        AlertObject alertObject= new AlertObject(testData);
        //desig patern= sablon care defineste o structura, sa fie aplicata si respectata de toti membrii
        //page object model=reduce codul duplicat

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

        JavascriptExecutor JS=(JavascriptExecutor)getDriver();
        JS.executeScript("window.scroll(0,450)","");

        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage= new AlertPage(getDriver());
        alertPage.interractAlertOK();
        alertPage.interractAlertDelay();
        alertPage.interractAlertDismiss();
        alertPage.interractAlertValue(alertObject);

    }
}
