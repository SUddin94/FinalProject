package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

   public static WebDriver driver;

   public static String getPropertyValue(String propertyName){
       String propertyValue = "";
       try {
           InputStream inputStream = new FileInputStream("src/main/resources/info.properties");
           Properties properties = new Properties();
           properties.load(inputStream);
           propertyValue = properties.getProperty(propertyName);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return propertyValue;
   }

   public static WebDriver setDriver(){
       String browserValue = getPropertyValue("browser");

       switch (browserValue.toLowerCase().trim()){
           case "chrome":
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               break;
           case "firefox":
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               break;
           case "edge":
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
               break;
       }
       return driver;
   }


   @BeforeMethod
    public void browserSetup(){
       driver = setDriver();
       driver.navigate().to(getPropertyValue("url"));
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }

   @AfterMethod
    public void closeBrowser(){
       driver.close();
       driver.quit();
   }
}
