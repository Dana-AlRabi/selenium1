package steps;

import Driver.DriverClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AdsPopup extends DriverClass {
    public DriverClass driver1;

    public AdsPopup(DriverClass driver1) {
        this.driver1 = driver1;
    }
    @When("user close ad popup")
    public void userCloseAdPopup() {
        //driver. getWindowHandles();
        Alert ad = driver.switchTo().alert();
        ad.accept();
        //driver.findElement(By.xpath("//div[@class='modal-body']")).isDisplayed();
       //driver.findElement(By.xpath("//p[normalize-space()='Close']")).submit();
    }

    @Then("ad pop-up is closed")
    public void adPopUpIsClosed() {
        driver.findElement(By.xpath("//a[@id='restart-ad']")).isDisplayed();
    }
}
