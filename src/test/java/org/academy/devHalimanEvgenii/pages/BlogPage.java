package org.academy.devHalimanEvgenii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlogPage extends ParentPage {

    @FindBy(xpath = "//h1")
    private WebElement h1Tag;

    public BlogPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDescriptionBlogPagePresent() {
        return wait.until(ExpectedConditions.visibilityOf(h1Tag))
                .getText().contains("The GitHub Blog");
    }

}
