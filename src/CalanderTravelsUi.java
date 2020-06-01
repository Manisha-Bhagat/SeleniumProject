import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class CalanderTravelsUi {
    public static void main(String args[]){
        //SSl certificates
        //Desired capabilities=
        //general chrome profile

/*        DesiredCapabilities ch=DesiredCapabilities.chrome();
        //ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        //Belows to your local browser
        ChromeOptions c= new ChromeOptions();
        c.merge(ch);

 */
        System.setProperty("webdriver.gecko.driver","/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.id("travel_date")).click();
        //select month
       while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("July")){
           driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
        }
       // driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).click();
        //active date
       // driver.findElement(By.xpath("//td[@class='active day']")).click();
        //store all the dates in list
        List<WebElement>dates=driver.findElements(By.className("day"));
        //.day do not come with classname
        //Grab the common attribute//put into list and iterate
        int count=driver.findElements(By.cssSelector(".day")).size();
       // System.out.println(count);
        for(int i=1;i<count;i++){
            String date=driver.findElements(By.className("day")).get(i).getText();
            //System.out.println(date);
            //select date 23
            if(date.equals("23")){
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }


    }
}
