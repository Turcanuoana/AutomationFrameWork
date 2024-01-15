package Pages;

import ObjectData.WebTableObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.util.List;

public class WebTablePage extends BasePage{
    public WebTablePage(WebDriver driver) {
        super(driver);
    }
@FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    private List<WebElement> actualsEntries;

    @FindBy(id="addNewRecordButton")
    private WebElement add;

    @FindBy(id="firstName")
private WebElement firstName;

    @FindBy(id="lastName")
    private  WebElement lastName;

    @FindBy(id="userEmail")
    private WebElement email;

    @FindBy(id="age")
    private  WebElement age;

    @FindBy(id="salary")
    private WebElement salary;

    @FindBy(id="department")
    private WebElement departament;

    @FindBy(id="submit")
    private WebElement submit;



    public void addnewentry(WebTableObject webTableObject){


    Integer actualTableSize=actualsEntries.size();
//    add.click();
    elementMethods.clickElement(add);
//    firstName.sendKeys(firstNameValue);
    elementMethods.fillElement(firstName,webTableObject.getFirstNameValue());
//    lastName.sendKeys(lastNameValue);
    elementMethods.fillElement(lastName,webTableObject.getLastNameValue());
//    email.sendKeys(emailValue);
    elementMethods.fillElement(email,webTableObject.getEmailValue());
//    age.sendKeys(ageValue);
    elementMethods.fillElement(age,webTableObject.getAgeValue());
//    salary.sendKeys(salaryValue);
    elementMethods.fillElement(salary,webTableObject.getSalaryValue());
//    departament.sendKeys(departamentValue);
    elementMethods.fillElement(departament,webTableObject.getDepartamentValue());
//    submit.click();
    elementMethods.clickElement(submit);

    validatenewentry(actualTableSize, webTableObject);
}

private void validatenewentry(Integer actualTableSize,WebTableObject webTableObject){

    Integer expectedTableSize=actualsEntries.size();
    Assert.assertTrue(actualTableSize+1==expectedTableSize);
    String LastEntryTable=actualsEntries.get(actualTableSize).getText();
    Assert.assertTrue(LastEntryTable.contains(webTableObject.getFirstNameValue()));
    Assert.assertTrue(LastEntryTable.contains(webTableObject.getLastNameValue()));
    Assert.assertTrue(LastEntryTable.contains(webTableObject.getEmailValue()));
    Assert.assertTrue(LastEntryTable.contains(webTableObject.getSalaryValue()));
    Assert.assertTrue(LastEntryTable.contains(webTableObject.getDepartamentValue()));
}

}
