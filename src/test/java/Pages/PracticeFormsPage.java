package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormsPage extends BasePage{
    public PracticeFormsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id= "firstName")
    private WebElement firsName;

    @FindBy(id="lastName")
    private WebElement lastName;

    @FindBy(id= "userEmail")
    private WebElement email;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement gender;

    @FindBy(id="userNumber")
    private WebElement mobile;

    @FindBy(id= "subjectsInput")
    private WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement reading;

    @FindBy(id="uploadPicture")
            private WebElement chosefile;

    @FindBy(id="currentAddress")
    private WebElement adress;

    @FindBy(id="state")
    private WebElement state;

    @FindBy(id="react-select-3-input")
    private WebElement selectstate;

    @FindBy(id="city")
    private WebElement city;

    @FindBy(id="react-select-4-input")
    private WebElement selectcity;

    @FindBy(id="submit")
    private WebElement submittbutton;

    @FindBy(id="example-modal-sizes-title-lg")
    private WebElement thanksmessage;

    @FindBy(css=".table-dark>tbody>tr")
    private WebElement validationtable;

    @FindBy(id="closeLargeModal")
    private WebElement closebutton;



    public void fillPracticeForm(String firstname,String lastname,String email, String mobile, String subjects, String address, String state, String city){
        fillfirstName(firstname);
        fillLastName(lastname);
        fillemail(email);
        fillgender();
        fillmobile(mobile);
        fillsubjects(subjects);
        fillreading();
        filladdress(address);
        fillstate(state);
        fillcity(city);



    }

    public List<String>getValuesForms(){
        List<String>formValues=new ArrayList<>();
        formValues.add(gender.getText());
        formValues.add(reading.getText());
        return formValues;

    }
    public void fillfirstName(String firstnamevalue){
        elementMethods.fillElement(firsName,firstnamevalue);
       // firsName.sendKeys(firstnamevalue);
    }

    public void fillLastName(String lastnameavalue){
        lastName.sendKeys(lastnameavalue);

    }
    public void fillemail(String emailaddress){
        email.sendKeys(emailaddress);
    }

    public void fillgender(){
        elementMethods.clickElement(gender);
       // gender.click();
    }
public void fillmobile(String mobilevalue){
        mobile.sendKeys(mobilevalue);

}
public void fillsubjects(String subjectsvalue){
        elementMethods.fillElement(subjects,subjectsvalue,Keys.ENTER);
       // subjects.sendKeys(subjectvalue);
       // subjects.sendKeys(Keys.ENTER);

}
public void fillreading(){
        reading.click();
}

public void fillfile(){
        WebElement choosefile=driver.findElement(By.id("uploadPicture"));
    File file= new File("src/test/resources/th.jpeg");
    choosefile.sendKeys(file.getAbsolutePath());
}
public void filladdress(String addresvalue){
        adress.sendKeys(addresvalue);
}

public void fillstate(String statevelue){
    elementMethods.scrollBypixels(0,450);
    elementMethods.clickElement(state);
    elementMethods.fillElement(selectstate,statevelue,Keys.ENTER);

//    JavascriptExecutor js = null;
//    js.executeScript("window.scrollBy(0,450)", "");
//    state.click();
//    selectstate.sendKeys(statevelue);
//    selectstate.sendKeys(Keys.ENTER);
}

public void fillcity(String cityvalue){
        elementMethods.clickElement(city);
        elementMethods.fillElement(selectcity,cityvalue, Keys.ENTER);
//        city.click();
//        selectcity.sendKeys(cityvalue);
//        selectcity.sendKeys(Keys.ENTER);
}
public void fillsubmit(){
        elementMethods.clickJSelement(submittbutton);

//        JavascriptExecutor jse=(JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].click();",submittbutton);
}

public void clickclose(){
        closebutton.sendKeys(Keys.ENTER);
}

public void validatePracticeForm(String expectedmessage, String firstnamevalue, String lastnamevalue, String emailadress,
                                 String gendervalue, String mobilevalue,String subjectsvalue, String readingvalue, String adressvalue,
                                 String statevalue, String cityvalue){
    DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd MMMM,yyyy");
    LocalDateTime now = LocalDateTime.now();
    String dateofbirthValue=dtf.format(now);
    elementMethods.validateElementmessage(thanksMessage,expectedmessage);
}
    WebElement thanksMessage= driver.findElement(By.id("example-modal-sizes-title-lg"));

//    String actualMessage=thanksMessage.getText();
//
//    Assert.assertEquals(actualMessage,expectedMessage);
//
//     Assert.assertTrue(ValidationTable.get(0).getText().contains("Student Name"));
//        Assert.assertTrue(ValidationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));
//
//        Assert.assertTrue(ValidationTable.get(1).getText().contains("Student Email"));
//        Assert.assertTrue(ValidationTable.get(1).getText().contains(emailValue));
//
//        Assert.assertTrue(ValidationTable.get(2).getText().contains("Gender"));
//        Assert.assertTrue(ValidationTable.get(2).getText().contains(genderValue));
//
//        Assert.assertTrue(ValidationTable.get(3).getText().contains("Mobile"));
//        Assert.assertTrue(ValidationTable.get(3).getText().contains(mobileValue));
//
//        Assert.assertTrue(ValidationTable.get(4).getText().contains("Date of Birth"));
//        Assert.assertTrue(ValidationTable.get(4).getText().contains(dateofbirthValue));
//
//        Assert.assertTrue(ValidationTable.get(5).getText().contains("Subjects"));
//        Assert.assertTrue(ValidationTable.get(5).getText().contains(subjectsValue));
//
//        Assert.assertTrue(ValidationTable.get(6).getText().contains("Hobbies"));
//        Assert.assertTrue(ValidationTable.get(6).getText().contains(readingValue));
//
////        Assert.assertTrue(ValidationTable.get(7).getText().contains("Picture"));
////        Assert.assertTrue(ValidationTable.get(7).getText().contains(file.getName()));
//
//        Assert.assertTrue(ValidationTable.get(8).getText().contains("Address"));
//        Assert.assertTrue(ValidationTable.get(8).getText().contains(addressValue));
//
//        Assert.assertTrue(ValidationTable.get(9).getText().contains("State and City"));
//        Assert.assertTrue(ValidationTable.get(9).getText().contains(stateValue + " " + cityValue));
}

