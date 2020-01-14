package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLVerification {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mekabek/Desktop/automation/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.close();
        String actualTURL=driver.getCurrentUrl();
        if (actualTURL.contains("amazon")){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
    }

    }
