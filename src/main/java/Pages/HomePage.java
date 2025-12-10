//package Pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//public class HomePage {
//    private WebDriver driver;
//
//    public HomePage(WebDriver driver){
//        this.driver = driver;
//    }
//
//    public Ajax clickAjax(){
//        clickLink("Ajax Form Submit");
//        return new Ajax(driver);
//    }
//
//    public Dropdown clickDropDown(){
//        clickLink("Platform");
//        return new Dropdown(driver);
//    }
//
//    public UploadFile clickFileUpload(){
//        clickLink("Upload File Demo");
//        return new UploadFile(driver);
//    }
//
//    public Alerts clickJavaScriptAlerts(){
//        clickLink("Javascript Alerts");
//        return new Alerts(driver);
//    }
//
//    public void clickLink(String linkText){
//        driver.findElement(By.linkText(linkText)).click();
//    }
//}
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver= driver;
    }
//    public About clickAbout(){
//        clickLink("About");
//        return new About(driver);
        public Ajax clickAjax(){
            clickLink("Ajax Form Submit");
            return new Ajax(driver);
        }
        public Dropdown clickDropDown(){
            clickLink("Platform");
            return  new Dropdown(driver);
        }
        public UploadFile clickFileUpload(){
            clickLink("Upload File Demo");
            return new UploadFile(driver);
        }
        public Alerts clickJavaScriptAlerts(){
            clickLink("Javascript Alerts");
            return new Alerts(driver);
        }
        public void clickLink(String linkText){
            driver.findElement(By.linkText(linkText)).click();
        }
    }