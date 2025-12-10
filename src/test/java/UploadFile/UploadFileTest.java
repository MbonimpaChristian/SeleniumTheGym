package UploadFile;

import Base.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UploadFileTest extends BaseTest {
    @Test
    public void testFileUpload() {
       var upload =  homePage.clickFileUpload();

       String successText ="File Successfully Uploaded";
       String failText = "File type should be pdf, png, jpeg or jpg";

       upload.setUploadFiles("C://Users//Chris//OneDrive//Pictures//0-0 price.jpg");
//       upload.setUploadFiles("D://Epicurien Accounting Reconciliation//October 2024//caisse du 01 10 24.csv");
       if(upload.getUploadedFiles().equals(successText)){
           assertEquals(upload.getUploadedFiles(),successText,"File Unsuccessfully Uploaded");
       }else{
           assertEquals(upload.getUploadedFiles(),failText,"File Unsuccessfully Uploaded");
       }


    }

    public void tearDown(){
        driver.quit();
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}