package Sauce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {


    static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver= driver;

    }

    public WebElement username() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement password() {
        return driver.findElement(By.id("password"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.id("login-button"));
    }





}


