package steps;

import Driver.DriverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static Driver.DriverClass.driver;

public class IFrame {


    @When("user navigate to timnymce field")
    public void userNavigateToTimnymceField() {
        //Frame selection
        driver.switchTo().frame("mce_0_ifr");
    }

    @And("user add a content")
    public void userAddAContent() {
        //Filling the field within the frame
        driver.findElement(By.id("tinymce")).sendKeys("<h1>hello world</h1>");
    }

    @Then("content is added")
    public void contentIsAdded() {
        //Printing the inserted text
       String content = driver.findElement(By.cssSelector("html")).getText();
        System.out.println(content);

    }
}
