import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import org.json.simple.parser.JSONParser;

public class BaseTest {
    protected static Logger log = LogManager.getLogger();
    private WebDriver driver;
    private Excel excel;
    @BeforeSuite
    public void beforSuite() throws Exception {
        excel = new Excel();
        excel.setExcelFile("src/test/Resources/Book1.xlsx","Sheet1");
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(excel.getCellData("Username",1));
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(excel.getCellData("Password",1));
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }
    @AfterSuite
    public void afterSuite(){
        if(null!=driver){
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        return driver;
    }

}
