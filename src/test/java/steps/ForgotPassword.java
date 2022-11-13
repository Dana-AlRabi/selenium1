package steps;

import Driver.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class ForgotPassword extends DriverClass {

    private DriverClass driver1;

    public ForgotPassword(DriverClass driver1) {
        this.driver1 = driver1;
    }

    @When("user enters the email {string}")
    public void userEntersTheEmail(String email) {
        driver.findElement(By.id("email")).sendKeys("alrabi.dana@gmail.com");
    }

    @And("user clicks on retrieve password action")
    public void userClicksOnRetrievePasswordAction() {

        driver.findElement(By.id("form_submit")).click();
    }

    @Then("user is redirected to email is sent page")
    public void userIsRedirectedToEmailIsSentPage() {

        driver.findElement(By.cssSelector("body h1")).isDisplayed();
        System.out.println("Internal server error page is opened");
    }
}
