package org.academy.TetianaKulish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//a[contains(text(),'About')]")
    WebElement homeAboutLink;

    @FindBy(xpath = "//a[contains(text(),'Blog')]")
    WebElement homeBlogLink;

    @FindBy(xpath = "//a[contains(text(),'Shop')]")
    WebElement homeShopLink;

    @FindBy(xpath = "//a[contains(text(),'Contact GitHub')]")
    WebElement homeContactLink;

    @FindBy(xpath = "//strong[contains(text(),'ProTip!')]")
    WebElement homePageTitle;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickAboutLink() {
        homeAboutLink.click();
    }

    public void ClickBlogLink() {
        homeBlogLink.click();
    }

    public void ClickShopLink() {
        homeShopLink.click();
    }

    public void ClickContactLink() {
        homeContactLink.click();
    }

    public String GetHomePageTitle() {
        return homePageTitle.getText();
    }
}
