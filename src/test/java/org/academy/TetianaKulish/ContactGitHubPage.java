package org.academy.TetianaKulish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactGitHubPage {
    WebDriver driver;

    @FindBy(linkText = "GitHub Blog")
    WebElement toBlogPage;

    public ContactGitHubPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement GetContactPageTitle() {
        return driver.findElement(By.xpath("//div[@id='support-logo']"));
    }

    public void ToBlogPage() {
        toBlogPage.click();
    }
}

