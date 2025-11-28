package Base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    private By Ajax= By.linkText("Ajax Form Submit");

//    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.findElement(Ajax).click();
        HomePage homePage = new HomePage(driver);
    }

        public static void main(String[] args){
        BaseTest test= new BaseTest();
        test.setUp();
    }
}
