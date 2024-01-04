package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowsPage extends BasePage{

    public WindowsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="tabButton")
    private WebElement newTabButton;

    @FindBy(id="windowButton")
    private WebElement newWindowButton;


    public  void innterracttab(){

        newTabButton.click();


        windowMethods.switchtospecificwindow(1);
        windowMethods.closecurrentwindow();
        windowMethods.switchtospecificwindow(0);

//        System.out.println("url: " + driver.getCurrentUrl());
//
//        List<String> tabs=new ArrayList<>(driver.getWindowHandles());//lista de tab-uri
//        driver.switchTo().window(tabs.get(1));
//
//        System.out.println("url: " + driver.getCurrentUrl());
//
//        driver.close();
//
//        driver.switchTo().window(tabs.get(0));
    }

    public void interractwindow(){
        newWindowButton.click();

        windowMethods.switchtospecificwindow(1);
        windowMethods.closecurrentwindow();
        windowMethods.switchtospecificwindow(0);

//        System.out.println("url: " + driver.getCurrentUrl());
//
//        List<String>windows=new ArrayList<>(driver.getWindowHandles());//lista de tab-uri
//        driver.switchTo().window(windows.get(1));
//
//        System.out.println("url: " + driver.getCurrentUrl());
//
//        driver.close();
//
//        driver.switchTo().window(windows.get(0));
    }
}
