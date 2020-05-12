package org.academy.devHalimanEvgenii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StatusPage extends ParentPage {


    public StatusPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTitleStatusPagePresent() {
        return wait.until(ExpectedConditions.titleIs("GitHub Status"));

    }

}
