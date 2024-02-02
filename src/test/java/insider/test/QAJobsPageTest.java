package insider.test;

import insider.driver.BaseTest;
import insider.methods.Methods;
import insider.page.CareersPage;
import insider.page.HomePage;
import insider.page.QAJobsPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;


public class QAJobsPageTest extends BaseTest {
    @Test
    public void QAJobsPageTest() {

        HomePage homepage = new HomePage();
        CareersPage careersPage = new CareersPage();
        QAJobsPage qajobspage = new QAJobsPage();
        HomePage.homepage();
        CareersPage.careerspage();

       HomePage.navigateTo("https://useinsider.com/careers/quality-assurance/");






    }

}