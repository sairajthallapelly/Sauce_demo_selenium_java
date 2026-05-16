package Sauce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_Product_To_cart {

    static WebDriver driver;

    public Add_Product_To_cart(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement Product() {
        return driver.findElement(By.partialLinkText("Sauce Labs Backpack"));
    }

    public WebElement AddtoCart() {
        return driver.findElement(By.id("add-to-cart"));
    }

    public WebElement ViewCart() {
        return driver.findElement(By.xpath("//*[@data-test='shopping-cart-link']"));
    }

}