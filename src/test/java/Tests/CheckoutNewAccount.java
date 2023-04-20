package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class CheckoutNewAccount {
    public WebDriver driver;

    @Test
    public void metodaTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://atid.store/");
        driver.manage().window().maximize();
        driver.get("https://atid.store/store");
        WebElement SearchBar = driver.findElement(By.className("wc-block-product-search__field"));
        SearchBar.click();
        SearchBar.sendKeys("Green");
        SearchBar.submit();
        WebElement Shoes = driver.findElement(By.className("astra-shop-thumbnail-wrap"));
        Shoes.click();
        WebElement AddProduct = driver.findElement(By.className("single_add_to_cart_button"));
        AddProduct.click();

        WebElement Checkout = driver.findElement(By.className("checkout-button"));
        Checkout.click();



    }
}





