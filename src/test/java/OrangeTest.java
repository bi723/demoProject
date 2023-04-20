import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.HashMap;

public class OrangeTest extends BaseTest{
    @Test(priority = 0,dataProviderClass = Json.class,dataProvider = "dataProvider1")
    public void SauceTest1(HashMap<String ,String>hashMap) throws Exception {
        Orange sauce = new Orange(getDriver());
        sauce.Gettitletst();
        sauce.AdminTxt();
        sauce.AddClick();
        sauce.BoxSlct();
        sauce.ComboboxTst();
        sauce.BoxSlct2();
        sauce.ComboboxTst2();
//      sauce.driver.findElement(By.cssSelector("div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[type='password']")).sendKeys(hashMap.get("username"));
        sauce.UserNameTxt();
        sauce.PasswordTxt();
        sauce.ConfirmPw();
        sauce.EmplText();
        Thread.sleep(2000);
        sauce.clickEmpl();
        sauce.TestAdmin();
    }
}
