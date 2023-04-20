import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.Random;

import java.util.HashMap;

public class Orange extends BasePage {
//    String[] C={"Required","should hava at least 8 characters","Invalid","Should be at least 5 characters","Passwords do not match","Already exists"};
    @FindBy(how = How.CSS,using ="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)")
    private  WebElement Admin;
    @FindBy(how = How.XPATH,using = "//button[normalize-space()='Add']")
    private WebElement addbtn;
    @FindBy(how = How.XPATH,using ="//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]")
    private WebElement boxselect;
    @FindBy(how = How.XPATH, using = "//div[@role='listbox']//div[@role='option'][2]")
    private WebElement cickElm;
    @FindBy(how = How.XPATH,using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div")
    private WebElement boxselect2;
    @FindBy(how= How.XPATH, using = "//div[@role='listbox']//div[@role='option'][2]")
    private WebElement cliclElm2;
    @FindBy(how= How.XPATH, using ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private WebElement EmployeeNameTxt;

    @FindBy(how = How.XPATH,using = "//div[@role='listbox']")
    private WebElement listboxUser;

    @FindBy(how=How.XPATH, using ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")
    private  boolean MessageErrEmplName;

    @FindBy(how=How.CSS, using ="div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    private WebElement PassWord;

    @FindBy(how= How.CSS, using = "div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] span[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    private WebElement messageErrPassW;
    @FindBy(how = How.XPATH,using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement UserName;
    @FindBy(how = How.CSS,using = "#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > form > div:nth-child(1) > div > div:nth-child(4) > div > span")
    private WebElement MessageErrUserName;
    @FindBy(how = How.CSS,using = "div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")
    private WebElement ConfirmPassword;
    @FindBy(how = How.CSS, using = "div[class='oxd-form-row user-password-row'] div[class='oxd-grid-item oxd-grid-item--gutters'] span[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    private WebElement MessErrComfirmPassWord;
    @FindBy(how = How.CSS,using = "button[type='submit']")
    private WebElement BtnSave;
    public Orange(WebDriver driver) throws Exception {
        super(driver);
    }

    public void AdminTxt(){
        Admin.click();
    }
    public void AddClick(){
        addbtn.click();
    }
    public void BoxSlct(){
        boxselect.click();
    }
    public void ComboboxTst() throws InterruptedException {
        cickElm.click();
    }
    public void BoxSlct2(){
        boxselect2.click();
    }
    public void ComboboxTst2(){
        cliclElm2.click();
    }

    public void EmplText(){
        EmployeeNameTxt.sendKeys("test");
    }
    public void clickEmpl(){
        listboxUser.click();
    }
    public void PasswordTxt(){
        PassWord.sendKeys("Nhat2311@2000");
    }
    public void UserNameTxt(){
        UserName.sendKeys("Nhat21312");
    }
    public void ConfirmPw(){
        ConfirmPassword.sendKeys("Nhat2311@2000");
    }
    public void TestAdmin() {
        boolean MessErrEplName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")).isDisplayed();
        boolean MessageErrUserName = driver.findElement(By.xpath("//span[normalize-space()='Already exists']")).isDisplayed();
        boolean MessageErrPassWord = driver.findElement(By.cssSelector("div[class='oxd-grid-item oxd-grid-item--gutters user-password-cell'] span[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).isDisplayed();
        boolean MessageErrCfPassWord = driver.findElement(By.cssSelector("div[class='oxd-form-row user-password-row'] div[class='oxd-grid-item oxd-grid-item--gutters'] span[class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).isDisplayed();
        if (MessageErrUserName){
            driver.close();
        }else
            BtnSave.click();
    }



    public void Gettitletst(){
        driver.getTitle();
    }
}
