package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UploadFile {
    private WebDriver driver;
    private By uploadFile = By.id("file");
    private By success = By.id("error");

    //
    public UploadFile(WebDriver driver){
        this.driver = driver;
    }
//    public void clickLink(){
//        driver.findElement(uploadFile).click();
//    }
    public void setUploadFiles(String absolutePathOfFile){
        driver.findElement(uploadFile).sendKeys(absolutePathOfFile);

    }
    public String getUploadedFiles(){
        return driver.findElement(success).getText();
    }
}