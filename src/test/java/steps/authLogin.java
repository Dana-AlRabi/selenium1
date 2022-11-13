package steps;

import Driver.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class authLogin extends driverClass {
    public driverClass driver1;

    public authLogin (driverClass driver1) {
        this.driver1 = driver1;
    }

    @When("user fills the pop-up with {string} and {string}")
    public void userFillsThePopUpWithAnd(String userName, String passWord) {
        String url = "https://" + userName + ":" + passWord + "@" + "the-internet.herokuapp.com/basic_auth";
        driver.get(url);
    }

    @Then("user should be logged in")
    public void userShouldBeLoggedIn() {

        // Verify congrats message
        driver.findElement(By.cssSelector("div[class='example'] p")).isDisplayed();

    }


    @And("user clicks login on the pop-up")
    public void userClicksLoginOnThePopUp() {
    }
}
