package org.academy.web.tests;

import lombok.extern.slf4j.Slf4j;
import org.academy.MainConfig;
import org.academy.web.AbstractWebDriver;
import org.academy.web.pages.AuthPage;
import org.academy.web.pages.MainPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Slf4j
public class GetThreeCommitTest extends AbstractWebDriver {
    private MainPage mainPage;
    private AuthPage authPage;

    @BeforeClass(alwaysRun = true)
    public void precondition() {
        mainPage = new MainPage(webDriver, true, MainConfig.getUrl());
        authPage = mainPage.clickOnSignIn()
                .fillLoginField(MainConfig.getLogin())
                .fillPassField(MainConfig.getPassword())
                .clickOnSubmit();
    }

    @Test(description = "put three SHA to log")
    public void getThreeSha() {
        authPage.clickOnAcademyLessonsLink()
                .clickOnPullRequestsTab()
                .clickOnTestFileCommitLink()
                .clickOnCommitsLink()
                .getFullShas().forEach(log::info);
    }


}
