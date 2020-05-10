package org.homework.homework2;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@Slf4j
public class Test {

    @org.testng.annotations.Test
    public void loginTest() {
        WebDriver driver =  Utility.initDriver();
        log.info("Initialization a webdriver");

        driver.get("https://github.com/");
        log.info("Test launched");

        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
        log.info("Performed click on SignIn button");
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("alhonchar");
        log.info("Performed input into login field");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alex123456&*");
        log.info("Performed input into password field");
        driver.findElement(By.xpath(" //input[@name='commit']")).click();
        log.info("Performed click on submit button");

        driver.close();
    }

    @org.testng.annotations.Test
    public void linksTransitionTest() {
        WebDriver driver = Utility.initDriver();
        log.info("Initialization a WebDriver");

        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        log.info("pageLoadTimeout = 10 seconds");

        driver.get("https://github.com/");
        log.info("Test launched");

        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
        log.info("Click on SignIn button");
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("alhonchar");
        log.info("Input into login field");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alex123456&*");
        log.info("Input into password field");
        driver.findElement(By.xpath(" //input[@name='commit']")).click();
        log.info("Click on submit button");


        driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
        log.info("Click on 'Blog' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
        log.info("Click on 'About' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
        log.info("Click on 'Shop' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Contact GitHub')]")).click();
        log.info("Click on 'Contact GitHub' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Pricing')]")).click();
        log.info("Click on 'Pricing' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'API')]")).click();
        log.info("Click on 'API' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
        log.info("Click on 'Training' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
        log.info("Click on 'Status' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Security')]")).click();
        log.info("Click on 'Security' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
        log.info("Click on 'Terms' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
        log.info("Click on 'Privacy' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.findElement(By.xpath("//a[@class='link-gray'][contains(text(),'Help')]")).click();
        log.info("Click on 'Help' reference");
        driver.get("https://github.com/");
        log.info("Return on the main page");

        driver.close();
    }
}
