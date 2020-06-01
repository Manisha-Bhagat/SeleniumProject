import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import test.StaticVarJavaExample;

public class Assignment {
    public static void  main(String args[]){
        System.setProperty("webdriver.gecko.driver","/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.xpath("//label[@for='bmw']")).getText());
        String checkboxlabel=driver.findElement(By.xpath("//label[@for='bmw']")).getText();
        driver.findElement(By.id("dropdown-class-example")).click();
        Select drop=new Select(driver.findElement(By.id("dropdown-class-example")));
        drop.selectByVisibleText(checkboxlabel);
        driver.findElement(By.id("name")).sendKeys(checkboxlabel);
        driver.findElement(By.id("alertbtn")).click();
        String text=driver.switchTo().alert().getText();
        if(text.contains(checkboxlabel)){
            System.out.println("Alert message success");
        }
        else{
            System.out.println("Something wrong with execution");
        }

    }
}
