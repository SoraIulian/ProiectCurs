package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class CouponCodFail {
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
        ///WebDriverWait WaitExplicit = new WebDriverWait(driver, Duration.ofSeconds(3));
        ///WaitExplicit.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(driver.findElement(By.className("count")))));
        WebElement Count = driver.findElement(By.className("count"));
        Count.click();
        WebElement CouponCode = driver.findElement((By.id("coupon_code")));
        CouponCode.click();
        CouponCode.sendKeys("COD");
        WebElement CouponCodeEnter = driver.findElement(By.className("button"));
        CouponCodeEnter.click();
        WebElement CouponCodeFailMessage = driver.findElement(By.cssSelector("ul/li"));
        CouponCodeFailMessage.getText();

        ///WebElement CouponCodeFailMessage = driver.findElement(By.className("woocommerce-error"));
        ///String expectedLoginFailedMessage = "Coupon cod applied";
        ///String actualLoginFailedMessage = CouponCodeFailMessage.getText();
        ///Assert.assertEquals(CouponCodeFailMessage,CouponCode);




    }
}

