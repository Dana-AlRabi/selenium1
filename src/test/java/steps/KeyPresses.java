package steps;

import Driver.DriverClass;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static Driver.DriverClass.driver;

public class KeyPresses {


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
