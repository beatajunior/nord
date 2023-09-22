package nord.Setup;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass extends SelectorsImport {

  @BeforeClass
  public void pageSetup()
  {
    System.out.println("--------STARTINSIM DRIVERI---------");
    DriverSetup.startDriver();
    System.out.println("--------STARTINOM DRIVERI---------");
  }

   @AfterClass
  public void closePage()
  {
    System.out.println("--------QUITINSIM DRIVERI---------");
    driver.quit();
    System.out.println("--------QUITINOM DRIVERI---------");

  }

}
