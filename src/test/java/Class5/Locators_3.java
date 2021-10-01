package Class5;

public class Locators_3 {

    /**
     *
     * Locator : It's a kind of route to reach/find the desired webElement.
     * Datatype of Locator --> By
     *
     * Steps to interact with WebElement:
     * 1. Find the unique address to reach webElement using DOM
     * 2. Depending upon the type of address/info,
     *      we use specific method from By-Class to create locator
     * 3. Use locator to find the WebElement (using findElement() method)
     * 4. when webElement is found, interact with it.
     *
     * Address:
     * 7. xpath
     *         In chropath, create x-path to find the webElement
     *         By locatorUsingXpath = By.xpath("//xpath//to//element")
     *
     *
     */

    /**
     * XPATH
     *
     * Types:
     *  1. Absolute Xpath
     *      a) starts with single slash (/)
     *      b) tells the route of webElement from the root tag (or html tag)
     *      c) not reliable, if any webElement is going to be added/removed in/from the webpage,
     *      the absolute xpath might not work.
     *
     *  2. Relative Xpath
     *      a) starts with double slash (//)
     *      b) reliable bcz we find the webElement using their tag, attributes and/or text
     *
     *     -> simple xpath (direct xpath)
     *     -> advanced xpath (indirect xpath)
     *
     */

    /**
     * <tag1 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *     <tag1_1 id="abcd" data-text-id="unique data" attr3="value3" attr4="value4">
     *         <tag1_1_1>Not Unique Text
     *              <subTag attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag1>
     *         </tag1_1_1>
     *         <tag1_1_2 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag1_1_2>
     *              <subTag1 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag1>
     *
     *              <subTag2 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag2>
     *                  <subTag3 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</subTag3>
     *
     *         <tag1_1_3 attr1="value1" attr2="value2" attr3="value3" attr4="value4">Unique Text</tag1_1_3>
     *     </tag1_1>
     *     <tag1_2 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *         <tag1_2_1 attr1="value1" attr2="value2">Unique Text</tag>
     *     </tag1_2>
     *     <tag1_3 attr1="value1" attr2="value2" attr3="value3" attr4="value4">
     *          <tag1_3_1 attr1="value1" attr2="value2" attr3="value3" attr4="value4"></tag>
     *     </tag1_3>
     * </tag1>
     *
     */

    /**
     * Advanced Xpath (Indirect xpath):
     *
     * 1. Via parent/Grandparent tag
     *  eg:
     *      (//div[@class='selectric'])[1]//span
     *      ** upper massage is showing inside() is parent DIV, THEN INSIDE xpath #[1], SINGLE / AND WRITE SPAN
     *      ** THE PARENT DIV IS SHOWING ON WEBSITE - <div class="selectric" xpath="1"> == $0
     *                                  NEVER NEVER WRITE XPATH ON CODE
     *             CHILD IS SHOWING                 -   span class="label">'F.snbsp;mph</span>
     *
     *
     *      //div[@class='selectric-wrapper selectric-units selectric-below']//span[starts-with(text(), '˚F')]
     *      (//div[@id='header']//div[@class='options']//div[@class='selectric'])[1]//span
     *      //div[@id='header']//span[starts-with(text(), '˚F')]
     *
     * 2. Xpath Axes
     *
     *  1. following-sibling (LITTLE BROTHER)
     *  //tag[condition(s)]/following-sibling::tag2[condition(s)]
     *  eg:
     *  TO FIND RADIO BUTTON FOR FEMALE TYPE ON COREPATH - // //span[@data-name='gender_wrapper']   WILL GIVE U 3 OPTION
     *          ** TO FIND FEMALE - INSIDE () THEN //INPUT AND [1] - (//span[@data-name='gender_wrapper']/input)[1]
     *  //label[text()='Female']/following-sibling::*
     *  //label[text()='Female']/following-sibling::input  ** FOLLOWING SIBLING IS FORMULA
     *  //h2[text()='September 2021']/following-sibling::table//button[text()='25']
     *
     * 2. preceding-sibling - (BIG BROTHER)
     *  //tag[condition(s)]/preceding-sibling::tag2[condition(s)]
     *  eg:
     *  //select[@id='day'] - THIS WILL DAY RADIO BUTTON
     *          //select[@id='day']/preceding-sibling - ADDING / AND PRECEDING-SIBLING (BIG BROTHER)
     *  //select[@id='day']/preceding-sibling::select[@id='month']
     *          ADDING :: AND SELECT [@ID='MONTH'] - CODE IS SHOWING MONTH WILL APPEAR BEFORE DAY
     *
     *
     * 3. following
     *  //tag[condition(s)]/following::tag2[condition(s)]
     *  eg:
     *  ((//h2[text()='Hotel Royal Bora Bora'])[1]/following::button[text()='Book now'])[1]
     *
     *  eg: //h2[text()='September 2021']following-sibling::table//button[text()='25']
     *  **      GO TO h2= 'month 2021' (inside single quote), use following sibling :: find table //is grandparent, find button = 25
     *          THIS WILL GIVE US ANSWER SEPTEMBER 25TH 2021
     *
     * 4. preceding
     *  //tag[condition(s)]/preceding::tag2[condition(s)]
     *
     * 5. ancestor
     *  //tag[condition(s)]/ancestor::tag2[condition(s)]
     *
     * 6. descendant
     *  //tag[condition(s)]/descendant::tag2[condition(s)]
     *
     */









}