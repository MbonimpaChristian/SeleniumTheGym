package Ajax;

import Base.BaseTest;
import Pages.HomePage;
import org.testng.annotations.Test;

public class AjaxTest extends BaseTest {
    @Test
    public void testAjax(){
        homePage.clickAjax();
    }
}
