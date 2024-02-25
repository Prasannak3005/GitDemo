package baseClass;

import driverManager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.ActionHelper;

import java.time.Duration;

public class BaseClass {
    @BeforeSuite
    public void setDriver() {
        WebDriver driver = new FirefoxDriver();
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void quitDriver() {
        try {
            System.out.println("driver  : " + ActionHelper.driver().toString());
            if (!ActionHelper.driver().toString().contains("(null)"))
                ActionHelper.driver().quit();
        } catch (Exception e) {
        }
    }


}
