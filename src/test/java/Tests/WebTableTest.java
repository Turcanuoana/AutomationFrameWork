package Tests;

import ObjectData.WebTableObject;
import Pages.ElementsPage;
import Pages.HomePage;
import Pages.WebTablePage;

import ShareData.Hooks;
import ShareData.ShareData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends Hooks {


    @Test
    public void TestMethod(){

//        WebElement elements= getDriver().findElement(By.xpath("//h5[text()='Elements']"));
//
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,450)", "");
//
//        Actions action= new Actions(getDriver());
//        action.moveToElement(elements).perform();
//        elements.click();
//
//        WebElement webTables=getDriver().findElement(By.xpath("//span[text()='Web Tables']"));
//        webTables.click();
        WebTableObject webTableObject=new WebTableObject(testData);

        HomePage homePage=new HomePage(getDriver());
        homePage.clickElements();


        ElementsPage elementsPage= new ElementsPage(getDriver());
        elementsPage.clickwebtables();


        WebTablePage webTablePage=new WebTablePage(getDriver());
        webTablePage.addnewentry(webTableObject);

//        List<WebElement> actualsEntries=getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer actualTableSize=actualsEntries.size();
//
//        WebElement add=getDriver().findElement(By.id("addNewRecordButton"));
//        add.click();
//
//        WebElement firstName=getDriver().findElement(By.id("firstName"));
//        String firstNameValue="Turcanu";
//        firstName.sendKeys(firstNameValue);
//
//        WebElement lastName=getDriver().findElement(By.id("lastName"));
//        String lastNameValue="Oana";
//        lastName.sendKeys(lastNameValue);
//
//        WebElement email=getDriver().findElement(By.id("userEmail"));
//        String emailValue="oana@yahoo.com";
//        email.sendKeys(emailValue);
//
//        WebElement age= getDriver().findElement(By.id("age"));
//        String ageValue="30";
//        age.sendKeys(ageValue);
//
//        WebElement salary=getDriver().findElement(By.id("salary"));
//        String salaryValue="10000";
//        salary.sendKeys(salaryValue);
//
//        WebElement departament= getDriver().findElement(By.id("department"));
//        String departamentValue="IT";
//        departament.sendKeys(departamentValue);
//
//        WebElement submit=getDriver().findElement(By.id("submit"));
//        submit.click();
//
//        List<WebElement> expectedEntries=getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        Integer expectedTableSize=expectedEntries.size();
//
//
//        Assert.assertTrue(actualTableSize+1==expectedTableSize);
//        String LastEntryTable=expectedEntries.get(actualTableSize).getText();
//        Assert.assertTrue(LastEntryTable.contains(firstNameValue));
//        Assert.assertTrue(LastEntryTable.contains(lastNameValue));
//        Assert.assertTrue(LastEntryTable.contains(emailValue));
//        Assert.assertTrue(LastEntryTable.contains(ageValue));
//        Assert.assertTrue(LastEntryTable.contains(salaryValue));
//        Assert.assertTrue(LastEntryTable.contains(departamentValue));
    }
}
