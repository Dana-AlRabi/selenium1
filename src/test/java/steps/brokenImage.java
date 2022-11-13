package steps;

import Driver.driverClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class brokenImage extends driverClass {
    public driverClass driver1;

    public brokenImage (driverClass driver1) {
        this.driver1 = driver1;
    }
    @When("user verify id image is broken")
    public void userVerifyIdImageIsBroken() {

        WebElement i = driver.findElement(By.xpath("//img[@src='asdf.jpg']"));
        Boolean img = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                + "&& arguments[0].naturalWidth > 0", i);
        if (img == false){
            System.out.println("image is broken");
        }
        else{
            System.out.println("image is not broken");
        }
    }

}
