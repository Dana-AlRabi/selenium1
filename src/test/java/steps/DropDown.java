package steps;

import Driver.DriverClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends DriverClass {
    public DriverClass driver1;

    public DropDown(DriverClass driver1) {
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

