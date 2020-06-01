import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import java.util.function.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumPrac2 {
    //all types of wait included
    public static void main(String[] args) throws InterruptedException {
        String[] item = {"Cucumber", "Potato"};
        System.setProperty("webdriver.gecko.driver", "/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait w = new WebDriverWait(driver, 5); //explict wait(webdriver wait)
        //Implicit wait(applies globally)
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        addItems(item, driver);
        driver.findElement(By.cssSelector("img[src='./images/bag.png']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        //explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        //Fluent wait
 /*      Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
        WebElement foo=wait.until(new Function<WebDriver,WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.xpath("//span[@class='promoInfo']")).isDisplayed()){
                    return driver.findElement(By.xpath("//span[@class='promoInfo']"));
                }
                else{
                    return null;
                }
            }
        });
*/
        System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
    }

    private static void addItems(String[] item, WebDriver driver) throws InterruptedException {
        List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
        int j = 0;
        for (int i = 0; i < product.size(); i++) {
            String[] name = product.get(i).getText().split("-");
            String formattedName = name[0].trim();
            //format it to actual vegetable name using split
            //add 2 items in cart
            //convert array to arraylist
            //this loop run 30 times(avoid that)
            List itemList = Arrays.asList(item);
            if (itemList.contains(formattedName)) {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                if (j == itemList.size()) {
                    break;
                }
            }
        }
    }
}


