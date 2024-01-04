package Tests;

import Pages.AlertFrameWindowPage;
import Pages.HomePage;
import Pages.WindowsPage;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WindowTest extends ShareData {

    @Test
    public void testMethod() {

        HomePage homePage=new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

//        WebElement browserWindows = getDriver().findElement(By.xpath("//span[text()='Browser Windows']"));
//        browserWindows.click();

        AlertFrameWindowPage alertFrameWindowPage=new AlertFrameWindowPage(getDriver());
        alertFrameWindowPage.clickwindows();

        WindowsPage windowsPage=new WindowsPage(getDriver());
        windowsPage.innterracttab();
        windowsPage.interractwindow();



//        WebElement newTabButton= getDriver().findElement(By.id("tabButton"));
//        newTabButton.click();
//
//        System.out.println("url: " + getDriver().getCurrentUrl());
//
//        List<String>tabs=new ArrayList<>(getDriver().getWindowHandles());//lista de tab-uri
//        getDriver().switchTo().window(tabs.get(1));
//
//        System.out.println("url: " + getDriver().getCurrentUrl());
//
//        getDriver().close();
//
//        getDriver().switchTo().window(tabs.get(0));
//        WebElement newWindowButton=getDriver().findElement(By.id("windowButton"));
//        newWindowButton.click();
//
//        System.out.println("url: " + getDriver().getCurrentUrl());
//
//        List<String>windows=new ArrayList<>(getDriver().getWindowHandles());//lista de tab-uri
//        getDriver().switchTo().window(windows.get(1));
//
//        System.out.println("url: " + getDriver().getCurrentUrl());
//
//        getDriver().close();
//
//        getDriver().switchTo().window(windows.get(0));






    }
}
