package nord.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import nord.Setup.DriverSetup;

public class Selectors extends DriverSetup{

  @FindBy(css ="#cookie-consent [type = 'button']")
  public WebElement btn_acceptCookies;

  @FindBy(css ="[id = 'Premium Trial form hero - Try premium'] input")
  public WebElement input_email;

  @FindBy(css ="[id = 'Premium Trial form hero - Try premium'] form p")
  public WebElement messageAgree;

  @FindBy(css ="[id = 'Premium Trial form hero - Try premium'] p")
  public WebElement message;

  @FindBy(css ="[id = 'Premium Trial form hero - Try premium'] h1")
  public WebElement tryPremiumTitle;

  @FindBy(css ="[class = 'nord-container container'] h1")
  public WebElement pricingTableTitle;

  @FindBy(css ="[class ='swiper-wrapper'] [class='h-full block']")
  public WebElement firstColumn;

  @FindBy(css ="[id = 'Pricing Table - B2C Plans'] [href = '/try-premium/']")
  public WebElement btn_getStarted;

  @FindBy(css ="[data-testid = 'header-nav-pricing']")
  public WebElement btn_pricing;

  @FindBy(css ="[id = 'Premium Trial form hero - Try premium'] button")
  public WebElement btn_start;

  @FindBy(css ="[data-testid='alert']")
  public WebElement alert;

  @FindBy(css ="[id = '___gatsby'] button")
  public WebElement btn_chat;

  @FindBy(css ="#webWidget")
  public WebElement frameChatbox;

  @FindBy(css ="#widgetHeaderTitle")
  public WebElement widgetTitle;

  @FindBy(css ="[data-testid='scroll-container-content'] [name='name']")
  public WebElement input_nameChatbox;

  @FindBy(css ="[data-testid='scroll-container-content'] [name='email']")
  public WebElement input_emailChatbox;

  @FindBy(css ="[data-garden-id='dropdowns.faux_input']")
  public WebElement input_supportType;

  @FindBy(css ="[data-garden-id='forms.textarea']")
  public WebElement input_messageChatbox;

  @FindBy(css ="[data-testid='button-ok']")
  public WebElement btn_startChat;

  @FindBy(css ="[data-testid='chat-msg-user']")
  public WebElement userMessage;





















































}
