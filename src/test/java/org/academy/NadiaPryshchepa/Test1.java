package org.academy.NadiaPryshchepa;
import org.openqa.selenium.NoSuchElementException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    private static Logger log = LoggerFactory.getLogger(Test1.class);
    public WebDriver driver;

    @DataProvider(name = "login")
    public Object[][] dataProviderTest() {
        return new Object[][] {
                {"", "Alex123456&*", false},
                {"alhonchar", "", false},
                {"alhonchar", "Alex123456&*", true}
        };
    }
    @BeforeMethod
    public void browser(){
        try
        {if (System.getProperty("os.name").toLowerCase().contains("win")) System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        else if (System.getProperty("os.name").toLowerCase().contains("linux"))System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        }
        catch (Exception e){
        log.error("unsupported os detected");
        }
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log.info("browser was started");
    }

    @AfterMethod
    public void close(){
        driver.quit();
        log.info("browser was closed after test ended");
    }

    @Test(dataProvider = "login")
    public void loginTest(String login, String password, boolean accessStatus){
        log.info("LoginTest started with parameters: login -'{}', password - '{}'", login, password);
        WebDriverWait wait = new WebDriverWait(driver, 10, 500);
        driver.get("https://github.com/login");
        try{wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='login']")))).sendKeys(login);}
        catch (NoSuchElementException e) {log.error("login field didn't found");}
        try{wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='password']")))).sendKeys(password);}
        catch (NoSuchElementException e) {log.error("password field didn't found");}
        try{wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='commit']")))).click();}
        catch (NoSuchElementException e) {log.error("commit button didn't found");}
        String user = driver.findElement(By.xpath("//a[@role='menuitem']//strong[@class='css-truncate-target']")).getText();;
        Assert.assertEquals((user.contains("alhonchar")), accessStatus);
    }
}
