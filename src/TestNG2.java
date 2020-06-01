import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 {
    @BeforeSuite
    public static void testcase3(){
        System.out.println("test3example");
    }
    @Test(groups={"smoke"})
    public static void testcase4(){
        System.out.println("test4example");
    }
}
