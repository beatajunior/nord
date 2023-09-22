package nord.Setup;

import org.openqa.selenium.support.PageFactory;

import nord.PageObjects.Selectors;


public class SelectorsImport extends DriverSetup {

  public Selectors Selectors = PageFactory.initElements(driver, Selectors.class);

}
