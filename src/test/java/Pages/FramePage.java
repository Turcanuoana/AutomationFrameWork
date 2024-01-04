package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FramePage extends BasePage{

    public FramePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement frames;

    @FindBy(id="sampleHeading")
    private WebElement frameText;



    public  void interractfirstiframe(){
    frameMethods.switchToframe("frame1");
    //driver.switchTo().frame("frame1");
    System.out.println(frameText.getText());
    //driver.switchTo().defaultContent();
        frameMethods.switchMainframe();
    }

    public  void interractsecondiframe(){
        frameMethods.switchToframe("frame2");
        System.out.println(frameText.getText());

    }

}


