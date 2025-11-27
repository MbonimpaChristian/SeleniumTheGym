package About;

import Base.BaseTest;
import org.testng.annotations.Test;

public class AboutTest extends BaseTest {
    @Test

    public void testAbout(){
        homePage.clickAbout();
    }
}
