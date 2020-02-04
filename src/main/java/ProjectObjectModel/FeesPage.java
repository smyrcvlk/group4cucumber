package ProjectObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeesPage extends AbstractClass {
    private WebDriver driver ;

    public FeesPage(){
        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );
    }

    @FindBy(xpath="//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputFeeName;

    @FindBy(xpath = "//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement inputFeeCode;

//    @FindBy
//    private WebElement inputIntegrationCode;
//
    @FindBy(xpath = "//mat-dialog-container//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']//input")
    private WebElement inputFeePriority;

//
    public void typeInFeeName(String name) {
        sendkeysFunction(inputFeeName,name);
    }

    public void typeInFeeCode(String code) {
        sendkeysFunction(inputFeeCode,code);
    }
////
////    public void typeInIntegrationCode() {
////        sendkeysFunction(inputIntegrationCode);
////    }
////
    public void typeInFeePriority(String priority) {
        sendkeysFunction(inputFeePriority,priority);

    }
}