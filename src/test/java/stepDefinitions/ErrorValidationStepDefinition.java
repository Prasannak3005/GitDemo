//package stepDefinitions;
//
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import java.time.Duration;
//import java.util.List;
//
//public class ErrorValidationStepDefinition {
//    static WebDriver driver;
//
//    @Given("User is on login page")
//    public void User_is_on_login_page() {
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://rahulshettyacademy.com/client");
//    }
////
////    @When("User enters valid username and password")
////    public void User_enters_valid_username_and_password() {
////        driver.findElement(By.id("userEmail")).sendKeys("prasannak3005@gmail.com");
////        driver.findElement(By.id("userPassword")).sendKeys("Chintu@");
////    }
//
//    @And("Clicks on Login Button")
//    public void Clicks_on_Login_Button() {
//        driver.findElement(By.id("login")).click();
//
//    }
//
//    @Then("User is navigated to Home Page")
//    public void User_is_navigated_to_Home_Page() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement prod = products.stream().filter(product ->
//                product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);//*
//        prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
//        //ng-animating
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
//        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
//
//        List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
//        boolean match = cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase("ZARA COAT 3"));//*
//
//        driver.findElement(By.cssSelector(".totalRow button")).click();
//
//        Actions a = new Actions(driver);
//        a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.xpath("//*[contains(@class,'action__submit ')]")).click();
//
//        String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
//        Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
//
//    }
//
//    @And("Close the browser")
//    public void Close_the_browser() {
//        driver.close();
//    }
//
//}
