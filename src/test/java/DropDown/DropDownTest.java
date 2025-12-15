package DropDown;

import Base.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectionOption() {
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropdown();
    }

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
}

