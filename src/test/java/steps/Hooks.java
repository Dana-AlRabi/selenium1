package steps;

import Driver.DriverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends DriverClass {

    private DriverClass driver1;

    public Hooks(DriverClass driver1) {
        this.driver1= driver1;
    }


    @Before
    public void initializeTest() {

        System.out.println("Opening the browser: Chrome");

        //Passing a WebDriver instance
        System.setProperty("webdriver.chrome.driver", "C:/automation/chromedriver_win32/chromedriver.exe" );
        driver = new ChromeDriver();

    }

    @After
    public void teardownTest() {
       driver.close();
    }

}