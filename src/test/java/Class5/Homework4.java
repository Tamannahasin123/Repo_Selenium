package Class5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework4 {

        /**
         * Tc-1: darksky.net
         * Verify blog post date is showing in correct format Monthname, Date Year
         */
        @Test
                public void VerifyBlog() {

                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.darksky.net");

                try {
                        Thread.sleep(2000);     // 1 sec = 1000milliseconds
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                // Click on Dark Sky API

                String DarkSkyAPIXpath = "//a[@href='Dark Sky API']";
                By DarkSkyAPILocator = By.xpath(DarkSkyAPIXpath);
                WebElement DarkSkyAPIbox = driver.findElement(DarkSkyAPILocator);
                DarkSkyAPIbox.click();

                // Click on Blog post
                String BlogPostXpath = "//a[text()='blog post']";
                By BlogPostLocator = By.xpath(BlogPostXpath);
                WebElement BlogPostLink = driver.findElement(BlogPostLocator);
                BlogPostLink.click();

                String BlogDateXpath = "//time[@itemprop='datePublished'])[1]]";
                By BlogPostDateLocator = By.xpath(BlogDateXpath);
                WebElement BlogPostDate = driver.findElement(BlogPostDateLocator);
                BlogPostDate.click();

        }

                /**
                 * TC-2: Verify the correct roomCount and guestCount on Homepage
                 *
                 * Launch hotels.com
                 * update adults count
                 * update children count
                 * verify the correct count for room, adults and children in guest section
                 * verify the correct total-count for room, adults and children in search bar
                 *
                 */


                @Test
                public void verifyCount() {

                System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.hotels.com");

                try {
                        Thread.sleep(2000);     // 1 sec = 1000milliseconds
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }

                String adultcountXpath = "//span[text()='1 room, 2 guests']/following-sibling::input//[text()='hidden']";
                By adultCountLocator = By.xpath(adultcountXpath);
                WebElement AdultCount = driver.findElement(adultCountLocator);
                AdultCount.sendKeys("2");

                String ChildcountXpath = "//span[text()='1 room, 2 guests']/following-sibling::input//[text()='hidden']";
                By ChildCountLocator = By.xpath(ChildcountXpath);
                WebElement ChildCount = driver.findElement(ChildCountLocator);
                ChildCount.sendKeys("1");

                String correctCount = "Count for room, adults and children";

        }
}
