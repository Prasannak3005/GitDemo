package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjects.AddToCartPage;
import pageObjects.AddressPage;
import pageObjects.CatalaguePage;
import pageObjects.LoginPage;
import utils.ActionHelper;
import utils.Constants;

import java.util.List;

import static driverManager.DriverManager.getDriver;

public class LoginStepDefinition {
    @Given("User is on login page")
    public void User_is_on_login_page() {
        LoginPage.getInstance().launchLoginPageOfUrl(Constants.LOGIN_URL);
    }

    @When("User enters valid username and password")
    public void User_enters_valid_username_and_password() {
        LoginPage.getInstance().fill_UserName_TxtBox("prasannak3005@gmail.com");
        LoginPage.getInstance().fill_userPassword_TxtBox("Chintu@123");
    }

    @And("Clicks on Login Button")
    public void Clicks_on_Login_Button() throws InterruptedException {
        LoginPage.getInstance().clickon_Login_Btn();

    }

    @Then("User is navigated to Home Page")
    public void User_is_navigated_to_Home_Page() {
        CatalaguePage.getInstance().getProducts("ZARA COAT 3");

        AddToCartPage.getInstance().click_On_cartProduct();

        AddToCartPage.getInstance().cartProducts();//*

        AddToCartPage.getInstance().totalRow_Button();

        AddressPage.getInstance().select_Country("india");

        AddressPage.getInstance().click_On_Submit();

    }
    @And("Close the browser")
    public void Close_the_browser() {
        AddressPage.getInstance().close_The_Browser();
    }
}
