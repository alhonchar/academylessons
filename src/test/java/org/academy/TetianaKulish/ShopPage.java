package org.academy.TetianaKulish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    WebDriver driver;

    @FindBy(linkText = "Shirts")
    WebElement shopPageTitle;

    @FindBy(linkText = "Events")
    WebElement toHomePage;

    public ShopPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String GetShopPageTitle() {
        return shopPageTitle.getText();
    }

    public void ToHomePage() {
        toHomePage.click();
    }
}

