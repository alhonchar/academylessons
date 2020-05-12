package org.academy.TetianaKulish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricingPage {
    WebDriver driver;
    @FindBy(linkText="About")
    WebElement toBlogPage;

    public WebElement GetPricingPageTitle(){
        return driver.findElement(By.xpath("//title[contains(text(),'Pricing · Plans for every developer')]"));
    }

    public PricingPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void ToBlogPage(){
        toBlogPage.click();
    }
}
