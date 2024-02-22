package medunna.pages;

import medunna.utilities.ConfigReader;
import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (css = "#account-menu")
    public WebElement loginButton;

    @FindBy (css = "#login-item")
    public WebElement sigInButton;

    @FindBy (xpath = "//span[.='Register']")
    public WebElement registerButton;

    @FindBy (css = "#username")
    public WebElement userNameTextBox;

    @FindBy (css = "#password")
    public WebElement passwordTextBox;

    @FindBy (css = ".btn.btn-primary")
    public WebElement signInButton2;
    @FindBy (css = "#account-menu")
    public WebElement loginUserNameButton;

    public static void loginMedunna(){

        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        loginPage.loginButton.click();
        loginPage.sigInButton.click();

        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.signInButton2.click();
    }
}






