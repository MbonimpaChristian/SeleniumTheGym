package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class About {
     WebDriver driver;
     private By about = By.linkText("About");
     private By hover = By.id("hero");

     public About(WebDriver driver){
         this.driver=driver;
     }

     public void clickAbout(){
         driver.findElement(about).click();

         WebElement hovers = driver.findElement(hover);
         Actions actions = new Actions(driver);

         actions.moveToElement(hovers).perform();
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         wait.until(ExpectedConditions.invisibilityOf(driver.findElement(hover)));
     }
}
