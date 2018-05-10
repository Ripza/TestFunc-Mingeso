import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejemplo {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testEjemplo() throws Exception {
    driver.get("http://usach.umovil.cl/#/");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/div[3]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/div[3]/div")).click();
    driver.findElement(By.id("search")).click();
    driver.findElement(By.id("search")).clear();
    driver.findElement(By.id("search")).sendKeys("518");
    driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/div/div/div/div[3]/div")).click();
    driver.findElement(By.xpath("//a[@id='btnft']/i")).click();
    String result = driver.findElement(By.xpath("//ul[@id='slide-out']/ul/li[2]/div")).getText();
    
    if (result.contains("518")){
      System.out.println("Valor encontrado");
    } else {
        fail("Valor no encontrado");
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
