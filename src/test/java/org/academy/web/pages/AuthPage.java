package org.academy.web.pages;

import org.academy.web.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AuthPage extends AbstractPage {
    public AuthPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = "//a[(@href='/alhonchar/academylessons')]")
    private List<WebElement> repositoryLinks;

    public ReposPage clickOnAcademyLessonsLink() {
        wait.until(ExpectedConditions.elementToBeClickable(repositoryLinks.get(0))).click();
        return new ReposPage(webDriver);
    }
}
