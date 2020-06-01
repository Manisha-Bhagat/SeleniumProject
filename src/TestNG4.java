import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG4 {

        @Test
        public static void WebLoginHomeLoan(){
            //selenium
            System.out.println("WebLoginHome");
        }
        @Parameters({"URL"})
        @Test
        public static void MobileLoginHomeLoan(String urlname){
            //Appium
            System.out.println("MobileLoginHome");
            System.out.println(urlname);
        }
        @BeforeTest
        public static void APILoginHomeLoan(){
            //Rest API automatuon
            System.out.println("APiLoginHome");
        }


}
