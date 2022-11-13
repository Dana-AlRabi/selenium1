package steps;

import Driver.driverClass;
import io.cucumber.java.en.Given;

import static Driver.driverClass.SitePage;
import static Driver.driverClass.driver;

public class navigateTo {
   //this class is created for the shared navigate to site function

    private driverClass driver1;

    public navigateTo (driverClass driver1) {
        this.driver1 = driver1;
    }

    @Given("user navigates to the {string}")
    public void userNavigatesToThe(String site) {
        driver1 .setSite(site);
        driver1 .setRedirectUrl(SitePage + driver1 .getSite());
        driver.navigate().to(driver1 .getRedirectUrl());
        driver.manage().window().maximize();
    }

}
