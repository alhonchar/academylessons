package org.academy.web.tests;

import lombok.extern.slf4j.Slf4j;
import org.academy.MainConfig;
import org.academy.web.AbstractWebDriver;
import org.academy.web.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Slf4j
public class ActionTest extends AbstractWebDriver {
    private LoginPage loginPage;
    private MainPage mainPage;
    private BasePage basePage;
    private RepositoryPage repositoryPage;
    private ActionPage actionPage;
    private RunActionPage runActionPage;

    public ActionTest() {
        super();
    }

    public void Login() {
        loginPage.fillLoginField(MainConfig.getLogin());
        loginPage.fillPassField(MainConfig.getPassword());
        loginPage.clickOnSubmit();
    }

    @BeforeMethod(alwaysRun = true)
    public void precondition() {
        mainPage = new MainPage(webDriver, true, MainConfig.getUrl());
        loginPage = mainPage.clickOnSignIn();   
        Login();
        basePage = loginPage.clickOnSignIn();
        repositoryPage = basePage.getRepositoryLink();
        actionPage = repositoryPage.clickOnActionLink();
        runActionPage = actionPage.clickOnWorkflow();
    }

    @Test
    public void getHash() {
        log.info("Hash code " + runActionPage.GetActionHashCode());
    }
}
