package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

    public static void main(String[] args) {


        // Path of the driver (chrome)
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Webdriver is key and Drivers/ is value

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
}
