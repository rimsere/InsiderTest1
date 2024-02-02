package insider.page;
import insider.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class QAJobsPage {
    static Methods methods;

    public QAJobsPage() {
        methods = new Methods();
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

    public static void qajobspage() {

        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[contains(text(), 'Accept All')]"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".btn-outline-secondary"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//span[.='Filter']"));
        methods.click(By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--focus']//span[@class='select2-selection__rendered']"));
        methods.click(By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--above select2-container--focus']//span[@class='select2-selection__rendered']"));
        methods.click(By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--above select2-container--focus select2-container--open']//span[@class='select2-selection__rendered']"));
        methods.click(By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--above select2-container--focus']//span[@class='select2-selection__rendered']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//a[@href='https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc']"));
        methods.waitBySeconds(1);


    }
}