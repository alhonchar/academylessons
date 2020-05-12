package org.academy.devHalimanEvgenii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends ParentPage {

    @FindBy(xpath = "//h1[@class='site-header__logo']")
    private WebElement h1Tag;

    public ShopPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDescriptionShopPagePresent() {
        return wait.until(ExpectedConditions.visibilityOf(h1Tag))
                .isDisplayed();
    }

}
