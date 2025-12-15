package Alert;

import Base.BaseTest;
//import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertsTest extends BaseTest {

//    @Test
//    public void testAcceptAlert(){
//        var alertPage = homePage.clickJavaScriptAlerts();
//        alertPage.triggerAlert();
//        alertPage.alert_clickToAccept();
//        alertPage.getResult();
//        Assert.assertEquals(alertPage.getResult(),  "You successfully clicked an alert","Results text incorrect");
//        }
//    @Test
//    public void testGetTextFromAlert(){
//        var alertPage = homePage.clickJavaScriptAlerts();
//        alertPage.triggerConfirm();
//        String text = alertPage.alert_getText();
//        alertPage.alert_clickToDismiss();
//        Assert.assertEquals(text,"I am a JS Confirm","Alert text incorrect");
//    }
    @Test
    public void testSetTextToAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.triggerConfirm();
        alertPage.triggerPrompt();
//        String texts = "Christian";
//        alertPage.alert_sendInput(texts);
//        alertPage.alert_clickToAccept();
        //Assert.assertEquals(alertPage.getResult(),"You have entered: "+texts + "!","Results text incorrect");

    }
}