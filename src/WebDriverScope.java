import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class WebDriverScope {
    public static void main(String[] args) throws InterruptedException {
        //1.count the no of links in page
        // 2.count the no of links in footer section of page
        System.setProperty("webdriver.gecko.driver", "/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        //3. count the no of links only in first column of footer section
        WebElement coumndriver=driver.findElements(By.xpath("//div//table//tbody//tr//td[1]//ul[1]")).get(0);
        System.out.println(coumndriver.findElements(By.tagName("a")).size());
        //click on each link and check if windows are opening
        for(int i=1;i<coumndriver.findElements(By.tagName("a")).size();i++) {
            String clickonlinktab = Keys.chord(Keys.COMMAND, Keys.ENTER);
            coumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        }
        //not printing different window title
            Set<String> windowlist = driver.getWindowHandles();
            Iterator<String> ids = windowlist.iterator();
            while(ids.hasNext()){
                driver.switchTo().window(ids.next());
                System.out.println(driver.getTitle());
            }
    }
}
