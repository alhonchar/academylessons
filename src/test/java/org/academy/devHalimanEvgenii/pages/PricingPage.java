package org.academy.devHalimanEvgenii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricingPage {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//h1[text()='Pricing']")
    private WebElement h1Tag;

    public PricingPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 50);
        PageFactory.initElements(driver, this);
    }
    public boolean isDescriptionPricingPagePresent() {
        return wait.until(ExpectedConditions.visibilityOf(h1Tag))
                .getText().contains("Pricing");
    }
}
