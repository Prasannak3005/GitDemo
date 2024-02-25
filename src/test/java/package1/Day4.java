package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {
    @AfterMethod
    public void afterevery()
    {
        System.out.println("i will come after every test method");
    }

    @Test(enabled = false)
    public void WebloginHomeLoan()
    {
        //selenium
        System.out.println("webloginHome");
    }

    @Test(timeOut = 2000)
    public void MobileLoginHomeloan()
    {
        //Appium
        System.out.println("mobileloginHome");
    }

    @Test(groups={"smoke"})
    public void LoginAPIHomelone()
    {
        //Rest API Aautomation()
        System.out.println("ApiloginHome");
    }
    @BeforeSuite
    public void Bfsuite()
    {
        System.out.println("iam no:1");
    }
    @BeforeMethod
    public void b4every()
    {
        System.out.println("i will come b4every test method in day4 class");
    }
}
