import org.testng.annotations.*;

public class TestNgExample {
@BeforeClass

    @Test(groups={"smoke"})
    public void testcase1(){
        System.out.println("hello");
    }
    @Test(dataProvider = "getData")
    public void testcase2(String username,String Password){
        System.out.println("hello 2");
        System.out.println(username);
        System.out.println(Password);
    }
    @DataProvider
    //it is used to provide  multiple input data
    public Object[][] getData(){
        //1st combination -username-Pwd -good credit history
        //2nd combination - username -pwd - no credit history
        //3rd combination- fradulent credit history
        Object[][] data=new Object[3][2];
        //row defines number of combination
        //column defines no of variable=2 here(username and pwd)
        data[0][0]="firstsusername";
        data[0][1]="firstpwd";
        data[1][0]="secondsusername";
        data[1][1]="secondtpwd";
        data[2][0]="thirdsusername";
        data[2][1]="thirdpwd";
        return data;
    }

}
