package medunna.tests;

import medunna.pages.LoginPage;
import medunna.utilities.ConfigReader;
import medunna.utilities.Driver;
import medunna.utilities.ReusableMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends ReusableMethods {

    @Test
    public void test() {

        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        loginPage.loginButton.click();
        loginPage.sigInButton.click();

        loginPage.userNameTextBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        loginPage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        loginPage.signInButton2.click();

        bekle(5);
        System.out.println("Kullanici Adi: " + loginPage.loginUserNameButton.getText());
        Assert.assertEquals(loginPage.loginUserNameButton.getText(), "Admin Batch210", "HATA");

        Driver.closeDriver();
    }
}