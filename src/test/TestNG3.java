package test;

import org.testng.annotations.Test;

public class TestNG3 {
    @Test(timeOut = 4000)
    //if particulat test is taking some time we can provide specific time so that it will wait until that time
    public static void WebLoginCarLoan(){
        //selenium
        System.out.println("WebLoginCar");
    }
    @Test(dependsOnMethods ={"WebLoginCarLoan"})
    public static void MobileLoginCarLoan(){
        //Appium
        System.out.println("MobileLoginCar");
    }
    @Test(enabled = false)
    //there are 2 helper attribute 1.enabled 2.timeout
    //enable is helper attribute(which is used when we have to run particular case or not)
    public static void APILoginCarLoan(){
        //Rest API automatuon
        System.out.println("APiLoginCar");
    }

}
