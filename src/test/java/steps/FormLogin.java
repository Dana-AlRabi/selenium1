package steps;

import Driver.driverClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.List;

public class formLogin extends driverClass {

    public driverClass driver1;

    public formLogin(driverClass driver1) {
        this.driver1 = driver1;
    }
    @And("user enter UserName And PassWord")
    public void userEnterUserNameAndPassWord(DataTable table) {
        List<List<String>> credentials = table.cells();

        driver.findElement(By.xpath("//h2[normalize-space()='Login Page']"));
        driver.findElement(By.id("username")).sendKeys(credentials.get(1).get(0));
        driver.findElement(By.id("password")).sendKeys(credentials.get(1).get(1));
    }

    @When("user clicks login")
    public void userClicksLogin() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        //assert page elements
        driver.findElement(By.id("flash"));
        driver.findElement(By.xpath("//h2[normalize-space()='Secure Area']"));
        driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).isDisplayed();
        driver.getCurrentUrl().contains("secure");

    }

    @Then("user is not logged in successfully")
    public void userIsNotLoggedInSuccessfully() {
        //assert page elements
        driver.findElement(By.xpath("//h2[normalize-space()='Login Page']"));

    }

    @And("Error message is displaying")
    public void errorMessageIsDisplaying() {
        //assert error
        driver1.driver.findElement(By.xpath("//div[@id='flash']"));
    }

    @When("user clicks logout")
    public void userClicksLogout() {
        driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
    }

    @Then("user is logged out successfully")
    public void userIsLoggedOutSuccessfully() {
        //assert page elements
        driver.findElement(By.xpath("//h2[normalize-space()='Login Page']"));
        driver.findElement(By.xpath("//div[@id='flash']"));
        driver.findElement(By.cssSelector("button[type='submit']"));
    }
}
