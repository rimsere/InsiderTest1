package insider.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public  static WebDriver driver;
    @Before
    public  void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/java/resources/chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--disable-notification");
        chromeOptions.addArguments("--disable-qpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-plugins");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-translate");

        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://useinsider.com/");


    }
    @After
    public void tearDown(){
        if (driver!=null){
            driver.close();
            driver.quit();
        }
    }
}
