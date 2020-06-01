import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableExecrices {
    public static void main(String args[]){
        System.setProperty("webdriver.gecko.driver","/Users/rohitkumar/Documents/Selenium_driver/selenium/jar/geckodriver");
        WebDriver driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22781/nz-vs-ind-1st-test-india-tour-of-new-zealand-2020");
        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        //go to the 3rd child of each row//using parent chile relationship
        //parent (cb-col cb-col-100 cb-scrd-itms)
        //child (div-nth child(3)
        int sum=0;
        int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        for(int i=0;i<count-2;i++){
            String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            //System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
            //convert value(string) into int
            int valueInt=Integer.parseInt(value);
            sum+=valueInt;
        }
        //System.out.println(sum);
        //to get extra run we need to move one sibling to another sibling
        //System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
        String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        //System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
        String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int totalvalue=sum+Integer.parseInt(extra);
        System.out.println(totalvalue);
        if(totalvalue==Integer.parseInt(total)){
           System.out.println("equal");
        }
        else{
            System.out.println("fail");
        }
        //javascript executor use
     /* JavascriptExecutor js=(JavascriptExecutor)driver;
        String script="return document.getElementById(\"framespace\").value;";
        String text=(String)js.executeScript(script);
        System.out.println(text);
    */
    }
}
