package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/mekabek/Desktop/automation/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

    }
}
