import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import java.util.function.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
public class SeleniumPrac3 {
    public static void main(String[] args) throws InterruptedException {
        //Action-Frame-Handling Multiple window-Mouse hover
        System.setProperty("webdriver.gecko.driver", "/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        WebElement signin = driver.findElement(By.xpath("//a[@data-nav-role='signin']//span"));
        WebElement capitalletter=driver.findElement((By.id("twotabsearchtextbox")));
        mouseHoverRightClick(driver,signin);
        capitalLetterEnter(driver,capitalletter);


    }

    private static void mouseHoverRightClick(WebDriver driver,WebElement e) {
        Actions a=new Actions(driver);
        a.moveToElement(e).contextClick().build().perform();
    }
    //Enter string in capital letter using keydown
    private static void capitalLetterEnter(WebDriver driver,WebElement el) {
        Actions a=new Actions(driver);
        a.moveToElement(el).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
    }
}
