import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {


    @Test
    public void site_header_is_on_home_page() {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoqa.com");

        driver.manage().window().maximize();

        WebElement pageNav1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));

        pageNav1.click();

        WebElement test1 =driver.findElement(By.xpath("//*[@id=\"item-1\"]"));

        test1.click();
    }


}