package utils;

import driverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ActionHelper {

    public static WebElement findElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }
    public static WebDriver driver() {
        return DriverManager.getDriver();
    }

    public static List<WebElement> findElements(By by) {
        return DriverManager.getDriver().findElements(by);
    }
    public static void click(By by){
        findElement(by).click();
    }

    public static void getUrl(String url) {
        DriverManager.getDriver().get(url);
    }

    public static void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public static void waitForElementVisible(By by, int WaitInSecs) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(WaitInSecs));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



    public static void closeBrowser() {
        driver().close();
    }

}
