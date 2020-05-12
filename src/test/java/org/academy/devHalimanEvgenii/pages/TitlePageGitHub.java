package org.academy.devHalimanEvgenii.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class TitlePageGitHub {
    private static final String HOMEPAGE_URL = "https://github.com/";
    private  WebDriver driver;
    private  WebDriverWait wait;
    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signInLink;
    @FindBy(id = "login_field")
    private WebElement userNameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement signInButton;
    @FindBy(xpath = "//a[(@href='/alhonchar/academylessons')]")
    private List<WebElement> repositoryLinks;
    @FindBy(xpath = "//*[text()[contains(.,'Incorrect username or password')]]")
    private WebElement errorMessage;


    public TitlePageGitHub(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 50);
        PageFactory.initElements(driver, this);
    }

    public TitlePageGitHub openPage(){
        driver.get(HOMEPAGE_URL);
        return this;
    }
    public TitlePageGitHub clickOnSignInLink(){
        wait.until(ExpectedConditions.elementToBeClickable(signInLink)).click();
        return this;
    }
    public TitlePageGitHub insertInLoginField(String login){
        wait.until(ExpectedConditions.visibilityOf(userNameInput)).sendKeys(login);
        return this;
    }
    public TitlePageGitHub insertInPasswordField(String password){
        passwordInput.sendKeys(password);
        return this;
    }
    public TitlePageGitHub clickONConfirmButton(){
        signInButton.click();
        return this;
    }
    public boolean repositoryLinkIsPresense(){
         return wait.until(ExpectedConditions.visibilityOf(repositoryLinks.get(0))).isDisplayed();
    }
    public boolean errorMessageIsDisplay() {
        return wait.until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();
    }




}
