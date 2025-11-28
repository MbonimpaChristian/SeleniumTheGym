package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Ajax {
     WebDriver driver;
     private By ajax = By.linkText("Ajax Form Submit");
     private By hover = By.id("btn-submit");

     public Ajax(WebDriver driver){
         this.driver=driver;
     }

     public void clickAjax(){
         driver.findElement(ajax).click();

         WebElement hovers = driver.findElement(hover);
         Actions actions = new Actions(driver);
//
         actions.moveToElement(hovers).perform();
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
         wait.until(ExpectedConditions.invisibilityOf(driver.findElement(hover)));

//         wait.until(ExceptedConditions.invisibilityOf(driver.findElement(hover)));
     }
}

