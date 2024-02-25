package pageObjects;

import org.openqa.selenium.By;
import utils.ActionHelper;

public class LoginPage {
    private static LoginPage instance= null;

    public static LoginPage getInstance(){
        if(instance==null){
            instance =  new LoginPage();
        }
        return instance;
    }



    private By userName_TxtBox = By.id("userEmail");
    private By userPassword_TxtBox = By.id("userPassword");
    private By Clicks_on_Login_Button = By.id("login");


    public void fill_UserName_TxtBox(String userName){

        ActionHelper.sendKeys(userName_TxtBox,userName);
    }


    public void fill_userPassword_TxtBox(String userPassword){
        ActionHelper.sendKeys(userPassword_TxtBox,userPassword);
    }
    public void clickon_Login_Btn() throws InterruptedException {
        ActionHelper.click(By.id("login"));
        Thread.sleep(1000);
    }


    public void launchLoginPageOfUrl(String loginPageUrl){
        ActionHelper.getUrl(loginPageUrl);
    }
}
