package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utils.ActionHelper;

import static driverManager.DriverManager.getDriver;

public class AddressPage {
    private static AddressPage instance = null;

    public static AddressPage getInstance() {
        if (instance == null) {
            instance = new AddressPage();
        }
        return instance;
    }

    private By select_Country = By.cssSelector("[placeholder='Select Country']");
    private By results = By.cssSelector(".ta-results");
    private By item = By.xpath("(//button[contains(@class,'ta-item')])[2]");
    private By submit = By.xpath("//*[contains(@class,'action__submit ')]");



    public  void select_Country(String india) {
        Actions a = new Actions(getDriver());
        a.sendKeys(ActionHelper.findElement(select_Country),india).build().perform();
        ActionHelper.findElement( results);
    }

    public  void click_On_Submit() {
        ActionHelper.click(item);
        ActionHelper.click( submit);
    }
    public  void close_The_Browser()
    {
        ActionHelper.closeBrowser();
    }
}
