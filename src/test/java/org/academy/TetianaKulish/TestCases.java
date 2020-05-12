package org.academy.TetianaKulish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases {
    WebDriver driver;
    LoggingPage objLogin;
    HomePage obgHomePage;
    BlogPage objBlogPage;
    AboutPage objAboutPage;
    ShopPage objShopPage;
    ContactGitHubPage objContactPage;

    @BeforeTest
    public void setUp() {
        PreTestSettings.DriverChoice();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test(priority = 0)
    public void loginTestCase() {
        driver.get("https://github.com/");
        driver.findElement(By.xpath("//a[(contains(@class, 'HeaderMenu-link')) and (@href='/login')]")).click();

        objLogin = new LoggingPage(driver);

        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.contains("Sign in to GitHub"));

        objLogin.login("alhonchar", "Alex123456&*");
    }

    @Test(priority = 1)
    public void HomePageCase() {
        obgHomePage = new HomePage(driver);
        Assert.assertTrue(obgHomePage.GetHomePageTitle().contains(("ProTip!")));
    }

    @Test(priority = 2)
    public void BlogPageCase() {
        obgHomePage.ClickBlogLink();
        objBlogPage = PageFactory.initElements(driver, BlogPage.class);
        Assert.assertTrue(objBlogPage.GetBlogPageTitle().contains("The GitHub Blog"));
        objBlogPage.ToHomePage();
    }

    @Test(priority = 3)
    public void AboutPageCase() {
        obgHomePage.ClickAboutLink();
        objAboutPage = PageFactory.initElements(driver, AboutPage.class);
        Assert.assertTrue(objAboutPage.getAboutPageTitle().contains("Learn more about our commitment to diversity and inclusion"));
        objAboutPage.ToHomePage();
    }

    @Test(priority = 4)
    public void ShopPageCase() {
        obgHomePage.ClickShopLink();
        objShopPage = PageFactory.initElements(driver, ShopPage.class);
        Assert.assertTrue(objShopPage.GetShopPageTitle().contains("Shirts"));
        objShopPage.ToHomePage();
    }

    @Test(priority = 5)
    public void ContactGitHubPageCase() {
        obgHomePage.ClickContactLink();
        objContactPage = PageFactory.initElements(driver, ContactGitHubPage.class);
        Assert.assertTrue(objContactPage.GetContactPageTitle().isEnabled());
        objContactPage.ToBlogPage();
        objBlogPage = PageFactory.initElements(driver, BlogPage.class);
        objBlogPage.ToHomePage();
    }
}
