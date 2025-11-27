package Base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    private By about= By.linkText("About");

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.the-gym.rw/");
//        driver.findElement(requirer).click();
        homePage = new HomePage(driver);
    }
//    public static void main(String[] args){
//        BaseTest base= new BaseTest();
//        base.setUp();
//    }
}
