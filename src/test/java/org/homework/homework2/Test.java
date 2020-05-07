package org.homework.homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Test {

    @org.testng.annotations.Test
    public void loginTest() {
        WebDriver driver =  Utility.initDriver();

        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("alhonchar");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alex123456&*");
        driver.findElement(By.xpath(" //input[@name='commit']")).click();

        driver.close();
    }

    @org.testng.annotations.Test
    public void linksTransitionTest() {
        WebDriver driver = Utility.initDriver();

        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[@class='HeaderMenu-link no-underline mr-3']")).click();
        driver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("alhonchar");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Alex123456&*");
        driver.findElement(By.xpath(" //input[@name='commit']")).click();


        driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
        driver.findElement(By.xpath("//a[@class='text-white f6']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
        driver.findElement(By.xpath("//div[@class='Header-item d-none d-lg-flex']//a[@class='Header-link']//*" +
                                    "[local-name()='svg']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Contact GitHub')]")).click();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Pricing')]")).click();
        driver.findElement(By.xpath("//div[@class='Header-item d-none d-lg-flex']//a[@class='Header-link']//*" +
                                    "[local-name()='svg']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'API')]")).click();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Training')]")).click();
        driver.findElement(By.xpath("//a[@class='mr-4']//*[local-name()='svg']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Security')]")).click();
        driver.findElement(By.xpath("//div[@class='Header-item d-none d-lg-flex']//a[@class='Header-link']//*" +
                                    "[local-name()='svg']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[contains(text(),'Privacy')]")).click();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[@class='link-gray'][contains(text(),'Help')]")).click();
        driver.get("https://github.com/");

        driver.close();
    }
}
