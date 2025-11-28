package UploadFile;

import Base.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadFileTest {
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
    public void testFileUpload() {
        homePage.clickFileUpload();
    }

    public void tearDown(){
        driver.quit();
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}
