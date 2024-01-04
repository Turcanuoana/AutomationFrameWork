package Tests;

import Pages.AlertFrameWindowPage;
import Pages.AlertPage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.w3c.dom.Text;

import java.time.Duration;

public class AlertsTest extends ShareData {


    @Test
    public void testMethod() {
        //desig patern= sablon care defineste o structura, sa fie aplicata si respectata de toti membrii
        //page object model=reduce codul duplicat

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickAlerts();

        AlertPage alertPage= new AlertPage(getDriver());
        alertPage.interractAlertOK();
        alertPage.interractAlertDelay();
        alertPage.interractAlertDismiss();
        alertPage.interractAlertValue("Text");

    }
}
