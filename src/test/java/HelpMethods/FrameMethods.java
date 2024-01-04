package HelpMethods;

import org.openqa.selenium.WebDriver;

public class FrameMethods {
    private WebDriver driver;

    public FrameMethods(WebDriver driver) {
        this.driver = driver;

    }
    public void switchToframe(String value){
        driver.switchTo().frame(value);
    }

    public void switchMainframe(){
        driver.switchTo().defaultContent();
    }
}
