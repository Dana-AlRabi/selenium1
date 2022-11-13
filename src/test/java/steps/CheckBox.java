package steps;

import Driver.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CheckBox extends DriverClass {
    public DriverClass driver1;

    public CheckBox(DriverClass driver1) {
        this.driver1 = driver1;
    }
    @When("user select first checkbox")
    public void userSelectFirstCheckbox() {
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
    }

    @Then("the checkbox is checked")
    public void theCheckboxIsChecked() {
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
    }

    @And("user unselect first checkbox")
    public void userUnselectFirstCheckbox() {
        if (driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected())
        {
            driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        }
        else {
            System.out.println("checkbox is not selected");
        }
    }

    @Then("the checkbox is unchecked")
    public void theCheckboxIsUnchecked() {

        boolean checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
        if (checkbox == false){

            System.out.println("checkbox 1 is unchecked");
        }
        else {

            System.out.println("checkbox 1 is still checked");
        }

    }


}
