package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amdocsgdogruoglu\\IdeaProjects\\selenium-deneme\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://demoqa.com/");

        //Mazimize current window
        driver.manage().window().maximize();
        WebElement pageNavi = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]"));
        pageNavi.click();


        WebElement pageNavi2 = driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
        pageNavi2.click();


        WebElement userName = driver.findElement((By.id("userName")));
        userName.click();
        userName.sendKeys("Görkem");


        WebElement eMail = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
        eMail.click();
        eMail.sendKeys("gorkem@test.com");


        WebElement adress = driver.findElement((By.id("currentAddress")));
        adress.click();
        adress.sendKeys("Deneme Adresi Giriyoruz Bakalım");


        WebElement adress2 = driver.findElement((By.id("permanentAddress")));
        adress2.click();
        adress2.sendKeys(" Merhaba Finco ");


        WebElement submitbut = driver.findElement(By.id("submit"));
        submitbut.click();


        WebElement addressText = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/form/div[6]/div/p[4]"));
        String permanentAddress = addressText.getText();
        String splitChar = permanentAddress.split(":")[1];
        System.out.println(splitChar);


    }


}

