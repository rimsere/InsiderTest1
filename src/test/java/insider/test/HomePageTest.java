package insider.test;

import insider.driver.BaseTest;
import insider.page.HomePage;
import org.junit.Test;


public class HomePageTest extends BaseTest{
    @Test
    public void loginTest(){
        HomePage loginPage=new HomePage();
        loginPage.homepage();
    }

}