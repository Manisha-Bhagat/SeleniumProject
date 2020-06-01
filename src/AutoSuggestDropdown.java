import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
public class AutoSuggestDropdown {
    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Enter the letters BENG
        // Verify if Airport option is displayed in the suggestive box
 /*       driver.get("https://www.ksrtc.in");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

        //Javascript DOM can extract hidden elements
        //because selenium cannot identify hidden elements - (Ajax implementation)
        //investigate the properties of object if it have any hidden text
        //JavascriptExecutor
        JavascriptExecutor js= (JavascriptExecutor)driver;
        String script = "return document.getElementById(\"fromPlaceName\").value;";
        String text=(String) js.executeScript(script);
        System.out.println(text);
        int i =0;
        //BENGALURU INTERNATION AIPORT
        while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
        {
            i++;
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            text=(String) js.executeScript(script);
            System.out.println(text);
            if(i>10)
            {
                break;
            }
        }
        if(i>10)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element  found");
        }

  */


                driver.get("https://rahulshettyacademy.com/AutomationPractice/");
                driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("india");
               // driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
                //System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getText());
                JavascriptExecutor js= (JavascriptExecutor)driver;
                String script = "return document.getElementById(\"autocomplete\").value;";
                String text=(String) js.executeScript(script);
                System.out.println(text);
                int i =0;

                while(!text.equalsIgnoreCase("India"))
                {
                    i++;
                    driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
                    text=(String) js.executeScript(script);
                    System.out.println(text);
                    if(i>10)
                    {
                        break;
                    }
                }
                if(i>10)
                {
                    System.out.println("Element not found");
                }
                else
                {
                    System.out.println("Element  found");
                }



    }
}
