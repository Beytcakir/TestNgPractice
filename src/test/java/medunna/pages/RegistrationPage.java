package medunna.pages;

import medunna.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#ssn")
    public WebElement ssnTextBox;


    @FindBy(css = "#firstname")
    public WebElement firstNameTextBox;


    @FindBy(css = "#lastname")
    public WebElement lastNameTextBox;


    @FindBy(css = "#username")
    public WebElement userNameTextBox;


    @FindBy(css = "#email")
    public WebElement emailTextBox;


    @FindBy(xpath = "//input[@name='firstPassword']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//input[@name='secondPassword']")
    public WebElement passwordConfirmationTextBox;


    @FindBy(css = "#register-submit")
    public WebElement registerButton;

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement passwordStrengthRed;

    @FindBy (xpath = "//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement passwordStrengthOrange;


    @FindBy (xpath = "//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement passwordStrengthGreen1;

    @FindBy (xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement passwordStrengthGreen2;


}