package nord.Setup;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {

  protected static WebDriver driver = WebDriverManager.chromedriver().create();

  public static void startDriver() {

    driver.get("https://nordpass.com/");
  }

}
