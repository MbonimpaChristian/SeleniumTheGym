package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Alerts {
    private WebDriver driver;
    private By triggerAlertsButton = By.xpath(".//button[text() = 'Click Me']");
    private By triggerConfirmButton = By.xpath(".//button[text() = 'Click Me']");
    private By triggerPromptButton = By.xpath(".//button[text() = 'Click Me']");
    private By results = By.id("result");
//
    public Alerts(WebDriver driver) {
        this.driver = driver;
    }
//
    public void triggerAlert() {
        driver.findElement(triggerAlertsButton).click();
    }
    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }
    public void triggerPrompt() {
        driver.findElement(triggerPromptButton).click();
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
