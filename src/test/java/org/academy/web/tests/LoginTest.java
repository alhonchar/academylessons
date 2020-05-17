package org.academy.web.tests;

import org.academy.MainConfig;
import org.academy.web.AbstractWebDriver;
import org.academy.web.pages.LoginPage;
import org.academy.web.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends AbstractWebDriver {
    private LoginPage loginPage;
    private MainPage mainPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = new MainPage(webDriver, true, MainConfig.getUrl());
        loginPage = mainPage.clickOnSignIn();
    }

    @DataProvider(name = "login form provider")
    public Object[][] dataProviderAuthUserType() {
        return new Object[][]{
                {"", ""},
                {"alhonchar", ""},
                {"", "Alex123456&*"},
                {"alhonchar", "alhonchar"},
                {"Alex123456&*", "Alex123456&*"},
                {"login with spaces", "Alex123456&*"},
        };
    }

    @Test
    public void positiveLoginTest() {
        loginPage.fillLoginField(MainConfig.getLogin());
        loginPage.fillPassField(MainConfig.getPassword());
        loginPage.clickOnSubmit();
    }

@Test(dataProvider = "login form provider")
public void negativeLoginTest(String login, String pass) {
        loginPage.fillLoginField(login);
        loginPage.fillPassField(pass);
        loginPage.clickOnSubmit();
        String error = loginPage.getErrorMessage();
        Assert.assertEquals(error, "Incorrect username or password.");
        }
}
