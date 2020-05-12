package org.academy.TetianaKulish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlogPage {
    WebDriver driver;

    @FindBy(linkText = "The GitHub Blog")
    WebElement blogPageTitle;

    @FindBy(linkText = "Back to GitHub.com")
    WebElement toHomePage;

    public BlogPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String GetBlogPageTitle() {
        return blogPageTitle.getText();
    }

    public void ToHomePage() {
        toHomePage.click();
    }
}
