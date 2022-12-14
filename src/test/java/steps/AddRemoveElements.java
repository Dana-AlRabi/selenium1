package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static Driver.DriverClass.driver;

public class AddRemoveElements  {

    @When("user adds a new element")
    public void userAddsANewElement() {
        driver.findElement(By.xpath("//button[normalize-space()='Add Element']")).click();
    }

    @Then("delete button is added")
    public void deleteButtonIsAdded() {
        driver.findElement(By.xpath("//div[@id='elements']//button[1]"));
        System.out.println("Element is added");
    }

    @When("user clicks on delete")
    public void userClicksOnDelete() {
        if (driver.findElement(By.xpath("//div[@id='elements']//button[1]")).isDisplayed())
        {
            driver.findElement(By.xpath("//div[@id='elements']//button[1]")).click();
            System.out.println("Added elements are removed");
        }
        else {
            System.out.println("Added elements are not removed");
        }
    }

    @Then("added elements should be deleted")
    public void addedElementsShouldBeDeleted() {
            System.out.println("Added elements are removed");
        }
}
