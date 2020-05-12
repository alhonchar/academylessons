package org.academy.TetianaKulish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggingPage {
    WebDriver driver;
    @FindBy(xpath = "//h1[contains(text(),'Sign in to GitHub')]")
    WebElement titleText;

    @FindBy(xpath = "//input[@name='login']")
    WebElement loginFild;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordFild;

    @FindBy(xpath = "//input[@name='commit']")
    WebElement loginButton;

    public LoggingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        loginFild.sendKeys(username);
        passwordFild.sendKeys(password);
        loginButton.click();
    }

    public String getLoginTitle() {
        return titleText.getText();
    }
}
