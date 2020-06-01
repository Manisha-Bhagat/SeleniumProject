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
public class MultipleWindow {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /*driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=AddSession");
        Actions a=new Actions(driver);
        WebElement childWindow1=driver.findElement(By.xpath("//a[@jsname='JFyozc']"));
        WebElement childWindow2=driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement childWindow3=driver.findElement(By.xpath("//a[text()='Privacy']"));        //use shift and click(new window will open)
        a.moveToElement(childWindow1).keyDown(Keys.SHIFT).click(childWindow1).build().perform();
        System.out.println(driver.getTitle());//it displays Parent window
        a.moveToElement(childWindow2).keyDown(Keys.SHIFT).click(childWindow2).build().perform();
        System.out.println(driver.getTitle());
        a.moveToElement(childWindow3).keyDown(Keys.SHIFT).click(childWindow3).build().perform();
        System.out.println(driver.getTitle());
        //store all the windows in Array List
        //ArrayList<String> windowsList=new ArrayList<>(driver.getWindowHandles());
        //switch to child windows(issue is last window is not printing title)
        //driver.switchTo().window(windowsList.get(2));
        // System.out.println(driver.getTitle());
        //store all the windows in Set(issue is last window is not printing title)
        Set<String> windowsSet=driver.getWindowHandles();
        Iterator<String> it=windowsSet.iterator();
        String parent=it.next();
        String frstChld=it.next();
        String ScndChld=it.next();
        String ThrdChld=it.next();
        driver.switchTo().window(ThrdChld);
        System.out.println(driver.getTitle());
        */
        //Assignment code from scratch
        driver.get("http://the-internet.herokuapp.com/");
        //WebElement childWindow1=driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
        //childWindow1.click();
        //driver.findElement(By.cssSelector("a[href*='windows']")).click();
       /* Set<String> windowsSet=driver.getWindowHandles();
        Iterator<String> it=windowsSet.iterator();
        String parent=it.next();
        String child=it.next();
        String child2=it.next();
        driver.switchTo().window(child);
       */
        //ArrayList<String> windowsList=new ArrayList<>(driver.getWindowHandles());
        //driver.switchTo().window(windowsList.get(0));
        //System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
        //Assignment code from scratch for Frame
        driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
