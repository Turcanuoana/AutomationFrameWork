package ObjectData;

import java.util.HashMap;

public class WebTableObject {


    private String firstNameValue;
    private String  lastNameValue;
    private String emailValue;
    private String ageValue;
    private String salaryValue;
    private String departamentValue;

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getAgeValue() {
        return ageValue;
    }

    public void setAgeValue(String ageValue) {
        this.ageValue = ageValue;
    }

    public String getSalaryValue() {
        return salaryValue;
    }

    public void setSalaryValue(String salaryValue) {
        this.salaryValue = salaryValue;
    }

    public String getDepartamentValue() {
        return departamentValue;
    }

    public void setDepartamentValue(String departamentValue) {
        this.departamentValue = departamentValue;
    }

    public WebTableObject(HashMap<String, String> testData) {
        populateObject(testData);

    }
//facem o metoda care sa mapeze valorile din proprietes la valorile din clasa

    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "salaryValue":
                    setSalaryValue(testData.get(Key));
                    break;
                case "departamentValue":
                    setDepartamentValue(testData.get(Key));
                    break;
                case "ageValue":
                    setAgeValue(testData.get(Key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(Key));
                    break;
                case "lastNameValue":
                    setFirstNameValue(testData.get(Key));
                    break;
                case "firstNameValue":
                    setFirstNameValue(testData.get(Key));
                    break;

            }
        }

    }
}
