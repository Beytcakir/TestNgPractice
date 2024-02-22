package medunna.tests;

import com.github.javafaker.Faker;
import medunna.pages.LoginPage;
import medunna.pages.RegistrationPage;
import medunna.utilities.ConfigReader;
import medunna.utilities.Driver;
import medunna.utilities.ReusableMethods;
import org.testng.annotations.Test;

public class RegisterTest extends ReusableMethods {

    @Test
    public void test() {
        LoginPage loginPage = new LoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        loginPage.loginButton.click();
        loginPage.registerButton.click();

        RegistrationPage registrationPage = new RegistrationPage();
        Faker faker = new Faker();

        // SSN
        registrationPage.ssnTextBox.sendKeys(faker.idNumber().ssnValid());

        // First Name
        String firstName = faker.name().firstName();
        registrationPage.firstNameTextBox.sendKeys(firstName);

        // Last Name
        String lastName = faker.name().lastName();
        registrationPage.lastNameTextBox.sendKeys(lastName);

        // Username
        String userName = firstName + lastName;
        registrationPage.userNameTextBox.sendKeys(userName);

        // e MAIl
        registrationPage.emailTextBox.sendKeys(faker.internet().emailAddress());

        // Password
        String password = faker.internet().password(8, 12, true, true, true);
        registrationPage.passwordTextBox.sendKeys(password);

        // Password Confirm
        registrationPage.passwordConfirmationTextBox.sendKeys(password);

        // Register Button
        registrationPage.registerButton.click();

    }
}