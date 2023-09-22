package nord.TestCases;

import nord.Functions.WebUI;
import nord.Setup.BaseClass;

import org.testng.annotations.Test;

public class freeTrialWithUsedEmailTest extends BaseClass {

  @Test(description = "Test tries to start a free trial with already used email. Warning message should appear.")
  public void freeTrialWithUsedEmail() throws Exception {

    // Accept cookies
    WebUI.waitForElementVisible(Selectors.btn_acceptCookies, 10);

    WebUI.waitForElementClickable(Selectors.btn_acceptCookies, 10);

    Selectors.btn_acceptCookies.click();

    // Click on "Pricing" button
    WebUI.waitForElementClickable(Selectors.btn_pricing, 10);

    Selectors.btn_pricing.click();

    // Check the title
    WebUI.waitForUrlValue("https://nordpass.com/plans/", 5);

    WebUI.waitForElementVisible(Selectors.pricingTableTitle, 5);

    WebUI.verifyElementText(Selectors.pricingTableTitle, "Get the plan that’s right for you");

    // Check the text of first column
    WebUI.verifyElementAttributeValue(Selectors.firstColumn, "innerText",
        "Free€0.0030-day Premium trial includedGet StartedNo credit card required1 user accountAutosave & AutofillSecurely store credit cards and notesStay logged in when switching devicesDetect weak, reused passwordsScan the web for data breachesAttach files to items");

    // Check, if the button has "Get Started" on it and click it
    WebUI.verifyElementText(Selectors.btn_getStarted, "Get Started");

    Selectors.btn_getStarted.click();

    // Check the title of a new page
    WebUI.waitForUrlValue("https://nordpass.com/try-premium/", 5);

    WebUI.waitForElementVisible(Selectors.tryPremiumTitle, 5);

    WebUI.verifyElementText(Selectors.tryPremiumTitle,
        "Get NordPass Free with 30-day Premium trial");

    // Check, if the message says "No credit card required."
    WebUI.waitForElementVisible(Selectors.message, 5);

    WebUI.verifyElementText(Selectors.message, "No credit card required.");

    // Check the info about privacy policy
    WebUI.waitForElementVisible(Selectors.messageAgree, 5);

    WebUI.verifyElementText(Selectors.messageAgree,
        "By starting the free trial, you agree to our Terms of Service and Privacy Policy.");

    // Insert email, that was already used for a free trial into email field (e.g.
    // fzj23269@nezid.com)
    WebUI.waitForElementVisible(Selectors.input_email, 5);

    Selectors.input_email.sendKeys("fzj23269@nezid.com");

    // Click "Get started" button
    WebUI.waitForElementClickable(Selectors.btn_start, 5);

    Selectors.btn_start.click();

    // Check, if alert appears
    WebUI.waitForElementPresent(Selectors.alert, 10);

    WebUI.verifyElementText(Selectors.alert, "Trial email already registered");

  }

}
