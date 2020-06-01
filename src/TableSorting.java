
import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableSorting {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver = new FirefoxDriver();
        //Implicit wait(applies globally)
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        //driver.findElement(By.xpath("//a[@href='#/offers']")).click();
        //make a list of all the items which we need here it is list of 2nd column
        driver.findElement(By.cssSelector("tr th:nth-Child(2)")).click();
        driver.findElement(By.cssSelector("tr th:nth-Child(2)")).click();
      //  driver.findElement(By.xpath("//span[@class='sort-direction desc']")).click();
        List<WebElement> firstColumnList=driver.findElements(By.cssSelector("tr td:nth-Child(2)"));
        //make a new array list and keep all items in that list
        ArrayList<String> originalList=new ArrayList<String >();
        for(int i=0;i<firstColumnList.size();i++){
            String item=firstColumnList.get(i).getText();
            originalList.add(item);
        }
       // System.out.println(originalList);
        //make a new copy list which has all the items present
        ArrayList<String> copiedList=new ArrayList<String>();
        for(int i=0;i<originalList.size();i++){
            copiedList.add(originalList.get(i));
        }
        //we have collection framework to sort any list//so we are using collection framework concept
        Collections.sort(copiedList);
        //we are reversing ascending sorted list into decending order
        Collections.reverse(copiedList);
        //System.out.println(copiedList);
        for(String s:originalList){
            System.out.println(s);
        }
        System.out.println("------ copied list  sorted ------");
        for(String s:copiedList){
            System.out.println(s);
        }
        //here both list are same so assert should be true but m giving false so it should fail
        Assert.check(false,originalList.equals(copiedList));


    }
}
