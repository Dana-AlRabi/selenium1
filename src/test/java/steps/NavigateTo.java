package steps;

import Driver.DriverClass;
import io.cucumber.java.en.Given;

import static Driver.DriverClass.sitePage;
import static Driver.DriverClass.driver;

public class NavigateTo {
   //this class is created for the shared navigate to site function

    private DriverClass driver1;

    public NavigateTo(DriverClass driver1) {
        this.driver1 = driver1;
    }

    @Given("user navigates to the {string}")
    public void userNavigatesToThe(String site) {
        driver1 .setSite(site);
        driver1 .setRedirectUrl(sitePage + driver1 .getSite());
        driver.navigate().to(driver1 .getRedirectUrl());
        driver.manage().window().maximize();
    }

}
