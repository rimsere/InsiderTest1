package insider.page;
import insider.methods.Methods;
import okhttp3.Handshake;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
    static Methods methods;

    public HomePage() {
        methods = new Methods();
    }

    public static void homepage() {

        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[contains(text(), 'Accept All')]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[contains(.,'Company')]"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[.='Careers']"));
        methods.waitBySeconds(1);


    }

    public static void navigateTo(String s) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notification");
        chromeOptions.addArguments("--disable-qpu");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-plugins");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-translate");
        ChromeDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://useinsider.com/careers/quality-assurance/");

    }

}
