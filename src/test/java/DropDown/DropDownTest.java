package DropDown;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/");

        homePage = new HomePage(driver);
    }

    @Test
    public void testSelectionOption() {
        homePage.clickDropDown();
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}

