package steps;

import Driver.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class keyPresses extends driverClass {

    public driverClass driver1;
    public keyPresses (driverClass driver1) {
        this.driver1 = driver1;
    }


    @And("user press any key on the keyboard")
    public void userPressAnyKeyOnTheKeyboard() {
        //TAB
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.TAB);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //DELETE
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.DELETE);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //F12
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.F12);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //PAGE_UP
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.PAGE_UP);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //EQUALS
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.EQUALS);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //SHIFT
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.SHIFT);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //ENTER
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //HOME
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.HOME);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //BACK_SPACE
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
        //ARROW_UP
        driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ARROW_UP);
        driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();
    }
}
