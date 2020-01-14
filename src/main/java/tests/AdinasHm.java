package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

public class AdinasHm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mekabek/Desktop/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.homedepot.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"headerMyAccountTitle\"]/div")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Thebestknowledge7@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password-input-field\"]")).sendKeys("120288id");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("60656");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("5138358617");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"single-signin__body\"]/div/div[2]/form/button[1]/span")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
