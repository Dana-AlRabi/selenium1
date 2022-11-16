package steps;

import Driver.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static Driver.DriverClass.driver;

public class Redirect  {

    @And("user triggers a redirect")
    public void userTriggersARedirect() {
        driver.findElement(By.id("redirect")).click();
    }

    @And("user is on status codes page")
    public void userIsOnStatusCodesPage() {
        driver.findElement(By.linkText("200"));
        driver.findElement(By.linkText("301"));
        driver.findElement(By.linkText("404"));
        driver.findElement(By.linkText("500"));
    }

    @When("user click on Success code")
    public void userClickOnSuccessCode() {
        driver.findElement(By.linkText("200")).click();
    }

    @When("user click on redirection code")
    public void userClickOnRedirectionCode() {
        driver.findElement(By.linkText("301")).click();
    }

    @When("user click on client error code")
    public void userClickOnClientErrorCode() {
        driver.findElement(By.linkText("404")).click();
    }


    @When("user click on server error code")
    public void userClickOnServerErrorCode() {
        driver.findElement(By.linkText("500")).click();
    }

    @Then("user is redirected to the code page")
    public void userIsRedirectedToTheCodePage() {

        //Verify if user is redirected to the proper code page
        String CurrentUrl = driver.getCurrentUrl();
        if (driver.getCurrentUrl().contains("status_codes/200")) {
            driver.findElement(By.xpath("//p[contains(text(),'This page returned a 200 status code.')]")).isDisplayed();
            System.out.println("User is on Success status page");
        } else if (driver.getCurrentUrl().equalsIgnoreCase("http://the-internet.herokuapp.com/status_codes/301")) {
            driver.findElement(By.xpath("//p[contains(text(),'This page returned a 301 status code.')]")).isDisplayed();
            System.out.println("User is on  Redirection page");
        } else if (driver.getCurrentUrl().equalsIgnoreCase("http://the-internet.herokuapp.com/status_codes/404")) {
            driver.getCurrentUrl().equalsIgnoreCase("http://the-internet.herokuapp.com/status_codes/404");
            driver.findElement(By.xpath("//p[contains(text(),'This page returned a 404 status code.')]")).isDisplayed();
            System.out.println("User is on Client Error page");
        } else {
            driver.findElement(By.xpath("//p[contains(text(),'This page returned a 500 status code.')]")).isDisplayed();
            System.out.println("User is on Server Error page");
        }


    }

}
