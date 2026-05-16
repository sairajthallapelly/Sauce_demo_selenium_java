package Sauce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Successful_Checkout {

    WebDriver driver;

    public Successful_Checkout(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement CheckOut() {
        return driver.findElement(By.id("checkout"));
    }

    public WebElement Firstname() {
        return driver.findElement(By.xpath("//*[@name='firstName']"));
    }

    public WebElement Lastname() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement PostalCode() {
        return driver.findElement(By.xpath("//*[@name='postalCode']"));

    }

    public WebElement ContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement Finish() {
        return driver.findElement(By.id("finish"));
    }

    public WebElement MenuSidebar() {
        return driver.findElement(By.partialLinkText("Open Menu"));
    }

    public WebElement Logout() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }


}
