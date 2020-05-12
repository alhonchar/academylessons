package org.academy.devHalimanEvgenii.tests;

import org.academy.devHalimanEvgenii.listener.AuthListener;
import org.academy.devHalimanEvgenii.pages.MainPage;
import org.academy.devHalimanEvgenii.pages.TitlePageGitHub;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(AuthListener.class)
public class FooterLinksTest extends AuthenticationTest{
    private MainPage mainPage;

    @Test(description = "check AboutPage opening")
    public void abutPageOpeningTest(){
        Assert.assertTrue(
        mainPage.clickOnAboutLink()
                .isDescriptionPagePresent(), "About's description  is absent");
    }
    @Test(description = "check APIPage opening")
    public void apiPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnAPILink()
                        .isDescriptionApiPagePresent(), " API's description  is absent");
    }
    @Test(description = "check BlogPage opening")
    public void blogPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnBlogLink()
                        .isDescriptionBlogPagePresent(), " Blog's description  is absent");
    }
    @Test(description = "check ContactPage opening")
    public void contactPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnContactLink()
                        .isDescriptionContactPagePresent(), " Contact's message  is absent");
    }
    @Test(description = "check HelpPage opening")
    public void helpPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnHelpLink()
                        .isDescriptionHelpPagePresent(), "Help's message  is absent");
    }
    @Test(description = "check PricingPage opening")
    public void pricingPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnPricingLink()
                        .isDescriptionPricingPagePresent(), "Pricing's message  is absent");
    }
    @Test(description = "check PrivacyPage opening")
    public void privacyPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnPrivacyLink()
                        .isDescriptionPrivacyPagePresent(), "Privacy's message  is absent");
    }
    @Test(description = "check SecurityPage opening")
    public void securityPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnSecurityLink()
                        .isDescriptionSecurityPagePresent(), "Security's message  is absent");
    }
    @Test(description = "check ShopPage opening")
    public void ShopPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnShopLink()
                        .isDescriptionShopPagePresent(), "Shop's message  is absent");
    }
    @Test(description = "check StatusPage opening")
    public void StatusPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnStatusLink()
                        .isTitleStatusPagePresent(), "Status' page  is absent");
    }
    @Test(description = "check TermsPage opening")
    public void termsPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnTermsLink()
                        .isDescriptionTermsPagePresent(), "Terms' message  is absent");
    }
    @Test(description = "check TermsPage opening")
    public void trainingPageOpeningTest(){
        Assert.assertTrue(
                mainPage.clickOnTrainingLink()
                        .isDescriptionTrainingPagePresent(), "Training's message  is absent");
    }


    @BeforeClass(alwaysRun = true)
    public void preparePage() {
            findOutOS();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        titlePageGitHub.openPage()
                .clickOnSignInLink()
                .insertInLoginField(CORECT_LOGIN)
                .insertInPasswordField(CORECT_PASSWORD)
                .clickONConfirmButton();
        mainPage = new MainPage(driver);
        }

        @BeforeMethod(alwaysRun = true)
        public void transitionToMainPage(){
        titlePageGitHub.openPage();
        }

    @AfterClass(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

    }


