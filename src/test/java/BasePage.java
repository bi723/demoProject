import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage  {
    private static final int TIMEOUT=5;
    private static final int POLLING=100;
    protected WebDriver driver;
    public Excel excel;

    public BasePage(WebDriver driver) throws Exception {
        excel = new Excel();
        excel.setExcelFile("src/test/Resources/Book1.xlsx","Sheet1");
        this.driver=driver;
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(driver,this);
    }
}
