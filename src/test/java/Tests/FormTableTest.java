package Tests;

import ObjectData.FormTableObject;
import Pages.FormsPage;
import Pages.HomePage;
import Pages.PracticeFormsPage;
import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ShareData.Hooks;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FormTableTest extends Hooks {


    @Test
    public void testMethod(){

        FormTableObject formTableObject=new FormTableObject(testData);

//        WebElement Forms= getDriver().findElement(By.xpath("//h5[text()='Forms']"));
//        Forms.click();public FormTableObject(HashMap<String,String> testData){
//        populateObject(testData);
//
//    }
////facem o metoda care sa mapeze valorile din proprietes la valorile din clasa
//
//    private void populateObject(HashMap<String,String> testData){
//        for (String Key:testData.keySet()){
//            switch (Key){
//                case "firstNameValue":
//                    setFirstNameValue(testData.get(Key));
//                    break;
//                case "lastNameValue":
//                    setLastNameValue(testData.get(Key));
//                    break;
//                case "emailValue":
//                    setEmailValue(testData.get(Key));
//                    break;
//                case "mobileValue":
//                    setMobileValue(testData.get(Key));
//                    break;
//                case "subjectsValue":
//                    setSubjectsValue(testData.get(Key));
//                    break;
//                case "addressValue":
//                    setAddressValue(testData.get(Key));
//                    break;
//                case "stateValue":
//                    setStateValue(testData.get(Key));
//                    break;
//                case "cityValue":
//                    setCityValue(testData.get(Key));
//                    break;
//                case "expectedMessage":
//                    setExpectedMessage(testData.get(Key));
//                    break;
//
//            }
//        }
        HomePage homePage=new HomePage(getDriver());
        homePage.clickforms();

        FormsPage formsPage=new FormsPage(getDriver());
        formsPage.clickPracticeForm();

//        WebElement practiceForms=getDriver().findElement(By.xpath("//span[text()='Practice Form']"));
//        practiceForms.click();


        PracticeFormsPage practiceFormsPage=new PracticeFormsPage(getDriver());
        practiceFormsPage.fillPracticeForm(formTableObject);


//        List<String>FormValues=practiceFormsPage.getValuesForms();
//        practiceFormsPage.clickSubmit();

//         practiceFormsPage.validatePracticeForm(expectedMessage,firstNameValue, lastNameValue, emailValue,
//                 FormValues.get(0),mobileValue,subjectsValue, FormValues.get(1),addressValue, stateValue,cityValue);

         practiceFormsPage.clickclose();



    }
}
