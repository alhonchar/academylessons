package org.academy.devHalimanEvgenii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApiPage extends ParentPage {


    @FindBy(xpath = "//h1")
    private WebElement h1Tag;

    public ApiPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDescriptionApiPagePresent() {
        return wait.until(ExpectedConditions.visibilityOf(h1Tag))
                .getText().contains("Build your app on GitHub's platform");
    }

}
