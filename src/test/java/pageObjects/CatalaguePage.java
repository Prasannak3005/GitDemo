package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ActionHelper;

import java.util.List;

public class CatalaguePage {
    private static CatalaguePage instance= null;

    public static CatalaguePage getInstance(){
        if(instance==null){
            instance =  new CatalaguePage();
        }
        return instance;
    }
    private By  products = By.cssSelector(".mb-3");
    private By toast_container = By.cssSelector("#toast-container");
    private By ng_animation = By.cssSelector(".ng-animating");



    public void  getProducts(String productsName) {
        ActionHelper.waitForElementVisible(products,10);
        List<WebElement> products_List = ActionHelper.findElements(products);
        WebElement prod = products_List.stream().filter(product ->
                product.findElement(By.cssSelector("b")).getText().equals(productsName)).findFirst().orElse(null);//*
        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

        ActionHelper.waitForElementVisible(By.cssSelector("#toast-container"), 10);
        //ng-animating
        ActionHelper.waitForElementVisible(By.cssSelector(".ng-animating"), 10);


    }




}
