package test_case_saucedemo;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Sauce_demo.Add_Product_To_cart;
import Sauce_demo.LoginPage;
import Sauce_demo.Successful_Checkout;

import static org.swaglabs.ddtpackage.LoginUsingUtility.LoginPage;

public class Sauce_Demo_Test {

    public static void main(String[] args) throws InterruptedException {


        //to handle Change PAssword popup

        ChromeOptions options=new ChromeOptions();
        Map<String,Object> prefs=new HashMap<>();
        prefs.put("profile.password_manager_leak_detection",false);
        options.setExperimentalOption("prefs", prefs);

        options.addArguments("---goast");
        WebDriver driver = new ChromeDriver(options);



        //WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage loginpage = new LoginPage(driver);
        loginpage.username().sendKeys("standard_user");
        loginpage.password().sendKeys("secret_sauce");
        loginpage.loginButton().click();



        //Add  Product To Cart

        Add_Product_To_cart cart = new Add_Product_To_cart(driver);
        cart.Product().click();
        Thread.sleep(1000);
        cart.AddtoCart().click();
        Thread.sleep(1000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(cart.ViewCart()));
        cart.ViewCart().click();
        Thread.sleep(1000);



        //Checkout PROCESS
        Successful_Checkout checkout = new Successful_Checkout(driver);
        checkout.CheckOut().click();
        Thread.sleep(1000);
        checkout.Firstname().sendKeys("Doe");
        checkout.Lastname().sendKeys("Jones");
        checkout.PostalCode().sendKeys("500011");
        Thread.sleep(1000);
        checkout.ContinueButton().click();
        Thread.sleep(1000);
        checkout.Finish().click();
        Thread.sleep(1000);
        checkout.MenuSidebar().click();
        Thread.sleep(1000);
        checkout.Logout();

        driver.close();



    }

}
