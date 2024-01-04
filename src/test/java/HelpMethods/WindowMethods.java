package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {
   private WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;

    }

    public void switchtospecificwindow(Integer size){
        List<String> tabs=new ArrayList<>(driver.getWindowHandles());//lista de tab-uri
        driver.switchTo().window(tabs.get(1));//ne mutam focusul pe un tab nou
        System.out.println("url: " + driver.getCurrentUrl());
    }

    public void closecurrentwindow(){
        driver.close();

    }

}
