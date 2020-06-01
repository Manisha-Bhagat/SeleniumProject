import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.util.*;
import java.util.function.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class SeleniumPrac4Frames {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/droppable/");
        //switch to frame
        System.out.println(driver.findElement(By.tagName("iframe")).getSize());
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        Actions a=new Actions(driver);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();
        driver.switchTo().defaultContent();

    }
}
