package Tests;

import ShareData.ShareData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FormTableTest extends ShareData {


    @Test
    public void testMethod(){

        WebElement Forms= getDriver().findElement(By.xpath("//h5[text()='Forms']"));
        Forms.click();

        WebElement practiceForms=getDriver().findElement(By.xpath("//span[text()='Practice Form']"));
        practiceForms.click();

        WebElement firstName=getDriver().findElement(By.id("firstName"));
        String firstNameValue="Oana";
        firstName.sendKeys(firstNameValue);

        WebElement lastName=getDriver().findElement(By.id("lastName"));
        String lastNameValue="Turcanu";
        lastName.sendKeys(lastNameValue);

        WebElement email=getDriver().findElement(By.id("userEmail"));
        String emailValue="oana@yahoo.com";
        email.sendKeys(emailValue);

        WebElement gender=getDriver().findElement(By.xpath("//label[@for='gender-radio-2']"));
        gender.click();
        String genderValue=gender.getText();

        WebElement mobile=getDriver().findElement(By.id("userNumber"));
        String mobileValue="0757890562";
          mobile.sendKeys(mobileValue);

         WebElement subjects=getDriver().findElement(By.id("subjectsInput"));
         String subjectsValue="English";
         subjects.sendKeys(subjectsValue);
         subjects.sendKeys(Keys.ENTER);

         WebElement reading=getDriver().findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
         reading.click();
         String readingValue=reading.getText();


         WebElement uploadPicture=getDriver().findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/th.jpeg");
         uploadPicture.sendKeys(file.getAbsolutePath());

         WebElement address= getDriver().findElement(By.id("currentAddress"));
         String addressValue="Test,nr.test";
         address.sendKeys(addressValue);

        JavascriptExecutor js = null;
        js.executeScript("window.scrollBy(0,450)", "");

        WebElement state = getDriver().findElement(By.id("state"));
        state.click();

        WebElement selectState = getDriver().findElement(By.id("react-select-3-input"));
        String stateValue = "NCR";
        selectState.sendKeys(stateValue);
        selectState.sendKeys(Keys.ENTER);

        WebElement city = getDriver().findElement(By.id("city"));
        city.click();

        WebElement selectCity = getDriver().findElement(By.id("react-select-4-input"));
        String cityValue = "Delhi";
        selectCity.sendKeys(cityValue);
        selectCity.sendKeys(Keys.ENTER);

        WebElement submitButton = getDriver().findElement(By.id("submit"));
        js.executeScript("arguments[0].click();",submitButton);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMMM,yyyy");
        LocalDateTime now = LocalDateTime.now();
        String dateofbirthValue=dtf.format(now);

        WebElement thanksMessage= getDriver().findElement(By.id("example-modal-sizes-title-lg"));
        String actualMessage=thanksMessage.getText();
        String expectedMessage="Thanks for submitting the form";
        Assert.assertEquals(actualMessage,expectedMessage);

        List<WebElement> ValidationTable=getDriver().findElements(By.cssSelector(".table-dark>tbody>tr"));

        Assert.assertTrue(ValidationTable.get(0).getText().contains("Student Name"));
        Assert.assertTrue(ValidationTable.get(0).getText().contains(firstNameValue + " " + lastNameValue));

        Assert.assertTrue(ValidationTable.get(1).getText().contains("Student Email"));
        Assert.assertTrue(ValidationTable.get(1).getText().contains(emailValue));

        Assert.assertTrue(ValidationTable.get(2).getText().contains("Gender"));
        Assert.assertTrue(ValidationTable.get(2).getText().contains(genderValue));

        Assert.assertTrue(ValidationTable.get(3).getText().contains("Mobile"));
        Assert.assertTrue(ValidationTable.get(3).getText().contains(mobileValue));

        Assert.assertTrue(ValidationTable.get(4).getText().contains("Date of Birth"));
        Assert.assertTrue(ValidationTable.get(4).getText().contains(dateofbirthValue));

        Assert.assertTrue(ValidationTable.get(5).getText().contains("Subjects"));
        Assert.assertTrue(ValidationTable.get(5).getText().contains(subjectsValue));

        Assert.assertTrue(ValidationTable.get(6).getText().contains("Hobbies"));
        Assert.assertTrue(ValidationTable.get(6).getText().contains(readingValue));

        Assert.assertTrue(ValidationTable.get(7).getText().contains("Picture"));
        Assert.assertTrue(ValidationTable.get(7).getText().contains(file.getName()));

        Assert.assertTrue(ValidationTable.get(8).getText().contains("Address"));
        Assert.assertTrue(ValidationTable.get(8).getText().contains(addressValue));

        Assert.assertTrue(ValidationTable.get(9).getText().contains("State and City"));
        Assert.assertTrue(ValidationTable.get(9).getText().contains(stateValue + " " + cityValue));

        WebElement closeButton=getDriver().findElement(By.id("closeLargeModal"));
        closeButton.sendKeys(Keys.ENTER);



    }
}
