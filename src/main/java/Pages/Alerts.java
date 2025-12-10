package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Alerts {
    private WebDriver driver;
    private By triggerPromptButton = By.cssSelector("button[type ='button']");

    private By results = By.id("confirm-demo");
//
    public Alerts(WebDriver driver) {

        this.driver = driver;
    }
//
    public void triggerAlert() {
        driver.findElements(triggerPromptButton).get(0).click();
        driver.switchTo().alert().accept();
    }
    public void triggerConfirm() {
        driver.findElements(triggerPromptButton).get(1).click();
        driver.switchTo().alert().accept();
    }
    public void triggerPrompt() {

        driver.findElements(triggerPromptButton).get(2).click();
        driver.switchTo().alert().accept();
    }
//
    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String  alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public void alert_sendInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
//
    public String getResult() {
        return driver.findElement(results).getText();

    }
}
