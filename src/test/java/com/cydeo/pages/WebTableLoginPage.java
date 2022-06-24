package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "username")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/form/button")
    public WebElement inputLoginButton;

    /**
     * No parameters
     * When we call this method, it will directly login using
     *
     * Username : Test
     * Password : Tester
     */
    public void login(){
        this.inputUsername.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.inputLoginButton.click();
    }

    /**
     * This method will accept two arguments and login.
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        inputUsername.sendKeys(userName);
        inputPassword.sendKeys(password);
        inputLoginButton.click();

    }

    /**
     * This method will log in using credentials from configuration.properties
     */

    public void loginWithConfig(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("web.table.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("web.table.pw"));
        inputLoginButton.click();
    }

}
