package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2 {

    /**
     *  TC-1: Verify error msg for blank username and password
     *  1. Launch facebook.com
     *  2. Click the log in button
     *  3. verify "The email or mobile number you entered isn’t connected to an account."
     *      error msg is displayed
     */

    @Test
    public void verifyErrorMsg(){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("login")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String actualText = driver.findElement(By.xpath("//div[text()='The email or mobile number you entered isn’t connected to an account. ']")).getText();

        String expectedText = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
        Assert.assertEquals(actualText, expectedText, "Expected text is not matching.");
        driver.quit();
    }





    /**
     *  TC-2: Verify Gender error msg on Create New Account screen
     *  1. Launch facebook.com
     *  2. Click the Create New Account button
     *  3. Enter firstName
     *  4. Enter lastName
     *  5. Enter mobile number
     *  6. Enter new password
     *  7. Click the "Sign Up" button
     *  8. verify "Please choose a gender. You can change who can see this later."
     *      error msg is displayed
     */

    @Test
    public void verifyGenderErrorMsg(){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the Create New Account button
        String createNewAccountXpath = "//*[text()='text']";
        By NewAccountLocator = By.linkText(createNewAccountXpath);
        WebElement createNewAcct = driver.findElement(NewAccountLocator);
        createNewAcct.click();

        //Enter firstName
        String FirstNameXpath = "//input[contains(@name,'first')]";
        By FirstNameLocator = By.xpath(FirstNameXpath);
        WebElement FirstNameBox = driver.findElement(FirstNameLocator);
        FirstNameBox.sendKeys("Taaaaa");

        /* short way
        By FirstNameLocator = By.xpath("//input[contains(@name,'first')]");
        WebElement FirstNameBox = driver.findElement(FirstNameLocator);
        FirstNameBox.sendKeys("Taaaaa");

        or

        driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("Taaaaa");
         */

        // Enter lastName
        driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Haaaa");

        //Enter mobile number
        driver.findElement(By.xpath("//*[text()='Mobile number or email']")).sendKeys("999 999 9999");

        //Enter new password
        driver.findElement(By.xpath("//*[text()='New password']")).sendKeys("abc@123");

        //Click the "Sign Up" button
        driver.findElement(By.xpath("//button[text()='Sign Up' and @name=websubmit]")).click();

        //verify "Please choose a gender. You can change who can see this later."

        String actualText = driver.findElement(By.xpath("//div[contains(text(), 'You can change who sees your gender ')]")).getText();

        String expectedText = "Please choose a gender. You can change who can see this later.";
        Assert.assertEquals(actualText, expectedText, "Expected text is not matching.");
        driver.quit();




    }

    /**
     * TC-3: Verify user lands on correct webpage after click Messenger link
     *  1. Launch facebook.com
     *      found the Messenger webElement
     *      get value of "href" using getAttribute method (String)  [https://messenger.com/]
     *  2. Click "Messenger" link
     *      find the currentUrl using getCurrentUrl (String)  [https://www.messenger.com/]
     *  3. Verify user lands on correct webpage.
     *
     */

    @Test
            public void VarifyMessengerLink(){

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //found the Messenger webElement
        String messengerLink = "//a[text()='Messenger']";
        By MessengerLocator = By.linkText(messengerLink);
        WebElement createNewAcct = driver.findElement(MessengerLocator);
        createNewAcct.click();

        //get value of "href" using getAttribute method (String)  [https://messenger.com/]
        String messengerWebLink = "//a[@href='https://messenger.com/']";
        By MessengerWebLocator = By.linkText(messengerWebLink);
        WebElement GetValueMessengerLink = driver.findElement(MessengerWebLocator);
        GetValueMessengerLink.getAttribute("https://messenger.com/]");

        //Click "Messenger" link
        driver.findElement(By.xpath("//a[text()='Messenger']")).click();

        //Verify user lands on correct webpage
        String actualText = driver.findElement(By.xpath("//div[contains(text(), 'Messenger makes it easy')]")).getText();

        String expectedText = "Messenger makes it easy and fun to stay close to your favorite people.";
        Assert.assertEquals(actualText, expectedText, "Expected text is matching.");
        driver.quit();




    }






}
