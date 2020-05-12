package org.academy.TetianaKulish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
    WebDriver driver;

    @FindBy(linkText = "Learn more about our commitment to diversity and inclusion")
    WebElement aboutPageTitle;

    @FindBy(xpath = "//div[@class='Header-item d-none d-lg-flex']//a[@class='Header-link']//*[local-name()='svg']")
    WebElement toHomePage;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getAboutPageTitle() {
        return aboutPageTitle.getText();
    }

    public void ToHomePage() {
        toHomePage.click();
    }
}
