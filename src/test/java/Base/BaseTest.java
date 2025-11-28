package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.the-gym.rw/");
//        driver.findElement(requirer).click();
//        homePage = new HomePage(driver);
    }
        public static void main(String[] args){
        BaseTest test= new BaseTest();
        test.setUp();
    }
}
