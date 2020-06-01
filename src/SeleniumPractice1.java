import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import java.io.File;
import java.io.IOException;

public class SeleniumPractice1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        //System.setProperty("webdriver.chrome.driver","/Users/rohitkumar/Documents/Selenium_driver/chromedriver");
        System.setProperty("webdriver.gecko.driver","/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        //WebDriver driver=new ChromeDriver()
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value='radio1']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("autocomplete")).sendKeys("india");
        Thread.sleep(5000);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.findElement(By.id("dropdown-class-example")).click();
        Thread.sleep(5000);
        Select drop=new Select(driver.findElement(By.id("dropdown-class-example")));
        Thread.sleep(5000);
        drop.selectByIndex(2);
        //Take screenshot
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("/Users/rohitkumar/Documents/Selenium_driver/selenium/screenshot.png"));


    }

}
