package medunna.tests;

import medunna.pages.LoginPage;
import medunna.pages.RegistrationPage;
import medunna.utilities.ConfigReader;
import medunna.utilities.Driver;
import medunna.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_PasswordStrenghtTest extends ReusableMethods {

    @Test
    public void test() {

        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        loginPage.loginButton.click();
        loginPage.registerButton.click();

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.passwordTextBox.sendKeys("abcd");

        Assert.assertTrue(registrationPage.passwordStrengthRed.isDisplayed(), "HATA");

        bekle(4);

        //registrationPage.passwordStrengthRed.clear();

        registrationPage.passwordTextBox.sendKeys("123");
        Assert.assertTrue(registrationPage.passwordStrengthOrange.isDisplayed(), "HATA");

        bekle(4);

        registrationPage.passwordTextBox.sendKeys("+");
        Assert.assertTrue(registrationPage.passwordStrengthGreen1.isDisplayed(), "HATA");

        bekle(4);
        registrationPage.passwordTextBox.sendKeys("A");
        Assert.assertTrue(registrationPage.passwordStrengthGreen2.isDisplayed(), "HATA");




    }
}
