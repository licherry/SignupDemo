package com.thoughtworks.chen.steps;

import com.thoughtworks.chen.domain.UserDetails;
import com.thoughtworks.chen.util.DriverFactory;
import cucumber.api.java.en.And;
import com.thoughtworks.chen.pages.SignUpPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.util.List;

/**
 * Created by chenli on 4/14/16.
 */
public class SignUpPageSteps extends DriverFactory {
    @And("^she provides the first name as \"([^\"]*)\"$")
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        new SignUpPage(driver).she_provides_the_first_name_as(firstName);
    }

    @And("^she provides the last name as \"([^\"]*)\"$")
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        new SignUpPage(driver).she_provides_the_last_name_as(lastName);
    }

    @And("^she provides the email as \"([^\"]*)\"$")
    public void she_provides_the_email_as(String email) throws Throwable {
        new SignUpPage(driver).she_provides_the_email_as(email);
    }

    @And("^she provides the password as \"([^\"]*)\"$")
    public void she_provides_the_password_as(String password) throws Throwable {
        new SignUpPage(driver).she_provides_the_password_as(password);
    }

    @And("^she provides the confirm password again as \"([^\"]*)\"$")
    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        new SignUpPage(driver).she_provides_the_confirm_password_again_as(confirmPassword);
    }

    @And("^she signs-up$")
    public void she_sign_up() throws Throwable {
        new SignUpPage(driver).she_sign_up();
    }

    @And("^she provides her details as follows:$")
    public void she_provides_her_detail_as_follows(List<UserDetails> users) throws Throwable {
        UserDetails userToBeSignedUp = users.get(0);

        new SignUpPage(driver).she_provides_the_first_name_as(userToBeSignedUp.firstName);
        new SignUpPage(driver).she_provides_the_last_name_as(userToBeSignedUp.lastName);
        new SignUpPage(driver).she_provides_the_email_as(userToBeSignedUp.email);
        new SignUpPage(driver).she_provides_the_password_as(userToBeSignedUp.password);
        new SignUpPage(driver).she_provides_the_confirm_password_again_as(userToBeSignedUp.password);
    }

}
