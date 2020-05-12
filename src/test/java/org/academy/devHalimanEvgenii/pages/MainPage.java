package org.academy.devHalimanEvgenii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private  WebDriver driver;
    private WebDriverWait wait;

    @FindBy(linkText = "Blog")
    private WebElement blogLink;
    @FindBy(linkText = "About")
    private WebElement aboutLink;
    @FindBy(linkText = "Shop")
    private WebElement shopLink;
    @FindBy(linkText = "Contact GitHub")
    private WebElement contactGitHubLink;
    @FindBy(linkText = "Pricing")
    private WebElement pricingLink;
    @FindBy(linkText = "API")
    private WebElement apiLink;
    @FindBy(linkText = "Training")
    private WebElement trainingLink;
    @FindBy(linkText = "Status")
    private WebElement statusLink;
    @FindBy(linkText = "Security")
    private WebElement securityLink;
    @FindBy(linkText = "Terms")
    private WebElement termsLink;
    @FindBy(linkText = "Privacy")
    private WebElement privacyLink;
    @FindBy(linkText = "Help")
    private WebElement helpLink;




    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10, 50);
        PageFactory.initElements(driver, this);
    }

    public AboutPage clickOnAboutLink(){
        wait.until(ExpectedConditions.elementToBeClickable(aboutLink)).click();
        return new AboutPage(driver);
    }
    public ApiPage clickOnAPILink(){
        wait.until(ExpectedConditions.elementToBeClickable(apiLink)).click();
        return new ApiPage(driver);
    }
    public BlogPage clickOnBlogLink(){
        wait.until(ExpectedConditions.elementToBeClickable(blogLink)).click();
        return new BlogPage(driver);
    }
    public ContactGitHubPage clickOnContactLink(){
        wait.until(ExpectedConditions.elementToBeClickable(contactGitHubLink)).click();
        return new ContactGitHubPage(driver);
    }
    public HelpPage clickOnHelpLink(){
        wait.until(ExpectedConditions.elementToBeClickable(helpLink)).click();
        return new HelpPage(driver);
    }
    public PricingPage clickOnPricingLink(){
        wait.until(ExpectedConditions.elementToBeClickable(pricingLink)).click();
        return new PricingPage(driver);
    }
    public PrivacyPage clickOnPrivacyLink(){
        wait.until(ExpectedConditions.elementToBeClickable(privacyLink)).click();
        return new PrivacyPage(driver);
    }
    public SecurityPage clickOnSecurityLink(){
        wait.until(ExpectedConditions.elementToBeClickable(securityLink)).click();
        return new SecurityPage(driver);
    }
    public ShopPage clickOnShopLink(){
        wait.until(ExpectedConditions.elementToBeClickable(shopLink)).click();
        return new ShopPage(driver);
    }
    public StatusPage clickOnStatusLink(){
        wait.until(ExpectedConditions.elementToBeClickable(statusLink)).click();
        return new StatusPage(driver);
    }
    public TermsPage clickOnTermsLink(){
        wait.until(ExpectedConditions.elementToBeClickable(termsLink)).click();
        return new TermsPage(driver);
    }
    public TrainingPage clickOnTrainingLink(){
        wait.until(ExpectedConditions.elementToBeClickable(trainingLink)).click();
        return new TrainingPage(driver);
    }

}
