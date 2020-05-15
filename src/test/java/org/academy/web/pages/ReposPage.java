package org.academy.web.pages;

import org.academy.web.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ReposPage extends AbstractPage {

    public ReposPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[@href=\"/alhonchar/academylessons/pulls\"]/div")
    private WebElement pullRequestsTab;

    public PullRequestsPage clickOnPullRequestsTab() {
        wait.until(ExpectedConditions.elementToBeClickable(pullRequestsTab)).click();
        return new PullRequestsPage(webDriver);
    }


}
