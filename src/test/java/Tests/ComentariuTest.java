package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class ComentariuTest {
    public WebDriver driver;
    @Test
    public void metodaTest(){
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
        WebElement Review = driver.findElement(By.className("woocommerce-review-link"));
        Review.click();

        WebElement ReviewStar = driver.findElement(By.className("star-5"));
        ReviewStar.click();

        WebElement Comment = driver.findElement(By.id("comment"));
        Comment.click();
        String Commentvalue = "Comentariu proba"+ System.currentTimeMillis();
        Comment.sendKeys(Commentvalue);


        WebElement Name = driver.findElement(By.id("author"));
        Name.click();
        Name.sendKeys("ContTest");
        WebElement Mail = driver.findElement(By.id("email"));
        Mail.click();
        Mail.sendKeys("iuliuscezar59@yahoo.com");
        Mail.submit();










    }
}
