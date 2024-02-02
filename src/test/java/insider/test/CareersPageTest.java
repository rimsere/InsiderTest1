package insider.test;

import insider.driver.BaseTest;
import insider.page.HomePage;
import insider.page.CareersPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class CareersPageTest extends BaseTest {
    @Test
    public void CareersPageTest() {
        HomePage homepage = new HomePage();
        CareersPage careersPage = new CareersPage();

        HomePage.homepage();
        CareersPage.careerspage();

    }

}