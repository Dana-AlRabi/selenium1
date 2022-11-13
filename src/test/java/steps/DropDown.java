package steps;

import Driver.driverClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;

public class dropDown extends driverClass {
    public driverClass driver1;

    public dropDown (driverClass driver1) {
        this.driver1 = driver1;
    }

    Select ddlOptions = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
    @When("user selects option {string}")
    public void userSelectsOption(String option) {
        ddlOptions.selectByValue(String.valueOf(1));
    }

    @Then("{string} is chosen")
    public void isChosen(String option) {
        ddlOptions.equals(option);
        System.out.println(option);
    }

}

