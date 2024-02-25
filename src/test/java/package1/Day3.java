package package1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

    @BeforeClass
    public void beforeclass()
    {
        System.out.println("Before executing any methods in the class");
    }


    @Parameters({"URL"})
    @Test
    public void WebloginCarLoan(String URLName)
    {
        //selenium
        System.out.println("weblogincar");
        System.out.println(URLName);

    }

    @Test(dataProvider = "getdata")
    public void MobileLoginCarloan(String Username, String password)
    {
        //Appium
        System.out.println("mobilelogincar");
        System.out.println("String Username");
        System.out.println("String password");

    }
    @Test(groups={"smoke"})
    public void MobileSignin()
    {
        //Appium
        System.out.println("mobileSignin");
    }
    @Test()
    public void MobileSignout()
    {
        //Appium
        System.out.println("mobileSignout");
    }

    @Test(dependsOnMethods = {"WebloginCarLoan"})
    public void APILogincarlone()
    {
        //Rest API Aautomation()
        System.out.println("APILogincar");
    }
    @DataProvider
    public Object[][] getdata()
    {
        //1st combination - username password - good credit history
        //2nd combination - username password - no credit history
        //3rd combination - username password - fraudelent credit history
         Object[][] data = new Object[3][2];
         // 1st set
         data[0][0] = "1stsetusername";
         data[0][1] = "1stsetpassward";

         //2nd set
        data[2][0] = "2ndsetusername";
        data[2][1] = "2ndsetpassward";

        //3rd set
        data[2][0] = "3rdsetusername";
        data[2][1] = "3rdsetpassward";
        return data;

    }
}
