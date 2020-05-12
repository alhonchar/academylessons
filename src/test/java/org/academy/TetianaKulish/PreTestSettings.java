package org.academy.TetianaKulish;

public class PreTestSettings {
    public static void DriverChoice() {
        String os = System.getProperty("os.name").toLowerCase().substring(0, 3);
        String chromeBinary = "src/main/resources/chromedriver" + (os.equals("win") ? ".exe" : "");
        System.out.println(chromeBinary);
        System.setProperty("webdriver.chrome.driver", chromeBinary);
    }
}
