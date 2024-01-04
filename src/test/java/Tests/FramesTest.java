package Tests;

import Pages.AlertFrameWindowPage;
import Pages.FramePage;
import Pages.HomePage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FramesTest extends ShareData {



    @Test
    public void testMethod() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

    //    WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
     //   frames.click();



        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.ClickFrames();

        FramePage framePage=new FramePage(getDriver());
        framePage.interractfirstiframe();
        framePage.interractsecondiframe();


//        driver.switchTo().frame("frame1");
//
//        WebElement frameText= driver.findElement(By.id("sampleHeading"));
//        System.out.println(frameText.getText());
//
//        driver.switchTo().defaultContent();//intoarce focusul pe pagina mare

//        driver.switchTo().frame("frame2");
//
//        WebElement frameText2= driver.findElement(By.id("sampleHeading"));
//        System.out.println(frameText2.getText());


    }
}
