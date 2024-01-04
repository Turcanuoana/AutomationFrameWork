package Pages;

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



    public void addnewentry(String firstNameValue,  String lastNameValue, String emailValue, String ageValue, String salaryValue, String departamentValue){


    Integer actualTableSize=actualsEntries.size();
//    add.click();
    elementMethods.clickElement(add);
//    firstName.sendKeys(firstNameValue);
    elementMethods.fillElement(firstName,firstNameValue);
//    lastName.sendKeys(lastNameValue);
    elementMethods.fillElement(lastName,lastNameValue);
//    email.sendKeys(emailValue);
    elementMethods.fillElement(email,emailValue);
//    age.sendKeys(ageValue);
    elementMethods.fillElement(age,ageValue);
//    salary.sendKeys(salaryValue);
    elementMethods.fillElement(salary,salaryValue);
//    departament.sendKeys(departamentValue);
    elementMethods.fillElement(departament,departamentValue);
//    submit.click();
    elementMethods.clickElement(submit);

    validatenewentry(actualTableSize,firstNameValue,lastNameValue,emailValue,ageValue,salaryValue,departamentValue);
}

private void validatenewentry(Integer actualTableSize,String firstNameValue,  String lastNameValue, String emailValue, String ageValue, String salaryValue, String departamentValue){

    Integer expectedTableSize=actualsEntries.size();
    Assert.assertTrue(actualTableSize+1==expectedTableSize);
    String LastEntryTable=actualsEntries.get(actualTableSize).getText();
    Assert.assertTrue(LastEntryTable.contains(firstNameValue));
    Assert.assertTrue(LastEntryTable.contains(lastNameValue));
    Assert.assertTrue(LastEntryTable.contains(emailValue));
    Assert.assertTrue(LastEntryTable.contains(ageValue));
    Assert.assertTrue(LastEntryTable.contains(salaryValue));
    Assert.assertTrue(LastEntryTable.contains(departamentValue));
}

}
