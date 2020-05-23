package com.vytrack.pages;

//make this Driver comes from utilities

import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPageBase{

    //these two are instant variables
    @FindBy(id="prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(id = "_submit")
  private WebElement login;

    @FindBy(linkText = "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;


    //method that returns a text of warning message webelement
    // Call it in the test class
    public String getWarningMessageText(){
        return warningMessage.getText();
    }

    /***
     * Method to login , version #1
     * @param usernameValue
     * @param passwordValue
     * log in as a specific user
     */
    public void login(String usernameValue , String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.wait(3);
    }

    /***
     * Method to login
     * Credentials will be retrieved from configuration.properties file
     */
    public  void login(){
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.wait(3);
    }
    }



