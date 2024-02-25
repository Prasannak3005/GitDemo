package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ActionHelper;

import java.util.List;

public class AddToCartPage {
    private static AddToCartPage instance= null;

    public static AddToCartPage getInstance() {
        if (instance == null) {
            instance = new AddToCartPage();
        }
        return instance;
    }
    private By cart = By.cssSelector("[routerlink*='cart']");
    private By cartSetion = By.cssSelector(".cartSetion h3");
    private By cartProducts = By.cssSelector("ZARA COAT 3");
    private By totalRow_Button = By.cssSelector(".totalRow button");

    public void click_On_cartProduct ()
    {
        ActionHelper.waitForElementVisible(cart, 10);
        ActionHelper.click(cart);
    }
    public void cartProducts()
    {
        List<WebElement> cartProducts = ActionHelper.findElements(cartSetion);
        boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase("ZARA COAT 3"));
    }
    public void totalRow_Button()
    {
        ActionHelper.click(totalRow_Button);
    }
}
