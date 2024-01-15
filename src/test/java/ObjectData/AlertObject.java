package ObjectData;

import java.util.HashMap;

public class AlertObject {
    private String promptAlert;

    public String getPromptAlert() {
        return promptAlert;
    }

    public void setPromptAlert(String promptAlert) {
        this.promptAlert = promptAlert;
    }

    public AlertObject(HashMap<String, String> testData) {
        populateObject(testData);

    }
//facem o metoda care sa mapeze valorile din proprietes la valorile din clasa

    private void populateObject(HashMap<String, String> testData) {
        for (String Key : testData.keySet()) {
            switch (Key) {
                case "promptAlert":
                    setPromptAlert(testData.get(Key));
                    break;

            }
        }

    }
}
