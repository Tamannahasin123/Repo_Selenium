package Class3;

public class Locators {

    /**
     *
     * Locator : It's a kind of route to reach/find the desired webElement.
     * Datatype of Locator --> By
     *          example = By variableName = we can store our locator
     *          every locator is By datatype
     * Steps to interact with WebElement:
     * 1. Find the unique address to reach webElement using DOM
     *
     * 2. Depending upon the type of address/info,
     *      we use specific method from By-Class to create locator
     * 3. Use locator to find the WebElement (using findElement() method)
     * 4. when webElement is found, interact with it.
     *
     * Address:
     * 1. id attribute (unique)
     *          In chropath, check if id is unique --> //*[@id='idValue']
     *          By locatorUsingId = By.id("idValue")
     *          find on ChroPath - type //*[@id='email'] enter
     *
     * 2. name attribute
     *          In chropath, check if name is unique --> //*[@name='nameValue']
     *          By locatorUsingName = By.name("nameValue")
     *          find on ChroPath - type //*[@name='email'] enter
     *
     * 3. className
     *          In chropath, check if className is unique --> //*[@class='classValue']
     *          By locatorUsingName = By.className("classValue")
     *
     * 4. linkText
     *          In chropath, check if linkText is unique --> //a[text()='link text']
     *          By locatorUsingLinkText = By.linkText("linkText")
     *          // text we use //a on ChroPath, exp - //a[text()='Forgot Password?']
     *
     * 5. partialLinkText
     *          In chropath, check if link has unique partial text --> //a[contains(text(), 'partial link text')]
     *          By locatorUsingPartialLinkText = By.partialLinkText("partial link text value")
     *          // on ChroPath, exp - //a[text()='got Password?']
     *
     * 6. tagName
     *         In chropath, check if tagName is unique --> //tagName
     *         By locatorUsingTagName = By.tagName("tagNameValue")
     *
     * ....continue in Class4/Locator_2.java
     *
     */

    /**
     * Links:
     *      1. Always with 'a' tag
     *      2. "href" attribute's value defines the webpage user will go if click on the link
     *      3. Text associated with a link is called linkText.
     *
     */
        // class, id we use //* on ChroPath
        // text we use //a on ChroPath, exp - //a[text()='Forgot Password?']



}
