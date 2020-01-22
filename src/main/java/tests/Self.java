package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Self {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mekabek/Desktop/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.meetup.com/tr-TR/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Oturum aç")).click();
        driver.findElement(By.id("email")).sendKeys("hello");
        Thread.sleep(2000);



        driver.close();
    }

}
