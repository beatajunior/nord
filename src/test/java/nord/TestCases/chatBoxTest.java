package nord.TestCases;

import nord.Functions.WebUI;
import nord.Setup.BaseClass;

import org.testng.annotations.Test;

public class chatBoxTest extends BaseClass {

  @Test(description = "Test is checking, if it is possible to send a message in chatbox")
  public void chatBox() throws Exception {

    // Accept cookies
    WebUI.waitForElementPresent(Selectors.btn_acceptCookies, 10);

    WebUI.waitForElementClickable(Selectors.btn_acceptCookies, 10);

    Selectors.btn_acceptCookies.click();

    // Check, if chat button has "Chat with us" written on it
    WebUI.waitForElementVisible(Selectors.btn_chat, 5);

    WebUI.waitForElementClickable(Selectors.btn_chat, 5);

    WebUI.verifyElementText(Selectors.btn_chat, "Chat with us");

    // Click the chat button
    Selectors.btn_chat.click();

    // Check title of the opened window
    WebUI.waitForElementPresent(Selectors.frameChatbox, 5);
    driver.switchTo().frame(Selectors.frameChatbox);

    WebUI.waitForElementPresent(Selectors.widgetTitle, 5);

    WebUI.verifyElementText(Selectors.widgetTitle, "NordPass Live Chat");

    // Insert your name
    Selectors.input_nameChatbox.sendKeys("Kebabas");

    // Check, if inserted name is correct
    WebUI.verifyElementAttributeValue(Selectors.input_nameChatbox, "value", "Kebabas");

    // Insert email
    Selectors.input_emailChatbox.sendKeys("fzj23269@nezid.com");

    // Check, if inserted email is correct
    WebUI.verifyElementAttributeValue(Selectors.input_emailChatbox, "value", "fzj23269@nezid.com");

    // Check, if support is preselected for individual clients
    WebUI.verifyElementText(Selectors.input_supportType, "For individual clients");

    // Write a message
    Selectors.input_messageChatbox.sendKeys("Hello!");

    // Check, if the message is correct
    WebUI.verifyElementAttributeValue(Selectors.input_messageChatbox, "value", "Hello!");

    // Check, if the button has "Start chat" on it
    WebUI.verifyElementText(Selectors.btn_startChat, "Start chat");

    // Click the button
    Selectors.btn_startChat.click();

    // Check, if the message was sent
    WebUI.waitForElementPresent(Selectors.userMessage, 5);

    WebUI.verifyElementText(Selectors.userMessage, "Hello!");
  }

}
