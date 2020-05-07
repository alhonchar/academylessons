package org.homework.homework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

    public static WebDriver initDriver() {
        if (isWindows()) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        }
        if (isLinux()) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        }
        return new ChromeDriver();
    }

    private static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("win");
    }

    private static boolean isLinux() {
        String os = System.getProperty("os.name").toLowerCase();
        return os.contains("untu") || os.contains("int") || os.contains("ian")
                || os.contains("dora") || os.contains("kali");
    }
}
