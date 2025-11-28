package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UploadFile {
    private WebDriver driver;
    private By uploadFile = By.linkText("Upload File Demo");
//
    public UploadFile(WebDriver driver){
        this.driver = driver;
    }
    public void clickLink(){
        driver.findElement(uploadFile).click();
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(uploadFile).sendKeys(absolutePathOfFile);
        clickLink();
    }
    public String getUploadedFiles(){
        return driver.findElement(uploadFile).getText();
    }
//    public String getUploadedFiles(){
//        return; driver.findElement(UploadFile).getText();
//    }
//    public String getFileUpload(){
//
//    }
}
