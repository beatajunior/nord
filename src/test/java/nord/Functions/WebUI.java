package nord.Functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import nord.Setup.DriverSetup;

public class WebUI extends DriverSetup{

  /*Checking, if the text of the element is the same as expected text
  * @param element - WebElement that should have text inside
  * @param text - String that has to be compared with text found inside WebElement
  */
  public static void verifyElementText(WebElement element, String text) {

    String actualText =  element.getText();
    Assert.assertEquals(actualText, text);
  }

  /*Checking, if the specific attribute value of the element is the same as expected
  * @param element - WebElement that should have necessary attribute
  * @param attributeName - String that is a name of the attribute that should have specific value
  * @param text - String that has to be compared with text found inside the attribute
  */
  public static void verifyElementAttributeValue(WebElement element, String attributeName, String text) {

    String attributeValue =  element.getAttribute(attributeName);
    Assert.assertEquals(attributeValue, text);
  }

  /*Wait for element to be clickable
  * @param element - WebElement that should be clickable
  * @param seconds - Integer saying how many seconds to wait for the element to be clickable
  */
  public static void waitForElementClickable(WebElement element, Integer seconds) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    wait.until(ExpectedConditions.elementToBeClickable(element));
  }

  /*Wait for element to be visible
  * @param element - Webelement that should be visible
  * @param seconds - Integer saying how many seconds to wait for the element to be visible
  */
  public static void waitForElementVisible(WebElement element, Integer seconds) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    wait.until(ExpectedConditions.visibilityOf(element));
  }

  /*Wait for element to be present in DOM of the page
  * @param element - Webelement that should be present
  * @param seconds - Integer saying how many seconds to wait for the element to be present
  */
  public static void waitForElementPresent(WebElement element, Integer seconds) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    String elem = "";
    String elementString = element.toString();
    // Cut webelement text and leave only selector
    if (elementString.contains("By.cssSelector: ")) {
      elem = elementString.split("By.cssSelector: ")[1];
      elem = elem.substring(0, elem.length() - 1);
    } else if (elementString.contains("-> css selector: ")) {
      elem = elementString.split("-> css selector: ")[1];
      elem = elem.substring(0, elem.length() - 1);
    } else {
      elem = element.toString();
    }

    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elem)));
  }

  /*Wait for specific url
  * @param url - String value of the url which should appear
  * @param seconds - Integer saying how many seconds to wait for the url
  */
  public static void waitForUrlValue(String url, Integer seconds) {

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
    wait.until(ExpectedConditions.urlToBe(url));
  }

}
