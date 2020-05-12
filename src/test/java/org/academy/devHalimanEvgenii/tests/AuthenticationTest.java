package org.academy.devHalimanEvgenii.tests;

import org.academy.devHalimanEvgenii.listener.AuthListener;
import org.academy.devHalimanEvgenii.pages.TitlePageGitHub;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(AuthListener.class)
public class AuthenticationTest {
    protected WebDriver driver;
    protected TitlePageGitHub titlePageGitHub;
    protected final String CORECT_LOGIN = "alhonchar";
    protected final String CORECT_PASSWORD = "Alex123456&*";


    @Test(description = "validation for a successful scenario")
    public void correctCredentials() {
        Assert.assertTrue(
                titlePageGitHub.openPage()
                        .clickOnSignInLink()
                        .insertInLoginField(CORECT_LOGIN)
                        .insertInPasswordField(CORECT_PASSWORD)
                        .clickONConfirmButton()
                        .repositoryLinkIsPresense(), "authentication attempt with valid data failed")
        ;


    }

    @Test(description = "validation for a display error message for incorrect password")
    public void errorMessWithIncorPassIsDisplay() {
        Assert.assertTrue(
                titlePageGitHub.openPage()
                        .clickOnSignInLink()
                        .insertInLoginField(CORECT_LOGIN)
                        .insertInPasswordField(CORECT_PASSWORD + "0")
                        .clickONConfirmButton()
                        .errorMessageIsDisplay(), "display error message is failed")
        ;


    }

    @Test(description = "validation for login in upperCase and correct password")
    public void loginToUpperCase() {
        Assert.assertTrue(
                titlePageGitHub.openPage()
                        .clickOnSignInLink()
                        .insertInLoginField(CORECT_LOGIN.toUpperCase())
                        .insertInPasswordField(CORECT_PASSWORD)
                        .clickONConfirmButton()
                        .repositoryLinkIsPresense(), "authentication attempt with uppercase login failed")
        ;


    }

    @Test(description = "validation for correct login and uppercaset password")
    public void passwordToUpperCase() {
        Assert.assertTrue(
                titlePageGitHub.openPage()
                        .clickOnSignInLink()
                        .insertInLoginField(CORECT_LOGIN)
                        .insertInPasswordField(CORECT_PASSWORD.toUpperCase())
                        .clickONConfirmButton()
                        .errorMessageIsDisplay(), "authentication attempt with uppercase password succes")
        ;


    }

    @BeforeClass(alwaysRun = true)
    public void browserSetup() {
        titlePageGitHub = new TitlePageGitHub(driver);
    }

    @AfterMethod(alwaysRun = true)
    public void methodTearDown() {
        driver.manage().deleteAllCookies();
    }

    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

    @BeforeMethod(alwaysRun = true)
    public void methodSetup() {
        driver.manage().deleteAllCookies();
    }
    @BeforeTest(alwaysRun = true)
    public void setUp() {
        findOutOS();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void findOutOS(){
        if(System.getProperty("os.name").equals("Linux")){
            System.setProperty("webdriver.chrome.driver", "src/test/java/org/academy/devHalimanEvgenii/chromedriver_linux64/chromedriver");
        }
        else {
            System.setProperty(
                    "webdriver.chrome.driver",
                    "С:\\selenium\\chromedriver.exe");}
    }

}
