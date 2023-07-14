package hellocucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DANGKYpage {
    @FindBy(xpath = "//div[@class='_5633 _5634 _53ij']")
    public WebElement Loi;

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    public WebElement creat;
    @FindBy(name = "firstname")
    public WebElement Firstname;
    @FindBy(name = "lastname")
    public WebElement Surname;
    @FindBy(name = "reg_email__")
    public WebElement email1;
    @FindBy(name = "reg_email_confirmation__")
    public WebElement email2;
    @FindBy(name = "reg_passwd__")
    public WebElement password;
    @FindBy(name = "birthday_day")
    public WebElement day;
    @FindBy(name = "birthday_month")
    public WebElement month;
    @FindBy(name = "birthday_year")
    public WebElement year;
    @FindBy(xpath = "//label[normalize-space()='Female']")
    public WebElement Female;
    @FindBy(xpath = "//label[normalize-space()='Male']")
    public WebElement male;
    @FindBy(xpath = "//label[normalize-space()='Custom']")
    public WebElement custom;
    @FindBy(xpath = "//select[@id='js_6fp']")
    public WebElement selectcustom;
    @FindBy(xpath = "//input[@id='u_0_q_VI']")
    public WebElement inputcustom;
    @FindBy(name = "websubmit")
    public WebElement signup;
    @FindBy(xpath = "//div[@id='reg_error_inner']")
    public WebElement loipass;
    @FindBy(xpath = "//button[contains(text(),'Yes, Find My Account')]")
    public WebElement yes;
    @FindBy(xpath = "//span[contains(text(),'If this is you, we can help you log in. If not, you can create a new account.')]")
    public WebElement loiyes;
    @FindBy(xpath = "//a[@class='_42ft _5upp _50zy layerCancel _51-t _50-0 _50z-']")
    public WebElement X;
    @FindBy(xpath = "//div[contains(text(),'Please check your emails for a message with your code. Your code is 6 numbers long.')]")
    public WebElement pleasecheck;
    @FindBy(xpath = "//div[contains(text(),'Please choose a more secure password. It should be longer than 6 characters, unique to you and difficult for others to guess.')]")
    public WebElement loipass2;
    @FindBy(xpath = "//a[contains(text(),'No, Create New Account')]")
    public WebElement loipass3;
    public DANGKYpage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
