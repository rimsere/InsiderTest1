package insider.page;
import insider.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CareersPage {
    static Methods methods;
    public  CareersPage(){
        methods=new Methods();
    }
    public static void  careerspage(){

        methods.waitBySeconds(1);
        methods.scrollWithAction(By.xpath("//div[@class='col-12 d-flex flex-wrap p-0 career-load-more']/div[@class='job-item col-12 col-lg-4 mt-5']/div[contains(.,'Looking for a thrill? Build game-changing products in a fast-paced growth enviro')]"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".ml-0"));
        methods.waitBySeconds(1);
        methods.scrollWithAction(By.cssSelector(".e-swiper-container"));
        methods.waitBySeconds(1);


    }
}