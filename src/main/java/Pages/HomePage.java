package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver= driver;
    }
    public About clickAbout(){
        clickLink("About");
        return new About(driver);
    }
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
