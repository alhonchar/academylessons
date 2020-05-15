package org.academy.web.pages;

import org.academy.web.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PullRequestsPage extends AbstractPage {
    public PullRequestsPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[@id='issue_15_link']")
    private WebElement testFileCommitLink;

    public TestFileCommitPage clickOnTestFileCommitLink() {
        wait.until(ExpectedConditions.elementToBeClickable(testFileCommitLink)).click();
        return new TestFileCommitPage(webDriver);
    }
}
